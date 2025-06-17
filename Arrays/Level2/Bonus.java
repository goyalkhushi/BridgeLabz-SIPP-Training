package level2;
import java.util.*;

public class Bonus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double []years = new double[10];
		double []salary = new double[10];
		double []bonus = new double[10];
		double []new_salary =  new double[10];
		
		double totaloldsalary=0;
		double totalbonus=0;
		double newsalary=0;
		
		for(int i=0;i<10;i++) {
			double sal = sc.nextDouble();
			
			if(sal<=0) {
				System.out.println("Invalid salary,Enter again");
				i--;
				continue;
			}
			double year = sc.nextDouble();
			if(year<0) {
				System.out.println("Invalid year,Please Enter valid year");
				i--;
				continue;
			}
			salary[i]=sal;
			years[i]=year;
			
		}
		
		
		for(int i=0;i<10;i++) {
			double bonus1 = (years[i]>5)?(salary[i]*0.05):(salary[i]*0.02);
			bonus[i]=bonus1;
			new_salary[i]=salary[i]+bonus[i];
			
			totaloldsalary+=salary[i];
			totalbonus+=bonus[i];
			newsalary+=new_salary[i];
		}
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Employee " + (i+1) +": ");
			System.out.println("Salary: " +salary[i]
								+", Bonus: " +bonus[i]
								+", New Salary: " +new_salary[i]);
		}
		
		System.out.println("Company totals:");
		System.out.println("Total Old salary of Employee: " +totaloldsalary
							+"\nTotal bonus of all: " +totalbonus
							+"\n Total new Salary: " +newsalary);
	}

}
