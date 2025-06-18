package level2;
import java.util.*;
public class Youngest_among_three {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String[] names= {"Amar","Akbar","Anthony"};
		double []heights=new double[3];
		int []ages=new int[3];
		 for (int i = 0; i < 3; i++) {
	            System.out.print("Enter age of " + names[i] + ": ");
	            ages[i] = sc.nextInt();

	            System.out.print("Enter height (in cm) of " + names[i] + ": ");
	            heights[i] = sc.nextDouble();
	        }
		
		 int youngestIndex = findYoungest(ages);
	        System.out.println("\nThe youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);

	       
	        int tallestIndex = findTallest(heights);
	        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");


	}
	  public static int findYoungest(int[] ages) {
	        int minAge = ages[0];
	        int index = 0;

	        for (int i = 1; i < ages.length; i++) {
	            if (ages[i] < minAge) {
	                minAge = ages[i];
	                index = i;
	            }
	        }

	        return index;
	    }
	
	public static int findTallest(double[] heights) {
        double maxHeight = heights[0];
        int index = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }

        return index;
    }

}
