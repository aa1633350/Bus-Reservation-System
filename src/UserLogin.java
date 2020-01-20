import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void clearFields() {
		textField.setText("");
		passwordField.setText("");
	}
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserLogin Page");
		lblNewLabel.setBounds(250, 12, 130, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(62, 66, 80, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(62, 138, 80, 15);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(181, 63, 124, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 132, 124, 25);
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			
			//database coonectivity ka code yahan bhi aayega check kro ki credentials sahi hai ya nahi
			public void actionPerformed(ActionEvent arg0) {
				String u_name= textField.getText();
				String pass = passwordField.getText();
				JOptionPane.showMessageDialog(UserLogin.this,"Welcome "+u_name+" Haan Pata hai Abhi JDBC coonection nahi hua hai");
				dispose();
				UserControlPanel ucp = new UserControlPanel();
				ucp.setVisible(true);
				ucp.setLocationRelativeTo(null);
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 15));
		btnNewButton.setBounds(191, 225, 114, 25);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearFields();
			}
		});
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 15));
		btnNewButton_1.setBounds(367, 225, 114, 25);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Create Account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				NewUser nu= new NewUser();
				nu.setLocationRelativeTo(null);
				nu.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Serif", Font.BOLD, 15));
		btnNewButton_2.setBounds(248, 292, 170, 25);
		contentPane.add(btnNewButton_2);
	}

}
