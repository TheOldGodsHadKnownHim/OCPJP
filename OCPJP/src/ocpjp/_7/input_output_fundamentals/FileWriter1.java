/**
 * 
 */
package ocpjp._7.input_output_fundamentals;

import java.io.File;
import java.io.IOException;

/**
 * @author keithclarges
 *
 */
public class FileWriter1 {

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
		 * Not making the actual file yet; here we have made the filename only
		 */
		try {
			
			File file = new File("fileWriter1.txt");
<<<<<<< HEAD
<<<<<<< HEAD
			
=======
>>>>>>> dev_keith
=======
>>>>>>> dev_kc
			/*
			 * if the file doesn't already exist, let's create it. If it is successfully created, true will be
			 * returned
			 */
			if (!file.exists()){
				System.out.println(file.createNewFile());
			}		
		} catch (IOException e) {
			e.printStackTrace();
<<<<<<< HEAD
<<<<<<< HEAD
		}
		
	}

}
=======
		}}}
>>>>>>> dev_keith
=======
		}}}
>>>>>>> dev_kc
