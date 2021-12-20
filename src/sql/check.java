package sql;

import java.sql.*;

public class check {
    Connection con = null;
    public check(Connection con) {
        this.con = con;
    }

    public boolean checking(String query){
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}