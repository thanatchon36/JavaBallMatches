import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GUI extends JFrame {
	
	JTable table;
	
	public GUI() {

	}

	public GUI(String[][] data) {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		
		String[] columnNames = {"ID", "First Name", "Last Name", "Qualification", "Number of allocated matches", "Home Localities", "Willingness"};
		
		table = new JTable(data, columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500, 200));
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
	}
}
