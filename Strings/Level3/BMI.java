package level3;
import java.util.*;

public class BMI {
	
	 public static void main(String[] args) {
	        int numPeople = 10;

	        double[][] heightWeightData = inputHeightWeight(numPeople);
	        String[][] bmiReport = buildBMIReport(heightWeightData);
	        displayTable(bmiReport);
	    }
	 
	 public static double[][] inputHeightWeight(int numPeople) {
	        Scanner scanner = new Scanner(System.in);
	        double[][] data = new double[numPeople][2]; // [][0] = weight, [][1] = height (cm)

	        for (int i = 0; i < numPeople; i++) {
	            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
	            data[i][0] = scanner.nextDouble();
	            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
	            data[i][1] = scanner.nextDouble();
	        }

	        return data;
	    }
	 public static String[] computeBMIStatus(double weight, double heightCm) {
	        double heightMeters = heightCm / 100.0;
	        double bmi = weight / (heightMeters * heightMeters);
	        bmi = Math.round(bmi * 100.0) / 100.0;

	        String status;
	        if (bmi <= 18.4) status = "Undergraduate";
	        else if (bmi <= 24.9) status = "Normal";
	        else if (bmi <= 39.9) status = "Overweight";
	        else status = "Obese";

	        return new String[]{String.valueOf(bmi), status};
	    }
	 public static String[][] buildBMIReport(double[][] rawData) {
	        String[][] report = new String[rawData.length][4]; // weight, height, BMI, status

	        for (int i = 0; i < rawData.length; i++) {
	            double weight = rawData[i][0];
	            double height = rawData[i][1];
	            String[] bmiData = computeBMIStatus(weight, height);

	            report[i][0] = String.valueOf(weight);
	            report[i][1] = String.valueOf(height);
	            report[i][2] = bmiData[0];
	            report[i][3] = bmiData[1];
	        }

	        return report;
	    }
	 public static void displayTable(String[][] report) {
	        System.out.println("\nBMI Report");
	        System.out.println("----------------------------------------------");
	        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
	        System.out.println("----------------------------------------------");

	        for (int i = 0; i < report.length; i++) {
	            System.out.printf("%-6d\t%-10s\t%-10s\t%-5s\t%s\n",
	                    (i + 1), report[i][0], report[i][1], report[i][2], report[i][3]);
	        }

	        System.out.println();
	    }

}
