package level1;
import java.util.*;
public class Sum_and_Comparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Are both results equal? " + (sum == formulaSum));
        } else {
            System.out.println("Not a natural number");
        }
	}

}
