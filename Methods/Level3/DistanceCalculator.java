package level3;
import java.util.*;

public class DistanceCalculator {

	   public static void main(String[] args) {
		   
		   
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter x1 and y1: ");
	        int x1 = scanner.nextInt();
	        int y1 = scanner.nextInt();

	        System.out.print("Enter x2 and y2: ");
	        int x2 = scanner.nextInt();
	        int y2 = scanner.nextInt();

	       
	        double distance = calculateDistance(x1, y1, x2, y2);
	        System.out.printf("\nEuclidean Distance: %.2f\n", distance);

	      
	        try {
	            double[] line = calculateLineEquation(x1, y1, x2, y2);
	            double m = line[0];
	            double b = line[1];
	            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", m, b);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	    }
	    
	    public static double calculateDistance(int x1, int y1, int x2, int y2) {
	        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	    }

	   
	    public static double[] calculateLineEquation(int x1, int y1, int x2, int y2) {
	        double[] result = new double[2]; // [0] = m, [1] = b

	        if (x1 == x2) {
	            throw new IllegalArgumentException("Vertical line - slope is undefined.");
	        }

	        double m = (double) (y2 - y1) / (x2 - x1);
	        double b = y1 - m * x1;

	        result[0] = m;
	        result[1] = b;

	        return result;
	    }

	    
	 
	


}
