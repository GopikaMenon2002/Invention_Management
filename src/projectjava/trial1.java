package projectjava;

import java.awt.EventQueue;
import java.beans.Statement;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JTable;

import javax.swing.JScrollPane;

public class trial1 {

	private JFrame frame;
	private JTable table;

	public void print_table(String tablename, String databasename, JTable table) {
		Connection con = null;
		Statement stmt = null;
		Statement stmt1 = null;
		String final_amount;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + databasename, "postgres",
					"admin");
			stmt = con.createStatement();
			stmt1 = con.createStatement();
			// String sql1 = "delete from Store where store_username = 'Ram';";
			String sql = "select * from " + tablename + ";";

			ResultSet res = stmt1.executeQuery(sql);

			table.setModel(DbUtils.resultSetToTableModel(res));

			stmt.close();
			if (con != null) {
				System.out.println("Connected");
			}

		} catch (Exception es) {
			System.out.println(es.getMessage());

		}

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trial1 window = new trial1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public trial1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 546, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 82, 412, 230);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		print_table("Jurylogin","project",table);

	}
}

