package linearandbinarysearch;

import java.util.Scanner;

public class RotatedSortedArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(rotate(arr,n));
	}
	
	public static int rotate(int[] arr,int n) {
		int left=0;
		int right=n-1;
	
		while(left<right) {
			int mid=(left+right)/2;
			
			if(arr[mid]>arr[right]) {
				left=mid+1;
			}
			else {
				right=mid;
			}
		}
		return left;
	}
}
