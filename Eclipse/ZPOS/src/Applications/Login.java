package Applications;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import MySQLConnection.MySQLConnection;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Color;


public class Login
{

	public JFrame frame;
	private JTextField userName;
	private JPasswordField passwordField;

	/**
	 * Create the application.
	 */
	public Login()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame("ZPOS Login");
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(29, 63, 70, 15);
		frame.getContentPane().add(lblLogin);
		
		userName = new JTextField();
		userName.setToolTipText("Enter your user name");
		userName.setText("admin");
		userName.setBounds(128, 61, 114, 19);
		frame.getContentPane().add(userName);
		userName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(29, 132, 100, 15);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setToolTipText("Default Password is: 111111");
		passwordField.setBounds(128, 130, 114, 19);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ****** 
				String uname = userName.getText();
				char[] temp = passwordField.getPassword();
				String password = String.copyValueOf(temp);
				// Zero out the password
				Arrays.fill(temp, '0');
				
				MySQLConnection myConn = new MySQLConnection(uname, password);	
				
				
			}
		});
		btnLogin.setBounds(29, 214, 117, 25);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ******
				userName.setText("admin");
			}
		});
		btnReset.setBounds(158, 214, 117, 25);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ******
				System.exit(0);
			}
		});
		btnExit.setBounds(287, 214, 117, 25);
		frame.getContentPane().add(btnExit);
		
		final JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.setBackground(Color.PINK);
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (chckbxShowPassword.isSelected())
				{
					passwordField.setEchoChar((char)0);
				} else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxShowPassword.setBounds(250, 130, 117, 18);
		frame.getContentPane().add(chckbxShowPassword);
	}
}