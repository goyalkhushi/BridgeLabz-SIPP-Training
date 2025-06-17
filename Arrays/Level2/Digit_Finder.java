package level2;
import java.util.*;

public class Digit_Finder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();

        int[] digits = new int[20];
        int[] frequency = new int[10]; // for digits 0 to 9
        int index = 0;

        
        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }
        
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

	}

}
