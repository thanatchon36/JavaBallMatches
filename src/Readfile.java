import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Readfile {
	
	private Scanner x;
	
	public void openFile() {
		try {
			x = new Scanner(new File("RefereesIn.txt"));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public ArrayList<Referee> readFile() {
		
		ArrayList<Referee> referees = new ArrayList<Referee>();
		Referee referee = null;
		
		 while(x.hasNext()) {
			 String id = x.next();
			 String firstName = x.next();
			 String lastName = x.next();
			 String qualification = x.next();
			 String noOfMatchesAllocated = x.next();
			 String homeLocalities = x.next();
			 String willingness = x.next();
			 
				referee = new Referee();
				referee.setId(id);
				referee.setFirstName(firstName);
				referee.setLastName(lastName);
				referee.setQualification(qualification);
				referee.setNoOfMatchesAllocated(Integer.parseInt(noOfMatchesAllocated));
				referee.setHomeLocalities(homeLocalities);
				referee.setWillingness(willingness);
				
				referees.add(referee);
			 //System.out.printf("%s %s %s %s %s %s %s\n", id, firstName, lastName, qualification, noOfMatchesAllocated, homeLocalities, willingness);
		 }
		 
		 return referees;
	}
	
	public void closeFile() {
		x.close();
	}

}
