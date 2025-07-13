package linearandbinarysearch;
import java.util.*;

public class SearchForWord {
	 public static void main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
		 
		 String[] sentences = {"Welcome to the world of coding!",
				 "Java is a widely-used programming language.",
		            "Linear search is simple but slow.",
		            "This is an example sentence."};
	
		        System.out.print("Enter the word to search: ");
		        String word = sc.nextLine();
		        System.out.println("Result: " +searchSentence(sentences, word) );

		 
	 }
	 
	 public static String searchSentence(String[] sentences, String word) {
	        for (String sentence : sentences) {
	            if (sentence.contains(word)) {
	                return sentence;
	            }
	        }
	        return "Not Found";
	    }

}
