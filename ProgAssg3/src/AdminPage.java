import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class AdminPage extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTotalIncome;
	private JTextField textFieldEmploySalary;
	private JTextField textFieldMaintenanceFee;
	private JTextField textFieldUtilityFee;
	private JTextField textFieldAdvertFee;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 714, 470);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Finance", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 153));
		panel_2.setBounds(0, 0, 709, 442);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Financial Report");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel.setBounds(204, 0, 294, 44);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 255, 255));
		panel_3.setBounds(10, 46, 689, 385);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblMonth.setBounds(10, 11, 90, 33);
		panel_3.add(lblMonth);
		
		JComboBox month = new JComboBox();
		month.setFont(new Font("Tahoma", Font.PLAIN, 15));
		month.setModel(new DefaultComboBoxModel(new String[] {"Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		month.setBounds(199, 16, 114, 25);
		panel_3.add(month);
		
		JLabel lblTotalSales = new JLabel("Total Income");
		lblTotalSales.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblTotalSales.setBounds(10, 55, 136, 33);
		panel_3.add(lblTotalSales);
		
		textFieldTotalIncome = new JTextField();
		textFieldTotalIncome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldTotalIncome.setBounds(199, 60, 114, 24);
		panel_3.add(textFieldTotalIncome);
		textFieldTotalIncome.setColumns(10);
		
		JLabel lblEmployeeSalary = new JLabel("Employee Salary");
		lblEmployeeSalary.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblEmployeeSalary.setBounds(10, 99, 182, 33);
		panel_3.add(lblEmployeeSalary);
		
		JLabel lblMaintenanceFee = new JLabel("Maintenance Fee");
		lblMaintenanceFee.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblMaintenanceFee.setBounds(10, 147, 182, 33);
		panel_3.add(lblMaintenanceFee);
		
		JLabel lblUtilityFee = new JLabel("Utility Fee");
		lblUtilityFee.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblUtilityFee.setBounds(10, 191, 136, 33);
		panel_3.add(lblUtilityFee);
		
		textFieldEmploySalary = new JTextField();
		textFieldEmploySalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldEmploySalary.setColumns(10);
		textFieldEmploySalary.setBounds(199, 104, 114, 24);
		panel_3.add(textFieldEmploySalary);
		
		textFieldMaintenanceFee = new JTextField();
		textFieldMaintenanceFee.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldMaintenanceFee.setColumns(10);
		textFieldMaintenanceFee.setBounds(199, 152, 114, 24);
		panel_3.add(textFieldMaintenanceFee);
		
		textFieldUtilityFee = new JTextField();
		textFieldUtilityFee.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldUtilityFee.setColumns(10);
		textFieldUtilityFee.setBounds(199, 196, 114, 24);
		panel_3.add(textFieldUtilityFee);
		
		JLabel lblAdvertisingFee = new JLabel("Advertising Fee");
		lblAdvertisingFee.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblAdvertisingFee.setBounds(10, 235, 182, 33);
		panel_3.add(lblAdvertisingFee);
		
		textFieldAdvertFee = new JTextField();
		textFieldAdvertFee.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldAdvertFee.setColumns(10);
		textFieldAdvertFee.setBounds(199, 244, 114, 24);
		panel_3.add(textFieldAdvertFee);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				month.setSelectedItem("Select Month");
				textFieldTotalIncome.setText("");
				textFieldEmploySalary.setText("");
				textFieldMaintenanceFee.setText("");
				textFieldUtilityFee.setText("");
				textFieldAdvertFee.setText("");
			}
		});
		btnReset.setFont(new Font("Rockwell", Font.BOLD, 25));
		btnReset.setBounds(11, 319, 161, 40);
		panel_3.add(btnReset);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double totalExpense = Integer.parseInt(textFieldEmploySalary.getText())
									+ Integer.parseInt(textFieldMaintenanceFee.getText())
									+ Integer.parseInt(textFieldUtilityFee.getText())
									+ Integer.parseInt(textFieldAdvertFee.getText());
				
				double profit = Integer.parseInt(textFieldTotalIncome.getText())- totalExpense;
				
				textArea.setText("       FINANCIAL REPORT \n"
						+"---------------------------------\n"
						+"Month\t        : "+ month.getSelectedItem()
						+"\nTotal Income    : "+textFieldTotalIncome.getText()+"\n"
						+"\nTotal Expenses\t\n"
						+"Employee Salary : "+textFieldEmploySalary.getText()+"\n"
						+"Maintenance Fee : "+textFieldMaintenanceFee.getText()+"\n"
						+"Utility Fee     : "+textFieldUtilityFee.getText()+"\n"
						+"Advertising Fee : "+textFieldAdvertFee.getText()+"\n"
						+"\t\t  "+totalExpense+"\n"
						+"\t\t ________"
						+"\nNet Profit\t: "+profit);
				
				
			}
		});
		btnCalculate.setFont(new Font("Rockwell", Font.BOLD, 25));
		btnCalculate.setBounds(199, 319, 168, 40);
		panel_3.add(btnCalculate);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 15));
		textArea.setBounds(416, 18, 263, 301);
		panel_3.add(textArea);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Employee", null, panel_1, null);
		panel_1.setLayout(null);
	}
}
