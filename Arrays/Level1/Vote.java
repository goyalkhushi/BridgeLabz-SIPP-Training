package Level1;
import java.util.*;
public class Vote {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int []arr=new int[10];
		for(int i=0;i<10;i++) {
			System.out.println("Enter a age: ");
			arr[i]=sc.nextInt();
			
		}
		for(int age:arr) {
			if(age>18) {
				System.out.println("The student of the age " +age +" can vote");
			}
			else if(age<18) {
				System.out.println("Invalid Age");
			}
			else {
				System.out.println("The student with the age" +age +" cannot age");
			}
		}

	}

}
