package level1;

public class Student {
	
	static String universityName="Harvard";
	final int rollNumber;
	
	String name;
	String grade;
	
	static int totalStudent=0;
	
	Student(String name,String grade,int rollNumber){
		this.name=name;
		this.grade=grade;
		this.rollNumber=rollNumber;
		totalStudent++;
		
	}
	
	static void displayTotalStudent() {
		System.out.println("The Total Number of Student: " +totalStudent);
	}
	
	void displayInfo() {
		System.out.println("University: " + universityName);
		System.out.println("The name of Student is: " +name);
		System.out.println("The grade of Student is: " +grade);
		System.out.println("The RollNumber of Student is: " +rollNumber);
	}
	
	void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println(name + "'s grade updated to: " + grade);
    }
	
	 public static void main(String[] args) {
	        
	        Student s1 = new Student("Chandler", "A", 101);
	        Student s2 = new Student("Rosh", "B", 102);

	       
	        if (s1 instanceof Student) {
	            System.out.println("\nStudent 1 Details:");
	            s1.displayInfo();
	        }

	        if (s2 instanceof Student) {
	            System.out.println("\nStudent 2 Details:");
	            s2.displayInfo();
	        }
	        
	        if (s2 instanceof Student) {
	            s2.updateGrade("A+");
	        }

	        
	        Student.displayTotalStudent();
	    }
	
}
