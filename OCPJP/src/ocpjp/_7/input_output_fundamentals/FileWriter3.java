/**
 * 
 */
package ocpjp._7.input_output_fundamentals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * @author keithclarges
 *
 */
public class FileWriter3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File file = new File("fileWriter3.txt");
		try {
			//let's create the file
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.println("Hello everybody.");
			printWriter.println("I am creating a file using the PrintWriter class.");
			printWriter.flush();
			printWriter.close();
			
			//let's read from the file
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			//use a StringBuilder to build the output
			StringBuilder stringBuilder = new StringBuilder();
					
			//iterate over the file
			while(bufferedReader.ready()){
				stringBuilder.append(bufferedReader.readLine() +"\n");
			}			
			bufferedReader.close();
			System.out.println(stringBuilder);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
