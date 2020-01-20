import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class AddBusDetails extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBusDetails frame = new AddBusDetails();
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
		textField_1.setText("");
		textField_2.setText("");
	}
	public AddBusDetails() {
		setTitle("Bus Details");
		setResizable(true);
		setIconifiable(true);
		setMaximizable(true);
		setBounds(0, 0, 600, 305);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Add Bus Details");
		lblNewLabel.setFont(new Font("FreeSans", Font.BOLD, 15));
		lblNewLabel.setBounds(235, 27, 120, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bus No");
		lblNewLabel_1.setFont(new Font("FreeSans", Font.BOLD, 15));
		lblNewLabel_1.setBounds(127, 90, 66, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setFont(new Font("FreeSans", Font.BOLD, 15));
		lblNewLabel_2.setBounds(127, 120, 66, 15);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setFont(new Font("FreeSans", Font.BOLD, 15));
		lblNewLabel_3.setBounds(127, 150, 100, 15);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(236, 88, 145, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 118, 145, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(236, 148, 145, 19);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bus_no=textField.getText();
				String source= textField_1.getText();
				String destination = textField_2.getText();
				try {
					
					//here code for adding the bus to database jdbc connection
					JOptionPane.showMessageDialog(AddBusDetails.this, "Bus Details Added");
					clearFields();
				}
				catch(Exception e) {
					System.out.println(e);
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("FreeSans", Font.BOLD, 15));
		btnNewButton.setBounds(155, 237, 114, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearFields();
			}
		});
		btnNewButton_1.setFont(new Font("FreeSans", Font.BOLD, 15));
		btnNewButton_1.setBounds(325, 237, 114, 25);
		getContentPane().add(btnNewButton_1);
		

	}
}
