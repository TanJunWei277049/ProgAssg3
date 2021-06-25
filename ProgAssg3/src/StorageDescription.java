import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StorageDescription extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StorageDescription frame = new StorageDescription();
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
	public StorageDescription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 51, 153)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(27, 115, 617, 137);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Storage Type", "Price Per Day", "Location"
			}
		));
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		scrollPane_1.setViewportView(table);
		
		JLabel lblStorageDescription = new JLabel("Storage Description");
		lblStorageDescription.setForeground(Color.BLACK);
		lblStorageDescription.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblStorageDescription.setBounds(144, 11, 438, 60);
		contentPane.add(lblStorageDescription);
		
		JTable t = ManageStorage.getTable();
		String type;
		String price;
		String location;
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		for(int i = 0; i<t.getRowCount(); i++) {
			type = String.valueOf(t.getValueAt(i, 0));
			price = String.valueOf(t.getValueAt(i, 1));
			location = String.valueOf(t.getValueAt(i, 2));
			
			model.addRow(new Object[]{
					type,
					price,
					location,
			});
			
		}
		
	}

}
