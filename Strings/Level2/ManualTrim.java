package level2;
import java.util.*;

public class ManualTrim {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string with leading/trailing spaces: ");
	        String input = sc.nextLine();

	        int[] indices = findTrimIndices(input);
	        String manuallyTrimmed = (indices[1] >= indices[0]) ? customSubstring(input, indices[0], indices[1]) : "";

	        String builtInTrim = input.trim();
	        boolean isSame = compareStrings(manuallyTrimmed, builtInTrim);

	        System.out.println("Manual trim result: \"" + manuallyTrimmed + "\"");
	        System.out.println("Built-in trim() result: \"" + builtInTrim + "\"");
	        System.out.println("Do both results match? " + isSame);
	    }

	 public static int[] findTrimIndices(String input) {
	        int start = 0;
	        int end = 0;
	        boolean leadingFound = false;

	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) != ' ') {
	                start = i;
	                leadingFound = true;
	                break;
	            }
	        }
	        for (int i = input.length() - 1; i >= 0; i--) {
	            if (input.charAt(i) != ' ') {
	                end = i;
	                break;
	            }
	        }

	        if (!leadingFound) {
	            start = 0;
	            end = -1;
	        }

	        return new int[] { start, end };
	    }
	 
	 public static String customSubstring(String input, int start, int end) {
	        StringBuilder result = new StringBuilder();
	        for (int i = start; i <= end && i < input.length(); i++) {
	            result.append(input.charAt(i));
	        }
	        return result.toString();
	    }
	 public static boolean compareStrings(String a, String b) {
	        if (a.length() != b.length()) return false;
	        for (int i = 0; i < a.length(); i++) {
	            if (a.charAt(i) != b.charAt(i)) return false;
	        }
	        return true;
	    }
}
