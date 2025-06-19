package level2;
import java.util.*;

public class CalculateGrades {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generatePCMScores(n);
        double[][] stats = calculateStats(scores);
        String[] grades = assignGrades(stats);

        displayScorecard(scores, stats, grades);
    }
	
	public static int[][] generatePCMScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(41) + 60;
            scores[i][1] = rand.nextInt(41) + 60; 
            scores[i][2] = rand.nextInt(41) + 60;
        }
        return scores;
    }
	
	public static double[][] calculateStats(int[][] marks) {
        int students = marks.length;
        double[][] stats = new double[students][3]; // [][0]=total, [][1]=average, [][2]=percentage

        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = total / 3.0;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }
	 public static String[] assignGrades(double[][] stats) {
	        String[] grades = new String[stats.length];

	        for (int i = 0; i < stats.length; i++) {
	            double percent = stats[i][2];
	            if (percent >= 80) grades[i] = "A";
	            else if (percent >= 70) grades[i] = "B";
	            else if (percent >= 60) grades[i] = "C";
	            else if (percent >= 50) grades[i] = "D";
	            else if (percent >= 40) grades[i] = "E";
	            else grades[i] = "R";
	        }
	        return grades;
	    }
	  public static void displayScorecard(int[][] marks, double[][] stats, String[] grades) {
	        System.out.println("\nScorecard");
	        System.out.println();
	        System.out.println("Stu#\tPhy\tChem\tMath\tTotal\tAvg\t%age\tGrade");
	        System.out.println();

	        for (int i = 0; i < marks.length; i++) {
	            System.out.printf("%-5d\t%-4d\t%-4d\t%-4d\t%-5.0f\t%-5.2f\t%-5.2f\t%s\n",
	                    (i + 1),
	                    marks[i][0], marks[i][1], marks[i][2],
	                    stats[i][0], stats[i][1], stats[i][2],
	                    grades[i]);
	        }

	        System.out.println();
	    }

}
