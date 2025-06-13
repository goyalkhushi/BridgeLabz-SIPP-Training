package level1;
import java.util.*;
public class Bonus_Calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for service less than or equal to 5 years");
        }
	}

}
