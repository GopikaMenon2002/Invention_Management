package projectjava;

import java.awt.EventQueue;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage {

	JFrame frame;
	Connection con;

	
	public MainPage(Connection con) {
		this.con=con;
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 636, 463);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               
				try {

	                Login form = new Login(con);
	                form.frame.setVisible(true);
	                frame.dispose();
	            } catch (Exception e1) {
	                JOptionPane.showMessageDialog(null, e1.getMessage());
	            }
			}
		});
		btnNewButton.setBounds(218, 228, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.dispose();
				try {

	                Signup form = new Signup(con);
	                form.frame.setVisible(true);
	            } catch (Exception e2) {
	                JOptionPane.showMessageDialog(null, e2.getMessage());
	            }
			}
		});
		btnSignUp.setBounds(325, 228, 85, 21);
		panel.add(btnSignUp);
		
		JLabel lblNewLabel = new JLabel("INVENTION MANAGEMENT SYSTEM");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewLabel.setBounds(178, 115, 280, 21);
		panel.add(lblNewLabel);
	}
}
