/**
 * 
 */
package ocpjp._7.input_output_fundamentals;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author keithclarges
 *
 */
public class FileWriter2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char [] in = new char[50];//to store input
		int size = 0;
		
		try {
			File file = new File("fileWriter2.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Howdy folks\n");
			/*
			 * flush method guarantees that the last of your data actually gets written out to the file
			 */
			fileWriter.flush();
			/*
			 * always, always, always close to free up valuable operating system resources
			 */
			fileWriter.close();
			
			FileReader fileReader = new FileReader(file);
			size = fileReader.read(in);
			System.out.print(size + " ");
			for (char c : in){
				System.out.print(c);
			}
			/*
			 * always, always, always close to free up valuable operating system resources
			 */
			fileReader.close();
			
		}catch(IOException ioException){
			
		}
	}

}
