package level2;
import java.util.*;

public class StudentVoteChecker {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int []ages=new int[10];
		for(int i=0;i<10;i++) {
			ages[i]=sc.nextInt();
			boolean flag=canStudentVote(ages[i]);
			 if (ages[i] < 0) {
	                System.out.println("Invalid age. Student cannot vote.");
	            } 
			 else if (flag) {
	                System.out.println("Student with age " + ages[i] + " can vote.");
	            } 
			 else {
	                System.out.println("Student with age " + ages[i] + " cannot vote.");
	            }
			
		}
		
	
	}

	public static boolean canStudentVote(int age) {
		if(age<0) {
			return false;
		}
		else if(age>18) return true;
		return false;
	}
}
