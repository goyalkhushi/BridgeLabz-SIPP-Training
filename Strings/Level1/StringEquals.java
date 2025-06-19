package level1;
import java.util.*;

public class StringEquals {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		String st2=sc.next();
		System.out.print("The result using chrAt" +(compareStringsCharAt(st,st2)));
		System.out.print("The result using Equals" +(st.equals(st2)));
		

	}
	public static boolean compareStringsCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }


}
