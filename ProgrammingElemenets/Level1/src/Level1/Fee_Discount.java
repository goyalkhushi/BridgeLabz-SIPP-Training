package Level1;
import java.util.*;
public class Fee_Discount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double fee, discountPercent;
        System.out.print("Enter Fee Amount: ");
        fee = input.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    
	}

}
