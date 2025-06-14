package level3;
import java.util.*;

public class Compute_Grades {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int Physics=sc.nextInt();
		int Chemistry = sc.nextInt();
		int maths=sc.nextInt();
		int total = (Physics+Chemistry+maths);
		double avg=total/3.0;
		String Grade="";
		  String level = "";
	      String remarks = "";
	      if (avg >= 80) {
	    	  Grade="A";
	            level = "Level 4";
	            remarks = "Above agency-normalized standards";
	        } 
	      else if (avg >= 70) {
	    	  	Grade="B";
	            level = "Level 3";
	            remarks = "At agency-normalized standards";
	        } 
	      else if (avg >= 60) {
	    	  	Grade="C";
	            level = "Level 2";
	            remarks = "Below, but approaching agency-normalized standards";
	        }
	      else if (avg >= 50) {
	    	  	Grade="D";
	            level = "Level 1";
	            remarks = "Well below agency-normalized standards";
	        } 
	      else if (avg >= 40) {
	    	  	Grade="E";
	            level = "Level 1-";
	            remarks = "Too below agency-normalized standards";
	        } 
	      else {
	    	  	Grade="R";
	        
	            remarks = "Remedial standards";
	        }

	        
	        System.out.println("\n--- Result ---");
	        System.out.println("Average Marks: " + avg + "%");
	        System.out.println("Grades: " + Grade);
	        System.out.println("Remarks: " +level+ " " +remarks);

		

	}

}
