package level3;
import java.util.*;

public class CharFrequency {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String[][] frequencyData = findCharFrequency(input);
	        displayResult(frequencyData);
	    }

	public static String[][] findCharFrequency(String input) {
        int[] freq = new int[256];  
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (freq[input.charAt(i)] != 0) {
                uniqueCount++;
                freq[input.charAt(i)] = 0; 
            }
        }
        freq = new int[256];
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        String[][] result = new String[uniqueCount][2];
        boolean[] visited = new boolean[256];
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!visited[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                visited[ch] = true;
                index++;
            }
        }

        return result;
    }
	
	 public static void displayResult(String[][] result) {
	        System.out.println("\nCharacter\tFrequency");
	        System.out.println();
	        for (String[] row : result) {
	            System.out.println(row[0] + "\t\t" + row[1]);
	        }
	    }
}
