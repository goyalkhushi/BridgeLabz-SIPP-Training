package Level1;

public class Area_Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;

        System.out.println("Area in cm²: " + areaCm + " and area in inch²: " + areaInches);
  
	}

}
