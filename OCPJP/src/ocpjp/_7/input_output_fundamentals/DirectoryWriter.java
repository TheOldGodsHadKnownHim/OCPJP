/**
 * 
 */
package ocpjp._7.input_output_fundamentals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author keithclarges
 *
 */
public class DirectoryWriter {

<<<<<<< HEAD
<<<<<<< HEAD
	/**
	 * @param args
	 */
=======
>>>>>>> dev_keith
=======
>>>>>>> dev_kc
	public static void main(String[] args) {		
		/*
		 * Creating a directory is a two step process. First we create a File object and then we create
		 * and actual directory by invoking the mkdir() method. 
		 */
		File directory = new File("IOsamples");
		directory.mkdir();
		
		/*
		 * Once you have a directory, you can put files in to it
		 */
		File file = new File(directory, "fileWriter4.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * Now let's write a few lines to the file
		 */
		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter(file);
			printWriter.println("Keith is my name");
			printWriter.println("Michelle is my  wife's name");
			printWriter.println("Maisie is my daughter's name");
			printWriter.flush();
			printWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
