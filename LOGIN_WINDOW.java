
import java.awt.Color;
import java.sql.PreparedStatement;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Md Aquib jawed
 */
public class LOGIN_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN_WINDOW
 */
    public LOGIN_WINDOW() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        jLabel_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estate3.jpg")));
        
        Border title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, color.RED);
        jLabel_Title.setBorder(title_border);
        
        Border appname_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black);
        jLabel_APP_Name.setBorder(appname_border);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_Username_Icon = new javax.swing.JLabel();
        jLabel_Password_Icon = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jLabel_APP_Name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_Login1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Image.setBackground(new java.awt.Color(255, 255, 51));
        jLabel_Image.setText("jLabel1");
        jLabel_Image.setOpaque(true);

        jLabel_Title.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Title.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(51, 255, 51));
        jLabel_Title.setText("LOGIN ");

        jLabel_Username_Icon.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Username_Icon.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_Username_Icon.setForeground(new java.awt.Color(255, 153, 0));
        jLabel_Username_Icon.setText("UserName");
        jLabel_Username_Icon.setOpaque(true);
        jLabel_Username_Icon.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jLabel_Username_IconAncestorRemoved(evt);
            }
        });
        jLabel_Username_Icon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel_Username_IconFocusLost(evt);
            }
        });

        jLabel_Password_Icon.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_Password_Icon.setForeground(new java.awt.Color(255, 153, 0));
        jLabel_Password_Icon.setText("Password");

        jTextField_Username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Username.setText("Username");
        jTextField_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusLost(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField1.setText("Password");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton_Login.setBackground(new java.awt.Color(0, 255, 51));
        jButton_Login.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(255, 102, 0));
        jButton_Login.setText("Login");
        jButton_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jLabel_APP_Name.setFont(new java.awt.Font("Bradley Hand ITC", 3, 75)); // NOI18N
        jLabel_APP_Name.setText("NAB GROUP");

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jLabel2.setText("Bring Life To Home");

        jButton_Login1.setBackground(new java.awt.Color(0, 255, 51));
        jButton_Login1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton_Login1.setForeground(new java.awt.Color(255, 102, 0));
        jButton_Login1.setText("Sign up");
        jButton_Login1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Login1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Login1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_Password_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Username_Icon))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_APP_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel_APP_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Username_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Password_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton_Login1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
       
        String username =jTextField_Username.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        
        PreparedStatement ps;
        ResultSet rs;
        
        String selectuery = "SELECT * FROM `users` WHERE `username` = ? AND password = ?";
        
        if(username.trim().toLowerCase().equals("username") || password.trim().toLowerCase().equals("password"))
        {
            JOptionPane.showMessageDialog(null, "ENTER YOUR Username AND Password ","Empty Field",2);
        }
        else
        {
            try {
                ps = THE_CONNECTION.getConnection().prepareStatement(selectuery);
                ps.setString(1, username);
                ps.setString(2, password);
                
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    //show the main form
                    MAIN_APP_WINDOW mainform = new MAIN_APP_WINDOW();
                    mainform.setVisible(true);
                    mainform.pack();
                    mainform.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    //to close the login window
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password","wrong data",2);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(LOGIN_WINDOW.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }
            
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusGained
        if(jTextField_Username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_Username.setText("");
            jTextField_Username.setForeground(color.black);
        }
        
    }//GEN-LAST:event_jTextField_UsernameFocusGained

    //jTextField_UsernameFocusLost is after the password feildLost
    
    private void jLabel_Username_IconFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel_Username_IconFocusLost
      
    }//GEN-LAST:event_jLabel_Username_IconFocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        String password = String.valueOf(jPasswordField1.getPassword());
        if(password.trim().toLowerCase().equals("password"))
        {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(color.black);
        }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        String password = String.valueOf(jPasswordField1.getPassword());
        if(password.trim().equals("") || password.trim().toLowerCase().equals("password"))
        {
           jPasswordField1.setText("Username");
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusLost
        // TODO add your handling code here:
        if(jTextField_Username.getText().trim().equals("") || jTextField_Username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_Username.setText("Username");
            jTextField_Username.setForeground(color.black);
        }
    }//GEN-LAST:event_jTextField_UsernameFocusLost

    private void jLabel_Username_IconAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel_Username_IconAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Username_IconAncestorRemoved

    private void jButton_Login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Login1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Login1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOGIN_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LOGIN_WINDOW().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Login;
    private javax.swing.JButton jButton_Login1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_APP_Name;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Password_Icon;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JLabel jLabel_Username_Icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
