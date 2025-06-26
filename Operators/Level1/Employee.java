package level1;

public class Employee {
	
	static String companyName ="Microsoft";
	final int id;
	static int totalEmployees=0;
	
	String name;
	String designation;
	
	Employee(String name,String designation,int id){
		this.name=name;
		this.designation=designation;
		this.id=id;
		totalEmployees++;	
	}
	
	
	
	static int displayTotalEmployees() {
		return totalEmployees;
	}
	
	void displayInfo() {
		System.out.println("The name of Employee is: " +name);
		System.out.println("The Designation of Employee is: " +designation);
		System.out.println("The Id of Employee is: " +id);
	}
	
	
	public static void main(String[] args) {
		
		//Object-real entity of class we create object using new keyword
		Employee emp1=new Employee("Joey" ,"Software Developer",21);
		Employee emp2 = new Employee("Rachael","Tester",22);
		
		if(emp1 instanceof Employee) {
			System.out.println("\n Employee1 Details: ");
			emp1.displayInfo();
		}
		
		if(emp2 instanceof Employee) {
			System.out.println("\n Employee1 Details: ");
			emp2.displayInfo();
		}
		
		System.out.println("\n Total Employees: "  +Employee.displayTotalEmployees());
	}
	

}
