package level1;
import java.util.*;
public class Check_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();
	        if (number > 0) {
	            System.out.println("Positive");
	        } else if (number < 0) {
	            System.out.println("Negative");
	        } else {
	            System.out.println("Zero");
	        }
	}

}
