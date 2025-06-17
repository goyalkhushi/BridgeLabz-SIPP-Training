package level1;
import java.util.*;

public class Trigonometric_functions {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double angle=sc.nextDouble();
		double []ans=calculateTrigonometricFunctions(angle)	;
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}

	public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double radians = Math.toRadians(angleDegrees);
        return new double[]{ Math.sin(radians),
        					Math.cos(radians),
        					Math.tan(radians)};
    }
}
