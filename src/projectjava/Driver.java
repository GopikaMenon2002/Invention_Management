package projectjava;

import java.sql.Connection;

import javax.swing.JOptionPane;

import sql.connection;
import java.sql.*;

public class Driver {
    public static void main(String[] args) {
        String username = "postgres";
        String password = "Rtgs123*";
        String url = "jdbc:postgresql://localhost:5432/project";

        connection connect = new connection(username, password, url);
        Connection con = connect.getConnection();

        try {
            MainPage form = new MainPage(con);
            form.frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}