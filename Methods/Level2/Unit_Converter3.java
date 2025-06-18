package level2;
import java.util.*;

public class Unit_Converter3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double Fahrenheit=sc.nextDouble();
		double Celsius=sc.nextDouble();
		double pounds=sc.nextDouble();
		double kg=sc.nextDouble();
		double gallons=sc.nextDouble();
		double liters=sc.nextDouble();
		
		System.out.println(convertFahrenheitToCelsius(Fahrenheit));
		System.out.println( convertCelsiusToFahrenheit(Celsius));
		System.out.println(convertPoundsToKg(pounds));
		System.out.println(convertKgToPounds( kg));
		System.out.println(convertGallonsToLiters(gallons));
		System.out.println(convertLitersToGallons(liters));
		
		
		

	}
	 public static double convertFahrenheitToCelsius(double f) {
		 return (f - 32) * 5 / 9;
		 }
     public static double convertCelsiusToFahrenheit(double c) {
    	 return (c * 9 / 5) + 32; 
    	 }
     public static double convertPoundsToKg(double pounds) { 
    	 return pounds * 0.453592; 
    	 }
     public static double convertKgToPounds(double kg) { 
    	 return kg * 2.20462; 
    	 
     }
     public static double convertGallonsToLiters(double gallons) {
    	 return gallons * 3.78541; 
    	 }
     public static double convertLitersToGallons(double liters) {
    	 return liters * 0.264172; 
    	 }


}
