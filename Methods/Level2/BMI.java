package level2;
import java.util.*;

public class BMI {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        double[][] teamData = new double[10][3];

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
	            teamData[i][0] = scanner.nextDouble();

	            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
	            teamData[i][1] = scanner.nextDouble();
	        }

	        calculateBMI(teamData);

	        String[] statuses = getBMIStatuses(teamData);

	        // Display final report
	        System.out.println("\n--- BMI Report for Team ---");
	        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
	        System.out.println("-------------------------------------------------------");

	        for (int i = 0; i < 10; i++) {
	            System.out.printf("%-10.1f %-10.1f %-10.2f %-15s\n",
	                    teamData[i][0], teamData[i][1], teamData[i][2], statuses[i]);
	        }
	}
	
	
	 public static void calculateBMI(double[][] data) {
	        for (int i = 0; i < data.length; i++) {
	            double weight = data[i][0];        
	            double heightCm = data[i][1];     
	            double heightM = heightCm / 100.0; 
	            double bmi = weight / (heightM * heightM);
	            data[i][2] = bmi;
	        }
	    }
	 
	 
	 public static String[] getBMIStatuses(double[][] data) {
	        String[] statuses = new String[data.length];
	        for (int i = 0; i < data.length; i++) {
	            double bmi = data[i][2];
	            if (bmi < 18.5) {
	                statuses[i] = "Underweight";
	            } else if (bmi < 25) {
	                statuses[i] = "Normal";
	            } else if (bmi < 30) {
	                statuses[i] = "Overweight";
	            } else {
	                statuses[i] = "Obese";
	            }
	        }
	        return statuses;
	    }


}
