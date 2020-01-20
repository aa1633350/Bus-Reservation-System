import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;

public class AdminControlPanel extends JFrame {

	private JPanel contentPane;
	private String name;
	//private AdminLogin al;
	JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminControlPanel frame = new AdminControlPanel();
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
	
	public AdminControlPanel(String name1) {
		this.name=name1;
		initialize();
		String value = (lblNewLabel.getText()).toUpperCase();
		lblNewLabel.setText(value + ": " + name1);
		
		
	}
	public AdminControlPanel() {
		
		initialize();
	}
	
	
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("FreeSerif", Font.BOLD, 15));
		lblNewLabel.setBounds(390, 14, 170, 15);
		contentPane.add(lblNewLabel);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 30, 600, 305);
		contentPane.add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Bus Time");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Bus Fare");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Add Bus Fare");
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Edit Bus Fare");
		mnNewMenu_1.add(mntmNewMenuItem_9);
		
		JMenu mnNewMenu_2 = new JMenu("Manage Admin");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Add Admin");
		mnNewMenu_2.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Edit Admin");
		mnNewMenu_2.add(mntmNewMenuItem_16);
		
		JMenu mnNewMenu_3 = new JMenu("Employee");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Add Employee");
		mnNewMenu_3.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Edit Employee");
		mnNewMenu_3.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Delete Employee");
		mnNewMenu_3.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("All Employee");
		mnNewMenu_3.add(mntmNewMenuItem_13);
	
		JMenuItem mntmNewMenuItem = new JMenuItem("Add Bus Time");
		mntmNewMenuItem.setBounds(10, 0, 127, 19);
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK)); // (int keycode,int modifier)
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Edit Bus Time");
		mntmNewMenuItem_1.setBounds(10, 15, 127, 19);
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Delete Bus Time");
		mntmNewMenuItem_2.setBounds(22, 108, 127, 19);
		mnNewMenu.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("All Bus Time");
		mntmNewMenuItem_3.setBounds(0, 66, 127, 19);
		mnNewMenu.add(mntmNewMenuItem_3);
		mntmNewMenuItem_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
		
		JMenu mnNewMenu_4 = new JMenu("Booking");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Booking Details");
		mnNewMenu_4.add(mntmNewMenuItem_14);
		
		JMenu mnNewMenu_5 = new JMenu("Manage Bus");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Add Bus Deatils"); //jab add bus details pr click hoga tab desktop pane main add bus details ki interal window khuleegi 
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddBusDetails abd= new AddBusDetails();
				desktopPane.add(abd);
				abd.show();
				
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Edit Bus Details ");
		mnNewMenu_5.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Delete Bus Details");
		mnNewMenu_5.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("All Bus Details");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_6 = new JMenu("Report");
		menuBar.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Between Date");
		mnNewMenu_6.add(mntmNewMenuItem_17);
		
	}
}
