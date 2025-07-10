package sorting;
import java.util.*;
	
public class MergeSort {

	public static void  main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of Books: " );
		int n=sc.nextInt();
		int []prices=new int[n];
		System.out.print("Enter the prices: ");
		for(int i=0;i<n;i++) {
			prices[i]=sc.nextInt();
			
		}
		System.out.println("Original  Array");
		printArray(prices);
		mergeSort(prices,0,n-1);
		
		System.out.println("After Sort");
		printArray(prices);
	}
	
    public static void mergeSort(int arr[],int s,int e){
      
       if(s<e){
    	   int mid=s+(e-s)/2;
           mergeSort(arr,s,mid);
           mergeSort(arr,mid+1,e);
           merge(arr,s,mid,e);//merging of two arrays
       }
    }
    public static void merge(int []arr, int left, int mid,int right){
    	int n1 = mid - left + 1;
        int n2 = right - mid;
    	 int L[] = new int[n1];
         int R[] = new int[n2];

         // Copy data to temp arrays
         for (int i = 0; i < n1; ++i)
             L[i] = arr[left + i];
         for (int j = 0; j < n2; ++j)
             R[j] = arr[mid + 1 + j];


         // Initial indices of first and second subarrays
         int i = 0, j = 0;

         // Initial index of merged subarray array
         int k = left;
         while (i < n1 && j < n2) {
             if (L[i] <= R[j]) {
                 arr[k] = L[i];
                 i++;
             }
             else {
                 arr[k] = R[j];
                 j++;
             }
             k++;
         }

         // Copy remaining elements of L[] if any
         while (i < n1) {
             arr[k] = L[i];
             i++;
             k++;
         }

         // Copy remaining elements of R[] if any
         while (j < n2) {
             arr[k] = R[j];
             j++;
             k++;
         }
      
    }
    
    
	
	public static void printArray(int []prices) {
		for(int i=0;i<prices.length;i++) {
			System.out.print(prices[i]+" ");
		}
		System.out.println();
	}

}
