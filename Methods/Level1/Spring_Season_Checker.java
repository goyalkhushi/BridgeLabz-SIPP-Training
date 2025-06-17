package level1;
import java.util.*;

public class Spring_Season_Checker {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int day=sc.nextInt();
		int month=sc.nextInt();
		boolean flag= isSpringSeason(month,day);
		if(flag) System.out.print("Its a Spring Season");
		else System.out.print("Not a Spring Season");
		
	}
	
	 public static boolean isSpringSeason(int month, int day) {
	        return (month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6);
	    }
}
