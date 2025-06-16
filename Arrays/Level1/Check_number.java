package Level1;
import java.util.*;

public class Check_number {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int []number=new int [5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter a number" +(i+1)+" ");
			number[i]=sc.nextInt();
		}
		for(int num:number) {
			if(num>0) {
				if(num%2==0) {
					System.out.println("The number " +num +" is Even");
				}
				else {
					System.out.println("The number " +num +" is Odd");
				}
			}
			else if(num==0) {
				System.out.println("The number is Zero");
			}
			else {
				System.out.println("The number " +num +" is Negative");
			}
		}
		if(number[0]==number[4]) {
			System.out.println("The number are equal");
		}
		else if(number[0]>number[4]) {
			System.out.println("The first number is greater than last number");
		}
		else {
			System.out.println("The first number is smaller than last number");
		}
		
	}

}
