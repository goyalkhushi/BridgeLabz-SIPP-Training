package level2;
import java.util.*;

public class VowelAndConsonant {
	

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int[] result = countVowelsAndConsonants(input);

	        System.out.println("\nVowels count: " + result[0]);
	        System.out.println("Consonants count: " + result[1]);
	    }
	 

	 public static int[] countVowelsAndConsonants(String input) {
	        int vowels = 0;
	        int consonants = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            String type = checkCharType(ch);

	            if (type.equals("Vowel")) {
	                vowels++;
	            } 
	            else if (type.equals("Consonant")) {
	                consonants++;
	            }
	        }

	        return new int[]{vowels, consonants};
	    }
	 
	 public static String checkCharType(char ch) {
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
	 
}

