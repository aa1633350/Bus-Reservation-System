import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private String a_name;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AdminLogin Page");
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
		
		btnNewButton = new JButton("Login");  //admin login hai ye 
		btnNewButton.addActionListener(new ActionListener() {
			
			//abhi database coonectivity ka code aayega yahan pe
			
			public void actionPerformed(ActionEvent arg0) {
				
				a_name= textField.getText();
				String a_pass = passwordField.getText();
				JOptionPane.showMessageDialog(AdminLogin.this,"Welcome "+a_name +" Haan Pata hai Abhi JDBC coonection nahi hua hai");
				//dispose();
				AdminControlPanel alp = new AdminControlPanel(a_name);
				alp.setLocationRelativeTo(null);
				alp.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 15));
		btnNewButton.setBounds(191, 225, 114, 25);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 15));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 15));
		btnNewButton_1.setBounds(327, 225, 114, 25);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("UserLogin");
		btnNewButton_2.setFont(new Font("Serif", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				UserControlPanel ucp = new UserControlPanel();
				ucp.setLocationRelativeTo(null);
				ucp.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(250, 287, 130, 25);
		contentPane.add(btnNewButton_2);

	}
	
	

}
