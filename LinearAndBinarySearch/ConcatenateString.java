package linearandbinarysearch;
import java.util.*;

public class ConcatenateString {
	public static void main(String[] args) {
		String []words= {"Hello"," ","World","!"};
		String res=concatenate(words);
		System.out.print("Concatenated String: " +res);
		
	}
	public static String concatenate(String[] words) {
		StringBuffer sb=new StringBuffer();
		for(String word:words) {
			sb.append(word);
		}
		return sb.toString();
	}

}
