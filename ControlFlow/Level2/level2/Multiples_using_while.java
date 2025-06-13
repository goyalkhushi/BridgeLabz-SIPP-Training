package level2;
import java.util.*;
public class Multiples_using_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int i = 1;
            while (i <= 100) {
                if (i % number == 0) System.out.println(i);
                i++;
            }
        } else {
            System.out.println("Enter number between 1 and 99");
        }
	}

}
