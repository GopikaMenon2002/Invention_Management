package projectjava;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class jurylogin {

	private JFrame frame;
	private JTextField txtJuryLogIn;
	private JTextField txtJuryId;
	private JTextField textField;
	private JTextField txtPassword;
	private JPasswordField passwordField;
	private JTextField txtLicenseCode;
	private JPasswordField passwordField_1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jurylogin window = new jurylogin();
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
	public jurylogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 854, 582);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtJuryLogIn = new JTextField();
		txtJuryLogIn.setHorizontalAlignment(SwingConstants.LEFT);
		txtJuryLogIn.setText("Jury Log In");
		txtJuryLogIn.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		txtJuryLogIn.setBackground(new Color(70, 130, 180));
		txtJuryLogIn.setBounds(249, 33, 166, 44);
		frame.getContentPane().add(txtJuryLogIn);
		txtJuryLogIn.setColumns(10);
		
		txtJuryId = new JTextField();
		txtJuryId.setText("Jury Id");
		txtJuryId.setFont(new Font("Modern No. 20", Font.BOLD, 17));
		txtJuryId.setBackground(new Color(70, 130, 180));
		txtJuryId.setBounds(198, 118, 96, 19);
		frame.getContentPane().add(txtJuryId);
		txtJuryId.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(323, 119, 119, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Modern No. 20", Font.BOLD, 17));
		txtPassword.setText("Password");
		txtPassword.setBackground(new Color(70, 130, 180));
		txtPassword.setBounds(198, 162, 96, 19);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(323, 163, 119, 19);
		frame.getContentPane().add(passwordField);
		
		txtLicenseCode = new JTextField();
		txtLicenseCode.setText("License Code");
		txtLicenseCode.setFont(new Font("Modern No. 20", Font.BOLD, 17));
		txtLicenseCode.setBackground(new Color(70, 130, 180));
		txtLicenseCode.setBounds(198, 204, 96, 19);
		frame.getContentPane().add(txtLicenseCode);
		txtLicenseCode.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(323, 205, 119, 19);
		frame.getContentPane().add(passwordField_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me");
		chckbxNewCheckBox.setFont(new Font("Modern No. 20", Font.BOLD, 12));
		chckbxNewCheckBox.setBackground(new Color(70, 130, 180));
		chckbxNewCheckBox.setBounds(198, 256, 119, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(198, 257, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Modern No. 20", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(70, 130, 180));
		btnNewButton.setBounds(210, 314, 107, 26);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Forgot Password");
		btnNewButton_1.setFont(new Font("Modern No. 20", Font.BOLD, 13));
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setBounds(351, 314, 132, 26);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\srila\\Downloads\\Screenshot award .png"));
		lblNewLabel.setBounds(0, 0, 840, 545);
		frame.getContentPane().add(lblNewLabel);
	}

}
