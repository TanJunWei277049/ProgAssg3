import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField UsernameTextField;
	private JPasswordField passwordField;

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
		setBounds(100, 100, 655, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 153));
		panel.setBounds(0, 0, 639, 420);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblNewLabel.setBounds(200, 40, 255, 60);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(42, 160, 160, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(42, 244, 160, 30);
		panel.add(lblNewLabel_2);
		
		UsernameTextField = new JTextField();
		UsernameTextField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		UsernameTextField.setBounds(200, 159, 255, 31);
		panel.add(UsernameTextField);
		UsernameTextField.setColumns(10);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.setBackground(Color.WHITE);
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UsernameTextField.setText("");
				passwordField.setText("");
			}
		});
		ResetButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		ResetButton.setBounds(108, 336, 123, 46);
		panel.add(ResetButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(UsernameTextField.getText().equals("Tan") && passwordField.getText().equals("abc123")) {
						JOptionPane.showMessageDialog(null, "Login Successful");
						
						AdminMenu menu = new AdminMenu(); //calling another frame/window
						menu.setModalExclusionType(null);
						menu.setVisible(true);
						dispose();
					
					}
					else
						JOptionPane.showMessageDialog(null, "Login unsuccessful!", "Error", JOptionPane.ERROR_MESSAGE);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and password");
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setBounds(381, 336, 123, 46);
		panel.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 244, 255, 30);
		panel.add(passwordField);
		
		JButton backButton = new JButton("Back");
		backButton.setBackground(Color.WHITE);
		backButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cover cover = new Cover(); //calling another frame/window
				cover.setModalExclusionType(null);
				cover.setVisible(true);
				dispose();
				
			}
		});
		backButton.setBounds(10, 11, 77, 30);
		panel.add(backButton);
	}
}
