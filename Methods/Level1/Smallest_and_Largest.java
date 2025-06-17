package level1;
import java.util.*;

public class Smallest_and_Largest {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		//Largest and Smallest among Three numbers
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int []ans = findSmallestAndLargest(num1, num2, num3);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

	public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }
}
