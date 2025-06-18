package level3;
import java.util.*;

public class CalendarGenerator {
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter month (MM): ");
	        int month = scanner.nextInt();
	        System.out.print("Enter year (YYYY): ");
	        int year = scanner.nextInt();

	        printCalendar(month, year);
	        scanner.close();
	    }
	

	    public static String getMonthName(int month) {
	        String[] monthNames = {
	            "January", "February", "March", "April", "May", "June",
	            "July", "August", "September", "October", "November", "December"
	        };
	        return monthNames[month - 1];
	    }

	  
	    public static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }

	   
	    public static int getNumberOfDaysInMonth(int month, int year) {
	        int[] days = {
	            31, 28, 31, 30, 31, 30,
	            31, 31, 30, 31, 30, 31
	        };
	        if (month == 2 && isLeapYear(year)) {
	            return 29;
	        }
	        return days[month - 1];
	    }

	    
	    public static int getFirstDayOfMonth(int month, int year) {
	        int d = 1;
	        int y0 = year - (14 - month) / 12;
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        int m0 = month + 12 * ((14 - month) / 12) - 2;
	        int dayOfWeek = (d + x + (31 * m0) / 12) % 7;
	        return dayOfWeek;
	    }

	    
	    public static void printCalendar(int month, int year) {
	        String monthName = getMonthName(month);
	        int daysInMonth = getNumberOfDaysInMonth(month, year);
	        int startDay = getFirstDayOfMonth(month, year);

	        System.out.println("\n  " + monthName + " " + year);
	        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

	        
	        for (int i = 0; i < startDay; i++) {
	            System.out.print("    ");
	        }

	        for (int day = 1; day <= daysInMonth; day++) {
	            System.out.printf("%3d ", day);
	            if ((day + startDay) % 7 == 0) {
	                System.out.println(); 
	            }
	        }
	        System.out.println();
	    }

	   
}
