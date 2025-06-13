package level2;
import java.util.*;
public class Area_of_Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double area_cm = 0.5 * base * height;
        double area_in = area_cm / (2.54 * 2.54); // 1 inch = 2.54 cm

        System.out.println("The Area of the triangle in sq in is " + area_in + " and sq cm is " + area_cm);
    
	}

}
