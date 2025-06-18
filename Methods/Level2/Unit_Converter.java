package level2;
import java.util.*;

public class Unit_Converter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double km=sc.nextDouble();
		double miles=sc.nextDouble();
		double feet=sc.nextDouble();
		double metres=sc.nextDouble();
		
		System.out.println(intomiles(km));
		System.out.println(intokm(miles));
		System.out.println(intofeet(metres));
		System.out.println(intometres(feet));
		

	}
	public static double intomiles(double km) {
		return km*0.621371;
	}
	public static double intokm(double miles) {
		return miles*0.621371;
	}
	public static double intofeet(double metres) {
		return metres*3.28084;
	}
	public static double intometres(double feet) {
		return feet*0.3048;
	}

}
