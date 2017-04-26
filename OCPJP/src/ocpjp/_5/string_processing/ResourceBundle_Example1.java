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

		Locale locale = new Locale(args[0]);
		ResourceBundle resourceBundle =  ResourceBundle.getBundle("Labels", locale);
		System.out.println(resourceBundle.getString("hello"));
	}

}
