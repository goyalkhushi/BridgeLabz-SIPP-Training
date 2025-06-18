package level3;
import java.util.*;
public class BonusCalculator {


	    // Generate 2D array with [][0]=oldSalary and [][1]=yearsOfService
	    public static double[][] generateEmployeeData(int n) {
	        Random rand = new Random();
	        double[][] employeeData = new double[n][2];

	        for (int i = 0; i < n; i++) {
	            int salary = rand.nextInt(90000) + 10000; // Random 5-digit salary
	            int years = rand.nextInt(11);             // Random years of service (0–10)
	            employeeData[i][0] = salary;
	            employeeData[i][1] = years;
	        }

	        return employeeData;
	    }

	    // Calculate new salary and bonus based on years of service
	    public static double[][] calculateBonus(double[][] empData) {
	        int n = empData.length;
	        double[][] result = new double[n][3]; // [][0]=bonus, [][1]=newSalary, [][2]=years

	        for (int i = 0; i < n; i++) {
	            double oldSalary = empData[i][0];
	            int years = (int) empData[i][1];
	            double bonusRate = years > 5 ? 0.05 : 0.02;
	            double bonus = oldSalary * bonusRate;
	            double newSalary = oldSalary + bonus;

	            result[i][0] = bonus;
	            result[i][1] = newSalary;
	            result[i][2] = years;
	        }

	        return result;
	    }

	    // Display summary table and totals
	    public static void displaySummary(double[][] empData, double[][] updatedData) {
	        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

	        System.out.printf("%-10s %-15s %-15s %-10s %-15s\n", 
	            "EmpID", "Old Salary", "Years of Service", "Bonus", "New Salary");
	        System.out.println("---------------------------------------------------------------------");

	        for (int i = 0; i < empData.length; i++) {
	            double oldSalary = empData[i][0];
	            int years = (int) empData[i][1];
	            double bonus = updatedData[i][0];
	            double newSalary = updatedData[i][1];

	            System.out.printf("%-10d %-15.2f %-15d %-10.2f %-15.2f\n", 
	                i + 1, oldSalary, years, bonus, newSalary);

	            totalOldSalary += oldSalary;
	            totalNewSalary += newSalary;
	            totalBonus += bonus;
	        }

	        System.out.println("---------------------------------------------------------------------");
	        System.out.printf("%-10s %-15.2f %-15s %-10.2f %-15.2f\n", 
	            "Total", totalOldSalary, "", totalBonus, totalNewSalary);
	    }

	    // Main method
	    public static void main(String[] args) {
	        int employeeCount = 10;

	        double[][] employeeData = generateEmployeeData(employeeCount);
	        double[][] updatedData = calculateBonus(employeeData);

	        displaySummary(employeeData, updatedData);
	    }
	


}
