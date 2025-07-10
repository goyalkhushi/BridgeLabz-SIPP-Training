package sorting;

import java.util.Scanner;

public class QuickSort {
	
	public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) i++;
            while (j >= low && arr[j] > pivot) j--;
            if (i < j) {
                swap(arr, i, j);
            }
        }


        swap(arr, low, j);
        return j;
    }

    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    

	public static void printArray(int []marks) {
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
	}


    
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
		quickSort(arr,0,n-1);
		
		System.out.println("After Sorting");
		printArray(arr);
	}

}
