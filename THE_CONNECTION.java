
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Md Aquib jawed
 */
public class THE_CONNECTION 
{
    
    private static String servername = "localhost";
    private static String dbname = "aquib_rst_db";
    private static String username = "root";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    
    public static Connection getConnection()
    {
       Connection connection = null;
       
       MysqlDataSource datasource = new MysqlDataSource();
       
       datasource.setServerName(servername);
       datasource.setUser(username);
       datasource.setDatabaseName(dbname);
       datasource.setPortNumber(portnumber);
       datasource.setPassword(password);
       
        try 
        {
            connection = (Connection) datasource.getConnection();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(THE_CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return connection;
    }
    
    
    
}
