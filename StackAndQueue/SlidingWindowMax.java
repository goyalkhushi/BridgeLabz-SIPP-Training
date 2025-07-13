package stackandqueue;
import java.util.*;

public class SlidingWindowMax {
	
	 public static List<Integer> maxSlidingWindow(int[] nums, int k) {
	        List<Integer> result = new ArrayList<>();
	        Deque<Integer> deque = new ArrayDeque<>();

	        for (int i = 0; i < nums.length; i++) {
	            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
	                deque.pollFirst();
	            }
	            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
	                deque.pollLast();
	            }

	            deque.offerLast(i);
	            if (i >= k - 1) {
	                result.add(nums[deque.peekFirst()]);
	            }
	        }

	        return result;
	    }
	 
	 
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements in the array: ");
	        int n = sc.nextInt();

	        int[] nums = new int[n];
	        for (int i = 0; i < n; i++) {
	            nums[i] = sc.nextInt();
	        }

	        System.out.print("Enter window size k: ");
	        int k = sc.nextInt();

	        List<Integer> maxValues = maxSlidingWindow(nums, k);
	        System.out.println("Maximums in each sliding window:");
	        for (int max : maxValues) {
	            System.out.print(max + " ");
	        }
	}
	
	
}
