package level1;
import java.util.*;
public class Countdown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Lift off!");
	}

}
