package ocpjp._5.string_processing_resource_bundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class Example2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale locale = new Locale("fr", "CA");
//		Locale locale = new Locale("jy");
//		Locale locale = new Locale("jy");
		ResourceBundle resourceBundle =  ResourceBundle.getBundle("RB", locale);
		System.out.println(resourceBundle.getString("hello"));
	}

}
