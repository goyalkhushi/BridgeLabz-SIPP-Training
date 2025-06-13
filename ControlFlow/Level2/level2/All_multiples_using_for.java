package level2;
import java.util.*;
public class All_multiples_using_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            for (int i = 1; i <= 100; i++) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter number between 1 and 99");
        }
	}

}
