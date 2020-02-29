
package JDBCRegistrationForm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Walid CHEKKOURI
 */


public class User {
    
    public int id; 
    public String name, login, password;
    public int profil; 

    public User(int id, String nom, String login, String password, int profil)
    {
        this.id = id;
        this.name = nom;
        this.login = login;
        this.password = password;
        this.profil = profil;
    }
    public User( String nom, String login, String password, int profil)
    {
        
        this.name = nom;
        this.login = login;
        this.password = password;
        this.profil = profil;
    }

    public User() {}
    
    //Adding a user t our DB
    public boolean addUser()
    {
          boolean isUserAdded = false;

        try {
            String req = "INSERT INTO tbl_users VALUES (null, ?, ?, ?, ?)";
            // Establish a connection with the database
            Connection cnx = DBConnection.connect();
            
            // creating a statement
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1,this.name);
            ps.setString(2, this.login);
            ps.setString(3, this.password);
            ps.setInt(4, this.profil);
            
            //executing an update
            int state = ps.executeUpdate();
            if (state == 1)
                   isUserAdded = true; 
            
        } catch (SQLException ex)
        {
               System.out.println("Error adding user! "+ex.getMessage());
        }
         return isUserAdded;
    }
    
    
    //Remvoing a user from our DB based on his id
      public static boolean deleteUser(int id)
      {
          boolean res = false;

        try {
            String req = "DELETE FROM tbl_users WHERE id = ?";
            // establish a connection with the DB
            Connection cnx = DBConnection.connect();
            // create a statement
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1,id);

            //execute an update
            int state = ps.executeUpdate();
            
            if (state == 1)
                   res = true; 
            
        } catch (SQLException ex)
        {
               System.out.println("error deleting user! "+ex.getMessage());
        }
         return res;
    }
    
}
