package extras;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateArithmetic {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input, inputFormat);

        LocalDate added = date.plusDays(7).plusMonths(1).plusYears(2);

        LocalDate result = added.minusWeeks(3);

        System.out.println("Original date: " + date);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + added);
        System.out.println("After subtracting 3 weeks: " + result);
    }

}
