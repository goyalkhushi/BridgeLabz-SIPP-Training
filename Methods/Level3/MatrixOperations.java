package level3;
import java.util.*;

public class MatrixOperations {

	 public static void main(String[] args) {
	       
		 
		 	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of students: ");
	        int num = sc.nextInt();

	        int[][] scores = generateScores(num);
	        double[][] results = calculateResults(scores);

	        displayScorecard(scores, results);

	       
	    }
	
	    
	    public static int[][] generateScores(int n) {
	        Random rand = new Random();
	        int[][] scores = new int[n][3]; // 3 subjects: P, C, M

	        for (int i = 0; i < n; i++) {
	            scores[i][0] = rand.nextInt(51) + 50; // Physics (50-100)
	            scores[i][1] = rand.nextInt(51) + 50; // Chemistry
	            scores[i][2] = rand.nextInt(51) + 50; // Math
	        }

	        return scores;
	    }

	    
	    public static double[][] calculateResults(int[][] scores) {
	        int n = scores.length;
	        double[][] results = new double[n][3]; 

	        for (int i = 0; i < n; i++) {
	            int total = scores[i][0] + scores[i][1] + scores[i][2];
	            double avg = total / 3.0;
	            double percent = (total / 300.0) * 100;

	            results[i][0] = Math.round(total * 100.0) / 100.0;
	            results[i][1] = Math.round(avg * 100.0) / 100.0;
	            results[i][2] = Math.round(percent * 100.0) / 100.0;
	        }

	        return results;
	    }


	    public static void displayScorecard(int[][] scores, double[][] results) {
	        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
	        System.out.println("------------------------------------------------------------------");

	        for (int i = 0; i < scores.length; i++) {
	            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f\n",
	                i + 1, scores[i][0], scores[i][1], scores[i][2],
	                results[i][0], results[i][1], results[i][2]);
	        }
	    }

	   

}
