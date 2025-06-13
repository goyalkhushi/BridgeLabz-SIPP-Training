package level1;
import java.util.*;
public class Sum_of_numbers_using_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double value = sc.nextDouble();
            if (value <= 0) {
                break;
            }
            total += value;
        }
        System.out.println("Total sum is: " + total);
	}

}
