package level1;
import java.util.*;

public class Choclates_Divisor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choclate=sc.nextInt();
		int children=sc.nextInt()
;
		int []ans=distributeChocolates(choclate,children);
		for(int i=0;i<2;i++) {
			System.out.println(ans[i]);
		}

	}
	
	  public static int[] distributeChocolates(int chocolates, int children) {
	        int distributed=chocolates/children;
	        int remaining=chocolates%children;
	        return new int[] {distributed,remaining}; 
	        
	        
	        
	    }


}
