package hashfunctions;

import java.util.*;

public class PairWithSum {
    
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("Pair Found: (" + complement + ", " + num + ")");
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        boolean result = hasPairWithSum(arr, target);
        if (!result) {
            System.out.println("No pair found with the given sum.");
        }
    }
}
