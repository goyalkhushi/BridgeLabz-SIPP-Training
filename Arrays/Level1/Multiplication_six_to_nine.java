package Level1;
import java.util.*;

public class Multiplication_six_to_nine {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] result = new int[4];

        for (int i = 6; i <= 9; i++) {
            int mul = number * i;
            result[i - 6] = mul;
            System.out.println(number + " * " + i + " = " + mul);
        }

	}

}
