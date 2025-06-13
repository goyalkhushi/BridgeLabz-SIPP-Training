package level2;
import java.util.*;
public class Youngest_and_tallest {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter age of Amar: ");
	        int age1 = sc.nextInt();
	        System.out.print("Enter height of Amar: ");
	        int height1 = sc.nextInt();

	        System.out.print("Enter age of Akbar: ");
	        int age2 = sc.nextInt();
	        System.out.print("Enter height of Akbar: ");
	        int height2 = sc.nextInt();

	        System.out.print("Enter age of Anthony: ");
	        int age3 = sc.nextInt();
	        System.out.print("Enter height of Anthony: ");
	        int height3 = sc.nextInt();

	        String youngest = (age1 < age2 && age1 < age3) ? "Amar" : (age2 < age3 ? "Akbar" : "Anthony");
	        String tallest = (height1 > height2 && height1 > height3) ? "Amar" : (height2 > height3 ? "Akbar" : "Anthony");

	        System.out.println("Youngest is: " + youngest);
	        System.out.println("Tallest is: " + tallest);
	}

}
