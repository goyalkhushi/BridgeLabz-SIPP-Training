package level1;
import java.util.*;
public class Rewrite_using_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Are both results equal? " + (sum == formulaSum));
        } else {
            System.out.println("Not a natural number");
        }
	}

}
