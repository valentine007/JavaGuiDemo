import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame1 {

	private JFrame frame;
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
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.setBounds(163, 86, 164, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 33, 56, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblAsin = new JLabel("ASIN:");
		lblAsin.setBounds(10, 58, 46, 14);
		frame.getContentPane().add(lblAsin);
		
		textField = new JTextField();
		textField.setBounds(66, 8, 261, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 30, 261, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 55, 261, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
