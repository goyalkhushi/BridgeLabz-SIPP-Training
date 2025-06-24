package level1;

public class EmployeeDetails {
	
	
	    String name;
	    int id;
	    double salary;

	    // Constructor
	    public EmployeeDetails(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	    
	    public void displayDetails() {
	        System.out.println("Employee Details:");
	        System.out.println("Name   : " + name);
	        System.out.println("ID     : " + id);
	        System.out.println("Salary : ₹" + salary);
	    }

	    // Main method to test
	    public static void main(String[] args) {
	       
	        EmployeeDetails emp = new EmployeeDetails("Khushi Goyal", 101, 55000.00);

	        emp.displayDetails();
	    }
	


}
