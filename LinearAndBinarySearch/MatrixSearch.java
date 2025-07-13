package linearandbinarysearch;

import java.util.Scanner;

public class MatrixSearch {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [][]arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		int target=sc.nextInt();
		System.out.print(search(arr,n,target));
	}
	
	
	public static boolean search(int [][]arr,int n,int target) {
		
	    int rows = arr.length;
        int cols = arr[0].length;
        int left = 0;
        int right = rows * cols - 1;
        
        if(arr==null || rows==0|| cols==0) return false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int midElement = arr[row][col];

            if (midElement == target)
                return true;
            else if (midElement < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
		
	}
	

}
