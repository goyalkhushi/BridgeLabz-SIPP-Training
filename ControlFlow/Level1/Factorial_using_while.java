package level1;
import java.util.*;
public class Factorial_using_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 0) {
            long fact = 1;
            int i = 1;
            while (i <= number) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + number + " is " + fact);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }
	}

}
