package level1;
import java.util.*;

public class Check_num {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(checkNumberSign(n));

	}
	 public static int checkNumberSign(int number) {
	        if (number > 0) return 1;
	        else if (number < 0) return -1;
	        else return 0;
	    }

}
