package level2;
import java.util.*;

public class Reveerse_number {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();

        int count = 0, temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;
        while (num != 0) {
            digits[index++] = num % 10;
            num /= 10;
        }

        System.out.print("Reversed Number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
	}

}
