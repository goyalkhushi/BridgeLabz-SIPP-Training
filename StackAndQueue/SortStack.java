package stackandqueue;
import java.util.*;

public class SortStack {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n=sc.nextInt();
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++) {
			int value=sc.nextInt();
			st.push(value);
		}
		System.out.print("Original Stack: " +st);
		sorted(st);
		System.out.print("Sorted Stack: " + st);
		
	}
	public static void sorted(Stack<Integer> st) {
		if(!st.isEmpty()) {
			int top=st.pop();
			sorted(st);
			insertStack(st,top);
		}
	}
	
	public static void insertStack(Stack<Integer> st,int ele) {
		if(st.isEmpty() || ele>st.peek()) {
			st.push(ele);
		}
		else {
			int temp=st.pop();
			insertStack(st,ele);
			st.push(temp);
		}
	}

}
