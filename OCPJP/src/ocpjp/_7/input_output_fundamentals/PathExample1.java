/**
 * 
 */
package ocpjp._7.input_output_fundamentals;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author keithclarges
 *
 */
public class PathExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Calling the get method from the Paths helper class. Paths.get() is how to create a path
		 * initially
		 */
		Path path = Paths.get("/temp/file.txt");//absolute path - starts at root
		
		/*
		 * Same as path, just a different way to get it
		 */
		Path path2 = Paths.get("/temp", "file.txt"); //absolute path - starts at root
		
		/*
		 * Point to note - when you don't begin with the root, the path is considered a relative path,
		 * which means that Java looks from the current directory
		 */

		/*
		 * Windows paths can be tricky. Below is the path syntax that allows a Windows user to view
		 * a path in the browser. To use a path like this, you have to use the URI.create() method
		 */
		   Path   p = Paths.get(URI.create("file:///C:/temp"));
		   
		   /*
		    * Below is an example of how to convert a Java6 File to a Java7 Path
		    */
			File file = new File("fileWriter1.txt");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Path convertedFileToPath = file.toPath();
			
			/*
			 * And you can convert it back. This is very handy when you are working with older code
			 * and need to flit between the functionality of the 2 classes
			 */
			File convertedPathToFile = convertedFileToPath.toFile();
			
	}

}
