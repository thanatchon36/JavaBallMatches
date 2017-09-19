import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JFrame;

public class Functionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Referee> referees = new ArrayList<Referee>();
		Readfile r = new Readfile();
		r.openFile();
		referees = r.readFile();
		r.closeFile(); 
		
		for(Referee ref: referees) {
			System.out.printf("%s %s %s %s %s %s %s\n", ref.getId(), ref.getFirstName(), ref.getLastName(), ref.getQualification(), ref.getNoOfMatchesAllocated(), ref.getHomeLocalities(), ref.getWillingness());	
		}
		
		//Collections.sort(referees, referee.com);
		
        Collections.sort(referees, new Comparator<Referee>() {
            public int compare(Referee one, Referee another) {
                return one.getId().compareToIgnoreCase(another.getId());
            }
        });		
		
		
		//START GUI
		String[][] data = new String[12][7];
		int row = 0;
		int column;
		for(Referee ref: referees) {
			column = 0;
			data[row][column]= ref.getId();
			column++;
			data[row][column]= ref.getFirstName();
			column++;
			data[row][column]= ref.getLastName();
			column++;
			data[row][column]= ref.getQualification();
			column++;
			data[row][column]= ""+ref.getNoOfMatchesAllocated();
			column++;
			data[row][column]= ref.getHomeLocalities();
			column++;
			data[row][column]= ref.getWillingness();
			column++;	
			row++;
		}
		
		/*
		GUI gui = new GUI(data);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(600,600);
		gui.setVisible(true);
		gui.setTitle("Java Ball Matches");
		*/
		
		//END GUI
		
		for(Referee ref: referees) {
			System.out.printf("%s %s %s %s %s %s %s\n", ref.getId(), ref.getFirstName(), ref.getLastName(), ref.getQualification(), ref.getNoOfMatchesAllocated(), ref.getHomeLocalities(), ref.getWillingness());	
		}		
		
		Window window = new Window(data);
		window.frame.setVisible(true);
		

		

	}

}
