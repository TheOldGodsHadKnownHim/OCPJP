package ocpjp._5.string_processing;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_Example2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale locale = new Locale("fr", "CA");
		ResourceBundle resourceBundle =  ResourceBundle.getBundle("RB", locale);
		System.out.println(resourceBundle.getString("hello"));
	}

}
