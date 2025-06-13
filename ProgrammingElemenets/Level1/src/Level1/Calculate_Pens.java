package Level1;

public class Calculate_Pens {

	public static void main(String[] args) {
		 int totalPens = 14;
	        int students = 3;
	        int pensPerStudent = totalPens / students;
	        int remainingPens = totalPens % students;

	        System.out.println("\nThe Pen Per Student is " + pensPerStudent +
	                " and the remaining pen not distributed is " + remainingPens);
	  
	}

}
