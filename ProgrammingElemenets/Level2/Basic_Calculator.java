package level2;
import java.util.*;
public class Basic_Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        double sum = number1 + number2;
        double diff = number1 - number2;
        double product = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : 0;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " 
            + sum + ", " + diff + ", " + product + ", and " + division);
   
	}

}
