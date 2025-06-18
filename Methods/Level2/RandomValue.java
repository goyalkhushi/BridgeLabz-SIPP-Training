package level2;
import java.util.*;

public class RandomValue {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		 int[] randomNumbers = generate4DigitRandomArray(5);

	        System.out.print("Generated numbers: ");
	        for (int num : randomNumbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        double[] stats = findAverageMinMax(randomNumbers);
	        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f\n", stats[0], stats[1], stats[2]);

	}

	public static int[] generate4DigitRandomArray(int size) {
        int[] randoms = new int[size];
        for (int i = 0; i < size; i++) {
            randoms[i] = (int)(Math.random() * 9000) + 1000; // Range: 1000-9999
        }
        return randoms;
    }

 public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
}
