package linearandbinarysearch;

public class Compare {
	public static void main(String[] args) {
		int n=1000000;
		String text="hello";
		//for String Buffer
		StringBuffer sBuffer=new StringBuffer();
		long startBuffer=System.nanoTime();
		for(int i=0;i<n;i++) {
			sBuffer.append(text);
		}
		long endBuffer=System.nanoTime();
		long bufferDuration=endBuffer-startBuffer;
		
		//for StringBuilder
		
		StringBuilder sBuilder=new StringBuilder();
		long startBuilder=System.nanoTime();
		
		for(int i=0;i<n;i++) {
			sBuilder.append(text);
			
		}
		long endBuilder=System.nanoTime();
		long builderDuration=endBuilder-startBuilder;
		
		
		System.out.println("StringBuffer Time: " +sBuffer);
		System.out.println("StringBuilder Time: " +sBuilder);
		
	}

}
