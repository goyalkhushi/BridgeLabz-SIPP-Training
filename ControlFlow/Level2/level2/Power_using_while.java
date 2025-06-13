package level2;
import java.util.*:
public class Power_using_while {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
	        int base = sc.nextInt();
	        int power = sc.nextInt();

	        int result = 1;
	        int counter = 0;

	        while (counter < power) {
	            result *= base;
	            counter++;
	        }

	        System.out.println(base + "^" + power + " = " + result);
	}

}
