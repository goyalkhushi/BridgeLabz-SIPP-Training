package sorting;

import java.util.Scanner;

public class HeapSort {
	public static void heapSort(int[] arr) {
        int n = arr.length;
        buildMaxHeap(arr);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr [0];
            arr [0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
	
	 public static void buildMaxHeap(int[] arr) {
	        int n = arr.length;
	        for (int i = n / 2 - 1; i >= 0; i--) {
	            heapify(arr, n, i);
	        }
	    }
	 
	 public static void heapify(int[] arr, int n, int i) {
	        int largest = i;
	        int left = 2 * i + 1;
	        int right = 2 * i + 2;

	        if (left < n && arr[left] < arr[largest]) {
	            largest = left;
	        }

	        if (right < n && arr[right] < arr[largest]) {
	            largest = right;
	        }

	        if (largest != i) {
	            int temp = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = temp;
	            heapify(arr, n, largest);
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
			System.out.print("Enter the size:");
			int n=sc.nextInt();
			int []arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Original Array");
			printArray(arr);
			heapSort(arr);
			
			System.out.println("After Sorting");
			printArray(arr);
		}
		


}
