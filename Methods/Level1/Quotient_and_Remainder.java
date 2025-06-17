package level1;
import java.util.*;

public class Quotient_and_Remainder {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int divisor=sc.nextInt();
		int []ans=findRemainderAndQuotient(number,divisor);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}

	 public static int[] findRemainderAndQuotient(int number, int divisor) {
	        int quotient = number / divisor;
	        int remainder = number % divisor;
	        return new int[]{quotient, remainder};
	    }
}
