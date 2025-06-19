package level2;
import java.util.*;

public class VotingEligibility {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] report = evaluateVotingEligibility(ages);
        displayTable(report);
    }
	public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // ensures age between 10 and 99
        }
        return ages;
    }
	
	 public static String[][] evaluateVotingEligibility(int[] ages) {
	        String[][] result = new String[ages.length][2];
	        for (int i = 0; i < ages.length; i++) {
	            result[i][0] = String.valueOf(ages[i]);
	            if (ages[i] < 0) {
	                result[i][1] = "false";
	            } else {
	                result[i][1] = ages[i] >= 18 ? "true" : "false";
	            }
	        }
	        return result;
	    }
	 
	public static void displayTable(String[][] table) {
        System.out.println("\nStudent\tAge\tCan Vote");
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            System.out.println((i + 1) + "\t" + table[i][0] + "\t" + table[i][1]);
        }
    }

}
