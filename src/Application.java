import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Font f = new Font("Serif",Font.BOLD,14);
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton adminLogin = new JButton("Admin Login");
		adminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AdminLogin ai= new AdminLogin();
				ai.setLocationRelativeTo(null);
				ai.setVisible(true);
			}
		});
		adminLogin.setBounds(100, 179, 135, 25);
		adminLogin.setFont(new Font("FreeSans", Font.BOLD, 15));
		frame.getContentPane().add(adminLogin);
		
		JButton user_login = new JButton("User Login");
		user_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserLogin ui = new UserLogin();
				ui.setLocationRelativeTo(null);
				ui.setVisible(true);
			}
		});
		user_login.setFont(new Font("FreeSans", Font.BOLD, 15));
		user_login.setBounds(340, 179, 135, 25);
		frame.getContentPane().add(user_login);
		
		JLabel lblNewLabel = new JLabel("Bus Reservation Application");
		lblNewLabel.setFont(new Font("FreeSans", Font.BOLD, 18));
		lblNewLabel.setBounds(170, 36, 250, 25);
		frame.getContentPane().add(lblNewLabel);
		
	}
}
