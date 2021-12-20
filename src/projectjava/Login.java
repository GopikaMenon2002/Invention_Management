package projectjava;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import sql.check;

import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	
	Connection con;
	JFrame frame;
	private JTextField txtJ;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public Login(Connection con) {
		this.con =con;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,650, 500);
		frame.getContentPane().setBackground(Color.PINK);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrInventorId = new JTextArea();
		txtrInventorId.setTabSize(90);
		txtrInventorId.setFont(new Font("Modern No. 20", Font.BOLD, 17));
		txtrInventorId.setBackground(new Color(70, 130, 180));
		txtrInventorId.setForeground(Color.BLACK);
		txtrInventorId.setText("Email");
		txtrInventorId.setBounds(268, 138, 96, 22);
		frame.getContentPane().add(txtrInventorId);
		
		txtJ = new JTextField();
		txtJ.setForeground(Color.BLACK);
		txtJ.setBounds(399, 138, 96, 22);
		frame.getContentPane().add(txtJ);
		txtJ.setColumns(10);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setText("Password");
		txtrPassword.setFont(new Font("Modern No. 20", Font.BOLD, 17));
		txtrPassword.setBackground(new Color(70, 130, 180));
		txtrPassword.setForeground(Color.BLACK);
		txtrPassword.setBounds(268, 177, 96, 22);
		frame.getContentPane().add(txtrPassword);
		
		JTextArea txtrLogIn = new JTextArea();
		txtrLogIn.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		txtrLogIn.setText("Log In");
		txtrLogIn.setBackground(new Color(70, 130, 180));
		txtrLogIn.setBounds(339, 59, 96, 37);
		frame.getContentPane().add(txtrLogIn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(399, 177, 96, 22);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.out.println("Login Event");
		            String Email = txtJ.getText();
		            String Password = passwordField.getText();

		            if (Email.equals("") || Password.equals("")) {
		                JOptionPane.showMessageDialog(null, "Please fill all the fields");
		            } else {
		                String query = "select * from Userlogin where email = '" + Email + "' and password = '" + Password + "' and role='Viewer'";
		                String query2 = "select * from Userlogin where email = '" + Email + "' and password = '" + Password + "' and role='Jury Member'";
		                String query3 = "select * from Userlogin where email = '" + Email + "' and password = '" + Password + "' and role='Inventor'";

		                check check = new check(con);
		                if (check.checking(query))
		                {
		                    ViewerDetails form = new ViewerDetails(con);
		                    form.frame.setVisible(true);
		                    frame.dispose();
		                    
		                }
		                else if(check.checking(query2))
		                {
		                	JuryDetails form = new JuryDetails(con);
		                    form.frame.setVisible(true);
		                    frame.dispose();
		                }
		                else if(check.checking(query3))
		                {
		                	site form = new site(con);
		                    form.frame.setVisible(true);
		                    frame.dispose();
		                }
		                
		                else
		                {
		                    JOptionPane.showMessageDialog(null, "Login Failed");
		                }
		            }

		        }

			
			
		});
		btnNewButton_1.setFont(new Font("Modern No. 20", Font.BOLD, 13));
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setBounds(331, 273, 104, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\srila\\Downloads\\Screenshot award .png"));
		lblNewLabel.setBounds(0, -15, 793, 487);
		frame.getContentPane().add(lblNewLabel);
		frame.setBounds(100, 100, 807, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
