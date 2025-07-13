package linearandbinarysearch;
import java.io.*;

public class ReadBinaryAsText {
	public static void main(String[] args) {
		
		File file=new File("sample.txt");
		try (
	            FileInputStream fis = new FileInputStream(file);
	            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
	            BufferedReader br = new BufferedReader(isr);
	        ) 
		{
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	        }
		catch (UnsupportedEncodingException e) {
	            System.out.println("Unsupported encoding: " + e.getMessage());
	        }
		catch (FileNotFoundException e) {
	          
	        	System.out.println("File not found: " + file.getAbsolutePath());
	        } 
		catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }
		
	

}
