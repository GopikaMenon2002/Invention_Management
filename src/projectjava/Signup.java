package projectjava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;

import sql.user;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signup {

	JFrame frame;
	private JTextField txtSignUp;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	Connection con;
	public Signup(Connection con) {
		this.con =con;
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtSignUp = new JTextField();
		txtSignUp.setText(" Sign Up");
		txtSignUp.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		txtSignUp.setBackground(new Color(70, 130, 180));
		txtSignUp.setBounds(242, 67, 126, 49);
		frame.getContentPane().add(txtSignUp);
		txtSignUp.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(323, 158, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setFont(new Font("Modern No. 20", Font.BOLD, 17));
		txtrEmail.setText("E-mail");
		txtrEmail.setBackground(new Color(70, 130, 180));
		txtrEmail.setBounds(201, 206, 62, 19);
		frame.getContentPane().add(txtrEmail);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setFont(new Font("Modern No. 20", Font.BOLD, 17));
		txtrName.setText("Name");
		txtrName.setBackground(new Color(70, 130, 180));
		txtrName.setBounds(201, 155, 62, 22);
		frame.getContentPane().add(txtrName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(323, 209, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrSignupFor = new JTextArea();
		txtrSignupFor.setFont(new Font("Modern No. 20", Font.BOLD, 15));
		txtrSignupFor.setText("Signup For:");
		txtrSignupFor.setBackground(new Color(70, 130, 180));
		txtrSignupFor.setBounds(201, 250, 83, 22);
		frame.getContentPane().add(txtrSignupFor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Viewer", "Inventor", "Jury Member"}));
		comboBox.setFont(new Font("Modern No. 20", Font.BOLD, 17));
		comboBox.setBounds(323, 251, 96, 21);
		frame.getContentPane().add(comboBox);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setFont(new Font("Modern No. 20", Font.BOLD, 16));
		txtrPassword.setText("Password");
		txtrPassword.setBackground(new Color(70, 130, 180));
		txtrPassword.setBounds(201, 306, 83, 19);
		frame.getContentPane().add(txtrPassword);
		
		JTextArea txtrReenterPassword = new JTextArea();
		txtrReenterPassword.setFont(new Font("Modern No. 20", Font.BOLD, 13));
		txtrReenterPassword.setText("Re-enter Password");
		txtrReenterPassword.setBackground(new Color(70, 130, 180));
		txtrReenterPassword.setBounds(201, 352, 107, 22);
		frame.getContentPane().add(txtrReenterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(323, 308, 96, 19);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(323, 352, 96, 19);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setFont(new Font("Modern No. 20", Font.BOLD, 15));
		btnNewButton.setBounds(201, 465, 96, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Modern No. 20", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setBounds(358, 465, 96, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SignUp");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Signup Event");
	            String User = textField.getText();
	            String Password = passwordField.getText();
	            String conPassword = passwordField_1.getText();
	            String Email = textField_1.getText();
	            String Role= (String) comboBox.getSelectedItem();

	            if (Password.equals(conPassword)) {
	                try {
	                    String query = "select * from Userlogin where email = ?";
	                    PreparedStatement pst = con.prepareStatement(query);
	                    pst.setString(1, Email);
	                    ResultSet rs = pst.executeQuery();
	                    if (rs.next()) {
	                        JOptionPane.showMessageDialog(null, "Email already exists");
	                        return;
	                    }
	                    query = "insert into Userlogin values('" + Role + "','"
	                            + User + "','" + Email + "','" +Password+ "')";
	                    con.createStatement().executeUpdate(query);
	                    JOptionPane.showMessageDialog(null, "Sign Up Successful");
	                    Login lp = new Login(con);
	                    lp.frame.setVisible(true);
	                    frame.dispose();
	                } catch (SQLException e1) {
	                    e1.printStackTrace();
	                    user createUserTable = new user(con);
	                    createUserTable.createTable();
	                    JOptionPane.showMessageDialog(null, "Table Created. Try Again");

	                } catch (Exception e1) {
	                    JOptionPane.showMessageDialog(null, "User already exists");
	                }
	            }
	            else
	            {
                    JOptionPane.showMessageDialog(null, "Password Incorrect");

	            }
	            }
			
		});
		btnNewButton_2.setBounds(266, 400, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
