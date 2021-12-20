package projectjava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.sql.Connection;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class site {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	Connection con;

	
	public site(Connection con) {
		this.con = con;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(65, 105, 225));
		frame.setBounds(100, 100, 902, 618);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(957, 0, -100, 478);
		frame.getContentPane().add(textPane);
		
		JTextArea txtrInventionDetails = new JTextArea();
		txtrInventionDetails.setBackground(new Color(65, 105, 225));
		txtrInventionDetails.setFont(new Font("Modern No. 20", Font.BOLD, 20));
		txtrInventionDetails.setText("INVENTION DETAILS");
		txtrInventionDetails.setBounds(323, 30, 219, 22);
		frame.getContentPane().add(txtrInventionDetails);
		
		JTextArea txtrNameOfInvention = new JTextArea();
		txtrNameOfInvention.setText("NAME OF INVENTION :");
		txtrNameOfInvention.setBackground(new Color(65, 105, 225));
		txtrNameOfInvention.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		txtrNameOfInvention.setBounds(114, 108, 148, 22);
		frame.getContentPane().add(txtrNameOfInvention);
		
		textField = new JTextField();
		textField.setBounds(338, 108, 126, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea txtrYearOfInvention = new JTextArea();
		txtrYearOfInvention.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		txtrYearOfInvention.setBackground(new Color(65, 105, 225));
		txtrYearOfInvention.setText("YEAR OF INVENTION :");
		txtrYearOfInvention.setBounds(114, 151, 148, 22);
		frame.getContentPane().add(txtrYearOfInvention);
		
		textField_1 = new JTextField();
		textField_1.setBounds(339, 151, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrInventorName = new JTextArea();
		txtrInventorName.setBackground(new Color(65, 105, 225));
		txtrInventorName.setText("INVENTOR NAME :");
		txtrInventorName.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		txtrInventorName.setBounds(114, 199, 126, 22);
		frame.getContentPane().add(txtrInventorName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(338, 199, 96, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea txtrDescription = new JTextArea();
		txtrDescription.setBackground(new Color(65, 105, 225));
		txtrDescription.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		txtrDescription.setText("DESCRIPTION :");
		txtrDescription.setBounds(114, 246, 97, 22);
		frame.getContentPane().add(txtrDescription);
		
		textField_3 = new JTextField();
		textField_3.setBounds(338, 246, 96, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(245, 314, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\srila\\Downloads\\Screenshot award .png"));
		lblNewLabel.setBounds(0, 0, 888, 581);
		frame.getContentPane().add(lblNewLabel);
	}
}
