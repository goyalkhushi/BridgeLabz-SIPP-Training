package level2;

import java.util.Scanner;

public class Largest_without_another_array {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int maxdigit=10;
		int []digits = new int[maxdigit];
		int idx=0;
		
		while(num!=0) {
			int lastdigit=num%10;
			if(idx==maxdigit) {
				break;
			}
			digits[idx++]=lastdigit;
			num/=10;
		}
		
		int max=-1; //largest
		int temp=-1; //second largest
		for(int i=0;i<idx;i++) {
			if(digits[i]>max) {
				temp=max;
				max=digits[i];
			}
			else if(digits[i]>temp && digits[i]<max) {
				temp=digits[i];
			}
		}
		
		System.out.println("Largest digit: " +max);
		System.out.println("Second Largest digit: " +temp);
		


	}

}
