package level1;
import java.util.*;
public class Factorial_using_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 0) {
            long fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + number + " is " + fact);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }
	}

}
