package level3;
import java.util.*;

public class CharFrequencyWithCharacters {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = getFrequencies(input);
        display(frequencies);
    }
	
	public static char[] findUniqueCharacters(String text) {
        int len = getLength(text);
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[count] = ch;
                count++;
            }
        }

        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }
	
	 public static int getLength(String text) {
	        int len = 0;
	        try {
	            while (true) {
	                text.charAt(len);
	                len++;
	            }
	        } catch (StringIndexOutOfBoundsException e) {}
	        return len;
	    }
	
	 public static String[][] getFrequencies(String input) {
	        int[] freq = new int[256];

	        for (int i = 0; i < getLength(input); i++) {
	            freq[input.charAt(i)]++;
	        }

	        char[] unique = findUniqueCharacters(input);
	        String[][] result = new String[unique.length][2];

	        for (int i = 0; i < unique.length; i++) {
	            result[i][0] = String.valueOf(unique[i]);
	            result[i][1] = String.valueOf(freq[unique[i]]);
	        }

	        return result;
	    }
	public static void display(String[][] result) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println();
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}
