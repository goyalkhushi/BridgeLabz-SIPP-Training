package level2;
import java.util.*;

public class Leap_Year {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		boolean flag=leapyear(year);
		if(flag) {
			System.out.print("Leap Year");
		}
		else {
			System.out.print("Not a Leap Year");
		}
	}
	public  static boolean leapyear(int year) {
		return (year>=1582)||(year%400==0) || (year%4==0 && year%100!=0);
	}

}
