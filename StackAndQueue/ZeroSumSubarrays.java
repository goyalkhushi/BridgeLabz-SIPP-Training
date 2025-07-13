package hashfunctions;
import java.util.*;

public class ZeroSumSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        List<int[]> result = new ArrayList<>();

        map.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        if (result.isEmpty()) {
            System.out.println("No subarrays with zero sum found.");
        } 
        else {
            System.out.println("Zero sum subarrays (start to end index):");
            for (int[] pair : result) {
                System.out.println(Arrays.toString(pair));
            }
        }
    }
}
