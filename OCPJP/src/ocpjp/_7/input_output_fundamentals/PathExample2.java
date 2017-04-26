/**
 * 
 */
package ocpjp._7.input_output_fundamentals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author keithclarges
 *
 */
public class PathExample2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("pathWriter1.txt");
		/*
		 * With NIO2 you can call static methods on Files rather than instance methods on File
		 */
		System.out.println(Files.exists(path));
		try {
			Files.createFile(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Files.exists(path));
		
		/*
		 * Long way to create directories
		 */
		Path path1 = Paths.get("/java/source");
		Path path2 = Paths.get("/java/source/directory");
		Path file = Paths.get("/java/source/directory/Program.java");
		
		Files.createDirectory(path1);
		Files.createDirectory(path2);
		Files.createFile(file);
		
		/*
		 * Shorter way
		 */
		Files.createDirectories(path2);
		Files.createFile(file);
	}
	


}
