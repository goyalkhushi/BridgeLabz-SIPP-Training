package level2;
import java.util.*;

public class VowelConsonantCharacter {
	
	 public static void main(String[] args) {
		 
		 
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        String[][] analysis = classifyCharacters(input);
	        displayTable(analysis);
	    }
	 
	 	public static String getCharType(char ch) {
	        if (ch >= 'A' && ch <= 'Z') {
	            ch = (char)(ch + 32); 
	        }

	        if (ch >= 'a' && ch <= 'z') {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                return "Vowel";
	            } 
	            else {
	                return "Consonant";
	            }
	        } 
	        else {
	            return "Not a Letter";
	        }
	    }
	 public static String[][] classifyCharacters(String input) {
	        String[][] result = new String[input.length()][2];

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            result[i][0] = String.valueOf(ch);
	            result[i][1] = getCharType(ch);
	        }

	        return result;
	    }
	 public static void displayTable(String[][] data) {
	        System.out.println("\nCharacter\tType");
	        System.out.println();
	        for (String[] row : data) {
	            System.out.println(row[0] + "\t\t" + row[1]);
	        }
	    }

}
