/**
 * 
 */
package ocpjp._7.input_output_fundamentals;

import java.io.File;

/**
 * @author keithclarges
 *
 */
public class FileSearching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Create a string array to store any search results
		String [] files = new String [10];
		//Indicate the directory we need to search
		File search = new File("IOSamples");
		//Pass a list of all files in the specified directory to the files array
		files = search.list();
		//Iterate over the array and print out the results of what is contained therein
		for (String file : files){
			System.out.println("Found: " + file);
		}
		
	}
	}

