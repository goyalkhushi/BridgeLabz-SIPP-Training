package linearandbinarysearch;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String st=sc.next();
		
		System.out.print("After removing Duplicates: " +removeDuplicates(st));
	}
	
	public static String removeDuplicates(String st) {
		StringBuilder sb=new StringBuilder();
		HashSet<Character> set=new HashSet<>();
		
		for(char ch:st.toCharArray()) {
			if(!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
