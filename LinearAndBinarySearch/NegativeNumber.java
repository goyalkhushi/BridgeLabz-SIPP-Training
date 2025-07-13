package linearandbinarysearch;

import java.util.Scanner;

public class NegativeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print(negativeNumber(arr,n));
	}
	public static int negativeNumber(int []arr,int n) {
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				return i;
				
			}
		}
		return -1;
	}

}
