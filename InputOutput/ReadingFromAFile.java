package inputoutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingTextFromFile {

	public static void main(String args[]) {

		StringBuilder text = new StringBuilder();
    
	   	 /*FileInputStream object inputs the actual file into a stream,
	  	  which InputStreamReader uses UTF-8(Default for Linux) Character encryption on. 
	  	  Then it is used by Buffered Reader for performance improvement*/
		try(BufferedReader bf = new BufferedReader(new 
				InputStreamReader(new 
						FileInputStream("src/inputoutput/text/sampleText.txt"),"UTF-8"))){

			String line;
			while((line = bf.readLine()) != null) {
				text.append(line).append("\n"); //Explicitly appending \n because bufferedReader.readLine strips of new line sequence
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(text); //Printing the read file as a String
	}
}
