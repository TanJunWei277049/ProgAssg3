import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class RegistrationSystem extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField NameTextField;
	private JTextField AddressTextField;
	private JTextField AgeTextField;
	private JTextField PhoneTextField;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationSystem frame = new RegistrationSystem();
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
	public RegistrationSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 870, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 10, 847, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(21, 27, 791, 73);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Add Drop Registration System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(62, 11, 704, 51);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1.setBounds(21, 111, 252, 304);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(20, 52, 62, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(20, 127, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Age");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(20, 77, 62, 14);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Gender");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2.setBounds(20, 102, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_2);
		
		NameTextField = new JTextField();
		NameTextField.setFont(new Font("Tahoma", Font.BOLD, 11));
		NameTextField.setColumns(10);
		NameTextField.setBounds(100, 49, 127, 20);
		panel_1_1.add(NameTextField);
		
		AddressTextField = new JTextField();
		AddressTextField.setFont(new Font("Tahoma", Font.BOLD, 11));
		AddressTextField.setColumns(10);
		AddressTextField.setBounds(100, 124, 127, 20);
		panel_1_1.add(AddressTextField);
		
		AgeTextField = new JTextField();
		AgeTextField.setFont(new Font("Tahoma", Font.BOLD, 11));
		AgeTextField.setColumns(10);
		AgeTextField.setBounds(100, 71, 127, 20);
		panel_1_1.add(AgeTextField);
		
		PhoneTextField = new JTextField();
		PhoneTextField.setFont(new Font("Tahoma", Font.BOLD, 11));
		PhoneTextField.setColumns(10);
		PhoneTextField.setBounds(100, 152, 127, 20);
		panel_1_1.add(PhoneTextField);
		
		JComboBox GenderSel = new JComboBox();
		GenderSel.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Male", "Female"}));
		GenderSel.setFont(new Font("Tahoma", Font.BOLD, 11));
		GenderSel.setBounds(98, 99, 129, 20);
		panel_1_1.add(GenderSel);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Phone");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1.setBounds(20, 155, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_2.setBackground(new Color(176, 224, 230));
		panel_1_2.setBounds(21, 426, 791, 87);
		panel.add(panel_1_2);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						NameTextField.getText(),
						AgeTextField.getText(),
						GenderSel.getSelectedItem(),
						AddressTextField.getText(),
						PhoneTextField.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
				
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 23, 146, 38);
		panel_1_2.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NameTextField.setText("");
				AgeTextField.setText("");
				GenderSel.setSelectedItem("Make a selection");
				AddressTextField.setText("");
				PhoneTextField.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(166, 23, 146, 38);
		panel_1_2.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(479, 23, 146, 38);
		panel_1_2.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Membership Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(635, 23, 146, 38);
		panel_1_2.add(btnExit);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrint.setBounds(326, 23, 146, 38);
		panel_1_2.add(btnPrint);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_3.setBackground(new Color(176, 224, 230));
		panel_1_3.setBounds(283, 111, 529, 241);
		panel.add(panel_1_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 509, 219);
		panel_1_3.add(scrollPane_1);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 9));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "Gender", "Address", "Phone"
			}
		));
		
		
		scrollPane_1.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\Win 8\\eclipse-workspace\\ProgAssg3\\src\\AddDrop.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpload.setBounds(463, 363, 146, 38);
		panel.add(btnUpload);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(NameTextField.getText(),i,0);
			    	model.setValueAt(AgeTextField.getText(),i,1);
			    	model.setValueAt(GenderSel.getSelectedItem(),i,2);
			    	model.setValueAt(AddressTextField.getText(),i,3);
			    	model.setValueAt(PhoneTextField.getText(),i,4);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(283, 363, 146, 38);
		panel.add(btnUpdate);
	}
}

