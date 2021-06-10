
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Md Aquib jawed
 */
public class P_CLIENT {
    
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    
    public int getId()
    {
        return this.id;
        
    }
    
    public void setId(int ID)
    {
        this.id = ID;
        
    }
    
    public String getFname()
    {
        return this.firstName;
    }
    
    public void setFName(String FNAME)
    {
        this.firstName = FNAME;
    }
    
    public String getLname()
    {
        return this.lastName;
    }
    
    public void setLName(String LNAME)
    {
        this.lastName = LNAME;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public void setPhone(String PHONE)
    {
        this.phone = PHONE;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void setEmail(String EMAIL)
    {
        this.email = EMAIL;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setAddress(String ADDRESS)
    {
        this.address = ADDRESS;
    }
    
    public P_CLIENT(){}
    
    public P_CLIENT(int ID, String FNAME, String LNAME, String PHONE, String EMAIL, String ADDRESS)
    {
        this.id = ID;
        this.firstName = FNAME;
        this.lastName = LNAME;
        this.phone = PHONE;
        this.email = EMAIL;
        this.address = ADDRESS;
        
    }
    //creating a function to add a new client
    //creating a owner in the database
    
    public boolean addNewClient(P_CLIENT client)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `property_client`(`fname`, `lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
                
        try {
            ps = THE_CONNECTION.getConnection().prepareStatement(addQuery);
            ps.setString(1, client.getFname());
            ps.setString(2, client.getLname());
            ps.setString(3, client.getPhone());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getAddress());
            
            return (ps.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    //creating a function to edit the selected owner data.
    public boolean editClientData(P_CLIENT client)
    {
         PreparedStatement ps;
        
        String editQuery = "UPDATE `property_client` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?";
                
        try {
            ps = THE_CONNECTION.getConnection().prepareStatement(editQuery);
            ps.setString(1, client.getFname());
            ps.setString(2, client.getLname());
            ps.setString(3, client.getPhone());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getAddress());
            ps.setInt(6, client.getId());
            
            return (ps.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    //creating a function to delete the selected owner
    public boolean deleteOwner(int ownerId)
    {
        PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `property_client` WHERE `id`=?";
                
        try {
            ps = THE_CONNECTION.getConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, ownerId);
            
            return (ps.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //create a function to return an arraylist of Owners
    public ArrayList<P_CLIENT> ownerList()
    {
        ArrayList<P_CLIENT> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `property_client`";
        
        try {
            st = THE_CONNECTION.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            P_CLIENT owner;
            
            while(rs.next())
            {
                owner = new P_CLIENT(rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getString(6));
                
                list.add(owner);
            }
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
}
