
package littlebookhaven;

import java.sql.*;

public class DBConnection {
    
    private static final String username = "root";
    private static final String password = "";
    private static final String dataConn = "jdbc:mysql://localhost:3306/littlebookhaven";
    
    private DBConnection() {}
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            conn = DriverManager.getConnection(dataConn, username, password);
        } catch (Exception ex) {
            System.out.println("Database connection failed: " + ex.getMessage());
        }
        return conn;
    }
}
