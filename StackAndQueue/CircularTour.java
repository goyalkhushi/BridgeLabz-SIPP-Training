package stackandqueue;
import java.util.*;

public class CircularTour {
	
	public static int findStartPoint(int[] petrol, int[] distance) {
        int n = petrol.length;

        int totalSurplus = 0;
        int currentSurplus = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int surplus = petrol[i] - distance[i];
            totalSurplus += surplus;
            currentSurplus += surplus;

            if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0;
            }
        }

        return (totalSurplus >= 0) ? start : -1; 
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
        int[] petrol =new int[n];
        int[] distance = new int[n];
        System.out.println("Enter elements of petrol: ");
        for(int i=0;i<n;i++) {
        	petrol[i]=sc.nextInt();
        }
        
        System.out.println("Enter distance: ");
        for(int i=0;i<n;i++) {
        	distance[i]=sc.nextInt();
        }
        
        

        int startPoint = findStartPoint(petrol, distance);
        if (startPoint == -1)
            System.out.println("No possible start point to complete the tour.");
        else
            System.out.println("Start at pump index: " + startPoint);
    }
	
	
}
