package level2;
import java.util.*;

public class Factors {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int []ans=getFactors(num);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.print(productOfFactors(ans));
	}

	public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }
	 public static int productOfFactors(int[] factors) {
	        int product = 1;
	        for (int f : factors) product *= f;
	        return product;
	    }
}
