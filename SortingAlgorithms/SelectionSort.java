package sorting;
import java.util.Scanner;

public class SelectionSort {
	
	
	public static void selectionSort(int[] arr){
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	       
	            int min_idx = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[min_idx]) {
	                  
	                    // Update min_idx if a smaller element
	                    // is found
	                    min_idx = j;
	                }
	            }

	            // Move minimum element to its
	            // correct position
	            int temp = arr[i];
	            arr[i] = arr[min_idx];
	            arr[min_idx] = temp;           
	        }
	    }


	public static void printArray(int []marks) {
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total no of Students");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.print("Enter marks: ");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array");
		printArray(arr);
		selectionSort(arr);
		
		System.out.println("After Sorting");
		printArray(arr);
	}
}
