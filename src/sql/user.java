package sql;

import java.sql.*;

public class user {
    Connection con = null;
    public user(Connection con) {
        this.con = con;
    }

    public void createTable() {
        try {
            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE Userlogin ("
            		+ "role varchar(20), username  varchar(20) NOT NULL,email varchar(50) NOT NULL,password  varchar(20) NOT NULL,\r\n"
            		+ "	primary key (email)\r\n"
            		+ ");";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}