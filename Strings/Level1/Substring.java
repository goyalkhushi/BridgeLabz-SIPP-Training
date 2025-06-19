package level1;

import java.util.*;

public class Substring {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int start=sc.nextInt();
		int end=sc.nextInt();
		String ans =substringCharAt(st,start,end);
		String ans1=st.substring(start, end);
		boolean  result=compareStrings(ans,ans1);
		 System.out.println("Substring using charAt(): " + ans);
	        System.out.println("Substring using substring(): " + ans1);
	        System.out.println("Do both substrings match? " + result);
	   
		
	}
	
	 public static String substringCharAt(String text, int start, int end) {
	        String result = "";
	        for (int i = start; i < end && i < text.length(); i++) {
	            result += text.charAt(i);
	        }
	        return result;
	    }
	 
	 public static boolean compareStrings(String s1, String s2) {
	        if (s1.length() != s2.length()) return false;

	        for (int i = 0; i < s1.length(); i++) {
	            if (s1.charAt(i) != s2.charAt(i)) return false;
	        }
	        return true;
	    }


}
