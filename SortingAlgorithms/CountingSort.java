package sorting;
import java.util.*;

public class CountingSort{

    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];  
        int[] output = new int[ages.length];

        //  Count the frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

      
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

       
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

       
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
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
		int []age=new int[n];
		System.out.print("Enter the age:");
		for(int i=0;i<n;i++) {
			age[i]=sc.nextInt();
		}
		System.out.println("Original Array");
		printArray(age);
		countingSort(age);
		
		System.out.println("After Sorting");
		printArray(age);
    }
}

