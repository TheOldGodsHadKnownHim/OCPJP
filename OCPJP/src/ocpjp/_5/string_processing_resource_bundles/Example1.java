/**
 * 
 */
package ocpjp._5.string_processing_resource_bundles;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author keithclarges
 *
 */
public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale locale = new Locale(args[0]);
		ResourceBundle resourceBundle =  ResourceBundle.getBundle("Labels", locale);
		System.out.println(resourceBundle.getString("hello"));

		Locale localeFr = new Locale("fr");
		ResourceBundle resourceBundleFr =  ResourceBundle.getBundle("Labels", localeFr);
		System.out.println(resourceBundleFr.getString("hello"));
		
		System.out.printf("%3$s %3$s %s", "A", "B", "C"); 
	}

}
