package level1;
import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		
		System.out.print(calculateRounds(side1,side2,side3));
	
	}

	public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000; // meters
        return (int) Math.ceil(totalDistance / perimeter);
    }
}
