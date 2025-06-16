package Level1;
import java.util.*;
public class Mean_Height_of_Players {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double []heights = new double[11];
			double total=0;
		for(int i=0;i<11;i++) {
			System.out.print("Enter height of player:" +(i+1)+": ");
			heights[i]=sc.nextInt();
			total+=heights[i];
			
		}
		double mean=total/11;
		System.out.print("The mean height of football players is: " +mean);

	}

}
