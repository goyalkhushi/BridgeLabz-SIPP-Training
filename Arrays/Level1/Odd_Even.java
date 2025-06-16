package Level1;
import java.util.*;

public class Odd_Even {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(num<0) {
			System.out.print("Not a Natural Number");
		}
		int size=num/2+1;
		int []even=new int[size];
		int []odd=new int[size];
		int evenidx=0;
		int oddidx=0;
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				odd[oddidx++]=i;
			}
			else {
				even[evenidx++]=i;
			}
		}
		System.out.print("Odd Numbers");
		for(int i=0;i<size;i++) {
			System.out.print(odd[i]+" ");
		}
		System.out.println();
		System.out.print("Even Numbers");
		for(int i=0;i<size;i++) {
			System.out.print(even[i]+" ");
		}
		
	}

}
