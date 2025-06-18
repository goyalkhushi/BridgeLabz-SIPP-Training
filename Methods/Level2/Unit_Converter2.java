package level2;
import java.util.*;

public class Unit_Converter2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double yards=sc.nextDouble();
		double feet=sc.nextDouble();
		double metres=sc.nextDouble();
		double inches=sc.nextDouble();
		
		System.out.println(yardintofeet(yards));
		System.out.println(feetintoyards(feet));
		System.out.println(metresintoinches(metres));
		System.out.println(inchesintometres(inches));
		System.out.println(inchestocm(inches));
		
	}
	public static double yardintofeet(double yards) {
		return yards*3;
		
	}
	public static double feetintoyards(double feet) {
		return feet* 0.333333;

	}
	public static double metresintoinches(double metres) {
		return metres*39.3701;

	}
	public static double inchesintometres(double inches) {
		return inches*0.0254;
	}
	public static double inchestocm(double inches) {
		return inches*2.54;
	}

}
