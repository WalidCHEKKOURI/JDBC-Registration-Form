package JDBCRegistrationForm;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static int connectionCounter=0;
    public static java.sql.Connection conn = null;

	// Empty Constructor
	DBConnection(){}
	
	public static java.sql.Connection connect() throws SQLException
        {
                if(connectionCounter ==0 )
                {
                    try{
                        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/JavaDB?" +
                                "user=root&password=");
                        connectionCounter++;
                    } 
                    catch (SQLException e) {
                        System.out.println("SQLException: " + e.getMessage());
                        System.out.println("SQLState: "     + e.getSQLState());
                        System.out.println("VendorError: "  + e.getErrorCode());
                    }
                }
		return conn;
	}
}
