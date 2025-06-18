package level2;
import java.util.*;

public class Sum_of_natural_numbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(sumofRecursion( n));
		System.out.print(sumbyFormula(n));

	}
	
	public static int sumofRecursion(int n) {
		if(n==1) {
			return 1;
		}
		return n+sumofRecursion(n-1);
		
	}
	public static int sumbyFormula(int n) {
		return n*(n+1)/2;
	}

}
