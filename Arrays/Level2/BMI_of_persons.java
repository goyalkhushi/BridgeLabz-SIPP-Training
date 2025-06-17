package level2;
import java.util.*;

public class BMI_of_persons {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int persons=sc.nextInt();
		double []weight=new double[persons];
		double []height=new double[persons];
		double []bmi = new double[persons];
		String []status = new String[persons];
		
		for(int i=0;i<persons;i++) {
			System.out.println("Enter a height(m) of a person: ");
			height[i]=sc.nextDouble();
			
			System.out.println("Enter a weight(kg) of a person: ");
			weight[i]=sc.nextDouble();
			
			bmi[i]=weight[i]/(height[i]*height[i]);
			

            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
		}
		
		 System.out.println("\nHeight(m)\tWeight(kg)\tBMI\t\tStatus");
	        for (int i = 0; i <persons; i++) {
	            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n", height[i], weight[i], bmi[i], status[i]);
	        }
		
	}

}
