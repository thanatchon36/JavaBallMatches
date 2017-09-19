import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class Window {

	JFrame frame;
	private JTextField txtWeekNo;

	/**
	 * Create the application.
	 */

	public Window(String[][] data) {
		// TODO Auto-generated constructor stub
		initialize(data);
	}



	/**
	 * Initialize the contents of the frame.
	 * @param data 
	 */
	private void initialize(String[][] data) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtWeekNo = new JTextField();
		txtWeekNo.setText("Week No.");
		txtWeekNo.setBounds(6, 6, 70, 26);
		frame.getContentPane().add(txtWeekNo);
		txtWeekNo.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(6, 44, 70, 27);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(6, 83, 70, 27);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnAllocate = new JButton("Allocate");
		btnAllocate.setBounds(6, 122, 79, 29);
		frame.getContentPane().add(btnAllocate);
		
		JLabel lblAllocatedReferees = new JLabel("Allocated Referees");
		lblAllocatedReferees.setBounds(15, 163, 122, 16);
		frame.getContentPane().add(lblAllocatedReferees);
		
		JLabel lblFirstReferee = new JLabel("First Referee");
		lblFirstReferee.setBounds(15, 191, 122, 16);
		frame.getContentPane().add(lblFirstReferee);
		
		JLabel lblSecondReferee = new JLabel("Second Referee");
		lblSecondReferee.setBounds(15, 219, 122, 16);
		frame.getContentPane().add(lblSecondReferee);
		
	}
}
