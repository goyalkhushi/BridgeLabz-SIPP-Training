package level1;
import java.util.*;

public class Simple_Interest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double Principal = sc.nextDouble();
		double Rate= sc.nextDouble();
		double time=sc.nextDouble();
		double SI=simpleInterest(Principal,Rate,time);
		System.out.print("The Simple Interest is " +SI +" for Principal " +Principal +",Rate of Interest " +Rate +" and Time " +time );

	}
	 public static double simpleInterest(double principal, double rate, double time) {
	        return (principal * rate * time) / 100;
	    }

}
