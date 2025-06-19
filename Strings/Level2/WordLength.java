package level2;
import java.util.*;

public class WordLength {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] words = splitIntoWords(input);
        String[][] wordTable = generateWordLengthTable(words);

        System.out.println("\nWord\t\tLength");
        System.out.println();
        for (String[] row : wordTable) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
        }
    }
	public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Reached end of string
        }
        return count;
    }
	
	public static String[] splitIntoWords(String text) {
        int len = getLength(text);
        int spaceCount = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] boundaries = new int[spaceCount + 2];
        boundaries[0] = -1;
        int idx = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
            	 boundaries[idx++] = i;
            }
        }
        boundaries[idx] = len;

        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = boundaries[i] + 1; j < boundaries[i + 1]; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
        }
        return words;
    }
            
	
	public static String[][] generateWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }

}
