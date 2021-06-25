import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ManageStorage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldStorageType;
	private JTextField textFieldLocation;
	private JTextField textFieldPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageStorage frame = new ManageStorage();
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
	public ManageStorage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenu menu = new AdminMenu(); //calling another frame/window
				menu.setModalExclusionType(null);
				menu.setVisible(true);
				dispose();
			}
		});
		backButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		backButton.setBackground(Color.WHITE);
		backButton.setBounds(10, 11, 77, 30);
		contentPane.add(backButton);
		
		JLabel lblManageStorage = new JLabel("Manage Storage");
		lblManageStorage.setForeground(Color.WHITE);
		lblManageStorage.setFont(new Font("Dialog", Font.BOLD, 35));
		lblManageStorage.setBounds(223, 33, 294, 44);
		contentPane.add(lblManageStorage);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(36, 88, 617, 137);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Normal storage","90","Kuala Selangor, Sungai Besar, Bidor"},
				{"Double storey storage","110","Batu Pahat, Kulai, Kuala Langat"},
				{"Storage with freezer","130","Setia Alam, Kampar, Jeram"}
			},
			new String[] {
				"Storage Type", "Price Per Day", "Location"
			}
		));
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		scrollPane_1.setViewportView(table);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(153, 255, 255));
		contentPane_1.setBounds(36, 250, 617, 149);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Storage Type");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(117, 15, 141, 27);
		contentPane_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Price Per Day");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(117, 64, 125, 27);
		contentPane_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Location");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(117, 115, 89, 27);
		contentPane_1.add(lblNewLabel_1_1_1_1);
		
		textFieldStorageType = new JTextField();
		textFieldStorageType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldStorageType.setColumns(10);
		textFieldStorageType.setBounds(268, 11, 212, 31);
		contentPane_1.add(textFieldStorageType);
		
		textFieldLocation = new JTextField();
		textFieldLocation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldLocation.setColumns(10);
		textFieldLocation.setBounds(268, 111, 212, 31);
		contentPane_1.add(textFieldLocation);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(268, 60, 212, 31);
		contentPane_1.add(textFieldPrice);
		
		JLabel lblNewLabel_1_1_2 = new JLabel(":");
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(245, 15, 26, 27);
		contentPane_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel(":");
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_2_1.setBounds(245, 64, 26, 27);
		contentPane_1.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel(":");
		lblNewLabel_1_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_2_2.setBounds(245, 115, 26, 27);
		contentPane_1.add(lblNewLabel_1_1_2_2);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						textFieldStorageType.getText(),
						textFieldPrice.getText(),
						textFieldLocation.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.setBounds(78, 405, 143, 38);
		contentPane.add(btnAdd);
	}
}
