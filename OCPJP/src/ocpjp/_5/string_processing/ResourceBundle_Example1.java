/**
 * 
 */
package ocpjp._5.string_processing;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author keithclarges
 *
 */
public class ResourceBundle_Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

<<<<<<< HEAD
		Locale locale = new Locale(args[0]);
		ResourceBundle resourceBundle =  ResourceBundle.getBundle("Labels", locale);
		System.out.println(resourceBundle.getString("hello"));
=======
		Locale locale = new Locale("fr");
		ResourceBundle resourceBundle =  ResourceBundle.getBundle("Labels", locale);
		System.out.println(resourceBundle.getString("hello"));
		
		System.out.printf("%3$s %3$s %s", "A", "B", "C"); 
>>>>>>> dev_keith
	}

}
