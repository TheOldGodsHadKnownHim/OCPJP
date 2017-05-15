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

//		Path path = Paths.get("pathWriter1.txt");
//		/*
//		 * With NIO2 you can call static methods on Files rather than instance methods on File
//		 */
//		System.out.println(Files.exists(path));
//		try {
//			Files.createFile(path);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(Files.exists(path));
//		
//		/*
//		 * Long way to create directories
//		 */
//		Path path1 = Paths.get("/java/source");
//		Path path2 = Paths.get("/java/source/directory");
//		Path file = Paths.get("/java/source/directory/Program.java");
//		
//		Files.createDirectory(path1);
//		Files.createDirectory(path2);
//		Files.createFile(file);
//		
//		/*
//		 * Shorter way
//		 */
//		Files.createDirectories(path2);
//		Files.createFile(file);
		
		
		/*
		 * NORMALIZE
		 */
		
		Path path3 = Paths.get("/home/java/../list/hello.text");//go up one directory from home
		Path path3a = Paths.get("/home/java/../list/../hello.text");
		Path path4 = path3.normalize();
		Path path4a = path3a.normalize();
		System.out.println(path4);//output = /home/java/hello.txt
		System.out.println(path4a);//output = /home/hello.txt
		
		/*
		 * RESOLVE
		 */
		
		Path path5 = Paths.get("/home/java/");//go up one directory from home
		Path path5a = Paths.get("list/hello.text");
		Path path5b = Paths.get("/list/hello.text");
		Path path6 = path5.resolve(path5a);
		System.out.println(path6);//output = /home/java/list/hello.txt
		Path path6a = path5.resolve(path5b);
		System.out.println(path6a);//output = /list/hello.txt - / is massively important here
		
		/*
		 * RELATIVIZE - path1.relativize(path2):
		 * 
		 * How do I get to path2 from path1? 
		 */

		Path absolutePath7 = Paths.get("/home/java/how_to.txt");
		Path absolutePath7a = Paths.get("/home/java/temp/test.txt");
		Path absolutePath8 = Paths.get("/home/angular/how_to.text");
		Path relativePath9 = Paths.get("angular/how_to.txt");
		Path relativePath10 = Paths.get("mongo/how_to.txt");

		
		Path relativizedPath7 = absolutePath7.relativize(absolutePath7a);
		System.out.println(relativizedPath7);//prints ../temp/test.tx
		Path relativizedPath7a = absolutePath7a.relativize(absolutePath7);
		System.out.println(relativizedPath7a);//prints ../../how_to.tx
		Path relativizedPath7b = absolutePath7.relativize(absolutePath8);
		System.out.println(relativizedPath7b);//prints ../../angular/how_to.txt
		//Path relativizedPath7c = absolutePath8.relativize(relativePath9);
		//System.out.println(relativizedPath7c);//prints exception because only one path is absolute
		Path relativizedPath7d = relativePath9.relativize(relativePath10);
		System.out.println(relativizedPath7d);//prints ../../mongo/how_to.txt
		
		Path absolutePath9 = Paths.get("/temp/testCopy.txt");
		Path absolutePath10 = Paths.get("/temp/testCopy2.txt");
		
		boolean p11 = Files.isSameFile(absolutePath9, absolutePath10);
		System.out.println(p11);
		
	}
	
	


}
