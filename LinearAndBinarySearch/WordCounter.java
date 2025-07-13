package linearandbinarysearch;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Replace with your actual file path
        String targetWord = "hello";     // Word to count (case-sensitive)
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split using whitespace
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("Occurrences of \"" + targetWord + "\": " + count);
        } 
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
