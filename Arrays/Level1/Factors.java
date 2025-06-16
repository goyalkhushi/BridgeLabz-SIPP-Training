package Level1;
import java.util.*;

public class Factors {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int maxFactor=10;
		int idx=0;
		int []factors = new int[maxFactor];
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				if(idx==maxFactor) {
					 int size=maxFactor*2;
					int []temp = new int[size];
					System.arraycopy(factors, 0, temp, 0,idx);
					factors=temp;
				}
				factors[idx++]=i;
			}
		}
		 System.out.print("Factors of " + num + " are: ");
	        for (int i = 0; i < idx; i++) {
	            System.out.print(factors[i] + " ");
	        }

	}

}
