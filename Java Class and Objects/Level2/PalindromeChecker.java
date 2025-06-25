package level2;

public class PalindromeChecker {
	
	String text;
	
	public PalindromeChecker(String text) {
		this.text=text;
	}
	
	boolean isPalindrome(String text) {
		String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
	}
	
	void displayInfo(){
		if(isPalindrome(text)) {
			System.out.println("The given String " +text +" is Palindrome");
		}
		else {
			System.out.println("The given String " +text +" is not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		PalindromeChecker st1=new PalindromeChecker("Madam");
		st1.displayInfo();
		
		PalindromeChecker st2=new PalindromeChecker("Geeks");
		st2.displayInfo();
		
	}

}
