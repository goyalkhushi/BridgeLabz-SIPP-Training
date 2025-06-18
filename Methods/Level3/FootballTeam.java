package level3;
import java.util.*;

public class FootballTeam {

	public static void main(String[] args) {
		
		int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // range 150 to 250
        }

        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Player Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nSum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Shortest: " + shortest);
        System.out.println("Tallest: " + tallest);
	}

	 static int findSum(int[] arr) {
	        int sum = 0;
	        for (int val : arr) sum += val;
	        return sum;
	    }

	    static double findMean(int sum, int count) {
	        return (double) sum / count;
	    }
	    static int findShortest(int[] arr) {
	        int min = arr[0];
	        for (int val : arr) if (val < min) min = val;
	        return min;
	    }

	    static int findTallest(int[] arr) {
	        int max = arr[0];
	        for (int val : arr) if (val > max) max = val;
	        return max;
	    }
}
