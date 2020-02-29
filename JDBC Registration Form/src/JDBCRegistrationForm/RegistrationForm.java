
package JDBCRegistrationForm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Walid CHEKKOURI
 */
public class RegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationForm
     */
    public RegistrationForm()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlName = new javax.swing.JLabel();
        jlLogin = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jtfLogin = new javax.swing.JTextField();
        jbAddUser = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtUsersInfo = new javax.swing.JTable();
        jcbProfil = new javax.swing.JComboBox<String>();
        jlPassword = new javax.swing.JLabel();
        jtfPassword = new javax.swing.JPasswordField();
        jbListUsers = new javax.swing.JButton();
        jlProfil = new javax.swing.JLabel();
        jbDeleteUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jlName.setText("Nom");

        jlLogin.setText("Login");

        jtfName.setText("UserName");

        jtfLogin.setText("UserLogin");

        jbAddUser.setText("Add User");
        jbAddUser.setToolTipText("");
        jbAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddUserActionPerformed(evt);
            }
        });

        jtUsersInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nom", "Login", "Profil"
            }
        ));
        jScrollPane2.setViewportView(jtUsersInfo);

        jcbProfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Professor", "Director", "Student" }));

        jlPassword.setText("Password");

        jtfPassword.setText("password");

        jbListUsers.setText("List Users");
        jbListUsers.setToolTipText("");
        jbListUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListUsersActionPerformed(evt);
            }
        });

        jlProfil.setText("Profil");

        jbDeleteUser.setText("Delete User");
        jbDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jcbProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfName)
                            .addComponent(jtfLogin)
                            .addComponent(jtfPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbListUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlName)
                            .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlLogin)
                            .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPassword)
                            .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlProfil))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAddUser)
                            .addComponent(jbDeleteUser)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbListUsers)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddUserActionPerformed
        String name = jtfName.getText();
        String login = jtfLogin.getText();
        String password = jtfPassword.getPassword().toString();
        int profile = jcbProfil.getSelectedIndex();
        
        User user1 = new User(name, login, password, profile );
        
           
      //  DefaultTableModel model = (DefaultTableModel)jtUsersInfo.getModel();
        //add user info to the table
      //  model.addRow(new String[]{name,login, password,profile+""}); 
      //  jtUsersInfo.setModel(model);
        
        
        
      boolean res=  user1.addUser();
       //  if user is added successfully
       if (res)
       {
            jbListUsersActionPerformed(evt);
            JOptionPane.showMessageDialog(this,  "User addes successfully ", "Congrats", JOptionPane.NO_OPTION);
       }
       else
        JOptionPane.showMessageDialog(this,  "Error adding User! ", "ERROR", JOptionPane.ERROR);

       
        
    }//GEN-LAST:event_jbAddUserActionPerformed

    private void jbListUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListUsersActionPerformed
        // TODO add your handling code here:
        
        updateTable();
    }//GEN-LAST:event_jbListUsersActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         updateTable();
    }//GEN-LAST:event_formWindowOpened

    private void jbDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteUserActionPerformed
       int selectedRow = jtUsersInfo.getSelectedRow();
       
       //get user id from selected row
       int userId = Integer.parseInt(jtUsersInfo.getModel().getValueAt( selectedRow, 0).toString());
      if(userId != -1)//if a row is indeed selected
      {
         boolean res= User.deleteUser(userId);
         if(res)
              JOptionPane.showMessageDialog(this,  "User deleted successfully ", "Congrats", JOptionPane.NO_OPTION);
     else
             JOptionPane.showMessageDialog(this,  "Error deleting User! ", "ERROR", JOptionPane.ERROR);
      }
          
       
    }//GEN-LAST:event_jbDeleteUserActionPerformed

    public void updateTable()
    {
    ResultSet res = null;
        
        String req = "SELECT * FROM tbl_users";

         try
        {

            Connection cnx =  DBConnection.connect();
            Statement stmt = cnx.createStatement();
            
            res = stmt.executeQuery(req);
            
            //create a new model for our JTable, it receives its data from a method in Utility Class
            DefaultTableModel monModel = Utility.buildTableModel(res);
            jtUsersInfo.setModel(monModel);

        }catch (SQLException ex)
        {
            System.err.println("PConnection Problem!");
        }
    
    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                
                
                new RegistrationForm().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAddUser;
    private javax.swing.JButton jbDeleteUser;
    private javax.swing.JButton jbListUsers;
    private javax.swing.JComboBox<String> jcbProfil;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlProfil;
    private javax.swing.JTable jtUsersInfo;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfName;
    private javax.swing.JPasswordField jtfPassword;
    // End of variables declaration//GEN-END:variables
}
