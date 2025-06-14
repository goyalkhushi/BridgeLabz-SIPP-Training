package level3;
import java.util.*;

public class Leap_Year_using_and_or {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		 if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
	            System.out.println("Leap Year");
	        } 
		 else if (year < 1582) {
	            System.out.println("The LeapYear check is valid only for year >= 1582.");
	        }
		 else {
	            System.out.println("Not a Leap Year");
	        }
		
		

	}

}
