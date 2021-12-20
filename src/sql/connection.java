package sql;
import java.sql.*;

public class connection {
    String UserName, Password, url;
    
    public connection(String UserName, String Password, String url) {
        this.UserName = UserName;
        this.Password = Password;
        this.url = url;
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, UserName, Password);
            System.out.println("Connected\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}