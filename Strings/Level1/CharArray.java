package level1;
import java.util.*;

public class CharArray {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        String st = sc.next();

	        char[] manualArray = getCharacters(st);
	        char[] builtInArray = st.toCharArray();

	        boolean result = compareCharArrays(manualArray, builtInArray);

	        System.out.print("Characters using user-defined method: ");
	        for (char c : manualArray) {
	            System.out.print(c + " ");
	        }

	        System.out.println("Characters using toCharArray(): ");
	        for (char c : builtInArray) {
	            System.out.print(c + " ");
	        }

	        System.out.println("Do both methods produce the same result? " + result);
	    

	}
	
	public static char[] getCharacters(String input) {
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = input.charAt(i);
        }
        return result;
    }
	
	public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

}
