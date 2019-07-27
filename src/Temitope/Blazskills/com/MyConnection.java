
package Temitope.Blazskills.com;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class MyConnection {
    
    public static Connection getcoConnection(){
        
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/java_login_register", "root", "");
             }catch(Exception ex) {
             System.out.println(ex.getMessage());
             }
        return con;
    }
    
}
