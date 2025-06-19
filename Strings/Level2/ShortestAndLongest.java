package level2;
import java.util.*;

public class ShortestAndLongest {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        String[] words = splitIntoWords(input);
	        String[][] wordLengthTable = wordLengthArray(words);
	        int[] result = findShortestAndLongest(wordLengthTable);

	        System.out.println("\nWord\t\tLength");
	        System.out.println("-------------------------");
	        for (String[] row : wordLengthTable) {
	            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
	        }

	        System.out.println("\nShortest Word: " + wordLengthTable[result[0]][0]);
	        System.out.println("Longest Word: " + wordLengthTable[result[1]][0]);
	    }

	 public static int getLength(String str) {
	        int count = 0;
	        try {
	            while (true) {
	                str.charAt(count);
	                count++;
	            }
	        } catch (StringIndexOutOfBoundsException e) {}
	        return count;
	    }
	 public static String[] splitIntoWords(String input) {
	        int len = getLength(input);
	        int spaceCount = 0;
	        for (int i = 0; i < len; i++) {
	            if (input.charAt(i) == ' ') spaceCount++;
	        }

	        int[] boundaries = new int[spaceCount + 2];
	        boundaries[0] = -1;
	        int index = 1;
	        for (int i = 0; i < len; i++) {
	            if (input.charAt(i) == ' ') boundaries[index++] = i;
	        }
	        boundaries[index] = len;

	        String[] words = new String[spaceCount + 1];
	        for (int i = 0; i < words.length; i++) {
	            StringBuilder word = new StringBuilder();
	            for (int j = boundaries[i] + 1; j < boundaries[i + 1]; j++) {
	                word.append(input.charAt(j));
	            }
	            words[i] = word.toString();
	        }

	        return words;
	    }
	 public static String[][] wordLengthArray(String[] words) {
	        String[][] table = new String[words.length][2];
	        for (int i = 0; i < words.length; i++) {
	            table[i][0] = words[i];
	            table[i][1] = String.valueOf(getLength(words[i]));
	        }
	        return table;
	    }
	 public static int[] findShortestAndLongest(String[][] table) {
	        int minIdx = 0, maxIdx = 0;
	        int minLen = Integer.parseInt(table[0][1]);
	        int maxLen = minLen;

	        for (int i = 1; i < table.length; i++) {
	            int len = Integer.parseInt(table[i][1]);
	            if (len < minLen) {
	                minLen = len;
	                minIdx = i;
	            }
	            if (len > maxLen) {
	                maxLen = len;
	                maxIdx = i;
	            }
	        }

	        return new int[]{minIdx, maxIdx};
	    }
}
