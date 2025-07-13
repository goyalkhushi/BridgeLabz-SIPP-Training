package linearandbinarysearch;

import java.util.Scanner;

public class PeakElement {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(peak(arr,n));
	}


public static int peak(int[] arr,int n) {
	int left=0;
	int right=n-1;

	while(left<=right) {
		  int mid = left + (right - left) / 2;
		
		 boolean leftIsSmaller = (mid == 0 || arr[mid] >= arr[mid - 1]);
	        boolean rightIsSmaller = (mid == n - 1 || arr[mid] >= arr[mid + 1]);

	        if (leftIsSmaller && rightIsSmaller) {
	            return arr[mid];
	        }
		if(mid>0 && arr[mid]<arr[mid-1])	{
			right=mid-1;
		}
		if(arr[mid]<arr[mid+1]) {
			left=mid+1;
		}
	}
	return -1;
}
		
}
