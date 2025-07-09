package sorting;
import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of Students: " );
		int n=sc.nextInt();
		int []marks=new int[n];
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
			
		}
		System.out.println("Original marks Array");
		printArray(marks);
		bubbleSort(marks);
		
		System.out.println("Marks Array after Bubble Sort");
		printArray(marks);
	}
	
	
	 public static void bubbleSort(int[] marks) {
	        int n = marks.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (marks[j] > marks[j + 1]) {
	                    // Swap elements
	                    int temp = marks[j];
	                    marks[j] = marks[j + 1];
	                    marks[j + 1] = temp;
	                }
	            }
	        }
	    }
	 
	 
	
	public static void printArray(int []marks) {
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
	}

}
