package level2;
import java.util.*;

public class Split {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();
        String[] builtInSplit = input.split(" ");
        String[] manualSplit = manualSplit(input);

        boolean isSame = compareWordArrays(builtInSplit, manualSplit);

        System.out.println("\nManual word split:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split() result:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("Do both arrays match? " + isSame);
	}
	
	 public static int getLength(String input) {
	        int count = 0;
	        try {
	            while (true) {
	                input.charAt(count);
	                count++;
	            }
	        } 
	        catch (StringIndexOutOfBoundsException e) {
	            // Do nothing, we've reached the end
	        }
	        return count;
	    }
	 
	 public static String[] manualSplit(String input) {
	        int len = getLength(input);

	        int spaceCount = 0;
	        for (int i = 0; i < len; i++) {
	            if (input.charAt(i) == ' ') {
	                spaceCount++;
	            }
	        }

	        int[] spaceIndexes = new int[spaceCount + 2];
	        spaceIndexes[0] = -1; 
	        int idx = 1;
	        for (int i = 0; i < len; i++) {
	            if (input.charAt(i) == ' ') {
	                spaceIndexes[idx++] = i;
	            }
	        }
	        spaceIndexes[idx] = len; 
	        String[] words = new String[spaceCount + 1];
	        for (int i = 0; i < words.length; i++) {
	            StringBuilder word = new StringBuilder();
	            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
	                word.append(input.charAt(j));
	            }
	            words[i] = word.toString();
	        }

	        return words;
	    }
	 
	 public static boolean compareWordArrays(String[] arr1, String[] arr2) {
	        if (arr1.length != arr2.length) return false;
	        for (int i = 0; i < arr1.length; i++) {
	            if (!arr1[i].equals(arr2[i])) return false;
	        }
	        return true;
	    }
 
}
