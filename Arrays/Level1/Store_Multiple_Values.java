package Level1;
import java.util.*;

public class Store_Multiple_Values {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double []value = new double[10];
		double total=10.0;
		int index=0;
		
		while(true) {
			System.out.println("Enter a number: ");
			double num=sc.nextDouble();
			if(num<=0 || index==10) {
				break;
			}
			value[index++]=num;
		}
		for(int i=0;i<index;i++) {
			total+=value[i];
		}
		System.out.println("Total value: "+total);

	}

}
