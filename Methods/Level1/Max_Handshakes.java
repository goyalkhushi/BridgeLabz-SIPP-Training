package level1;
import java.util.*;
	
public class Max_Handshakes {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int handshake=calculateHandshakes(n);
		System.out.print("The maximum number of handshakes is: " +handshake);
		

	}
	
	 public static int calculateHandshakes(int n) {
	        return (n * (n - 1)) / 2;
	    }

}
