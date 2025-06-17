package level1;
import java.util.*;

public class Sum_of_Natural_Number {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(sumOfNaturalNumbers(n));
		
	}
	
	public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
