package sorting;
import java.util.*;


public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total no of Employers");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter Employee_Id: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array");
		printArray(arr);
		insertionSort(arr);
		
		System.out.println("After Sorting");
		printArray(arr);
	}
	
	
	public static void printArray(int []marks) {
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
	}

	
	public static void insertionSort(int []arr) {
		  int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	}
}
