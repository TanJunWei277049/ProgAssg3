import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu frame = new AdminMenu();
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
	public AdminMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(153, 255, 255));
		contentPane_1.setBounds(23, 11, 642, 102);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("Welcome To Admin Portal");
		lblNewLabel.setForeground(new Color(0, 51, 153));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 45));
		lblNewLabel.setBounds(30, 11, 602, 80);
		contentPane_1.add(lblNewLabel);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_1.setBackground(new Color(153, 255, 255));
		contentPane_1_1.setBounds(23, 130, 642, 316);
		contentPane.add(contentPane_1_1);
		
		JButton btnAdvertisement = new JButton("Manage Advertisement");
		btnAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdvertisement.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnAdvertisement.setBounds(339, 38, 240, 60);
		contentPane_1_1.add(btnAdvertisement);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin ad = new AdminLogin(); //calling another frame/window
				ad.setModalExclusionType(null);
				ad.setVisible(true);
				dispose();
			}
		});
		btnLogOut.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnLogOut.setBounds(208, 215, 240, 60);
		contentPane_1_1.add(btnLogOut);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee employee = new Employee(); //calling another frame/window
				employee.setModalExclusionType(null);
				employee.setVisible(true);
				dispose();
			}
		});
		btnEmployee.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnEmployee.setBounds(25, 130, 240, 60);
		contentPane_1_1.add(btnEmployee);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance finance = new Finance(); //calling another frame/window
				finance.setModalExclusionType(null);
				finance.setVisible(true);
				dispose();
			}
		});
		btnFinance.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnFinance.setBounds(339, 130, 240, 60);
		contentPane_1_1.add(btnFinance);
		
		JButton btnManageStorage = new JButton("Manage Storage");
		btnManageStorage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageStorage manageStorage = new ManageStorage(); //calling another frame/window
				manageStorage.setModalExclusionType(null);
				manageStorage.setVisible(true);
				dispose();
			}
		});
		btnManageStorage.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnManageStorage.setBounds(25, 38, 240, 60);
		contentPane_1_1.add(btnManageStorage);
	}
}
