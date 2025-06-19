package level3;
import java.util.*;

public class CharFrequencyNested {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String text = scanner.nextLine();

	        String[][] frequencyData = calculateFrequency(text);
	        displayFrequency(frequencyData);
	    }
	 
	 public static String[][] calculateFrequency(String input) {
	        char[] chars = input.toCharArray();
	        int[] freq = new int[chars.length];

	        for (int i = 0; i < chars.length; i++) {
	            freq[i] = 1;

	            if (chars[i] == '0') continue;

	            for (int j = i + 1; j < chars.length; j++) {
	                if (chars[i] == chars[j]) {
	                    freq[i]++;
	                    chars[j] = '0'; // Mark as counted
	                }
	            }
	        }
	        int uniqueCount = 0;
	        for (char ch : chars) {
	            if (ch != '0') uniqueCount++;
	        }
	        String[][] result = new String[uniqueCount][2];
	        int index = 0;

	        for (int i = 0; i < chars.length; i++) {
	            if (chars[i] != '0') {
	                result[index][0] = String.valueOf(chars[i]);
	                result[index][1] = String.valueOf(freq[i]);
	                index++;
	            }
	        }
	        return result;
	    }
	 public static void displayFrequency(String[][] data) {
	        System.out.println("\nCharacter\tFrequency");
	        System.out.println();
	        for (String[] row : data) {
	            System.out.println(row[0] + "\t\t" + row[1]);
	        }
	    }

}
