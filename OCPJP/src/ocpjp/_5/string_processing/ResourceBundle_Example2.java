package ocpjp._5.string_processing;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_Example2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

<<<<<<< HEAD
		Locale locale = new Locale("fr", "CA");
=======
		Locale locale = new Locale("jy");
>>>>>>> dev_keith
		ResourceBundle resourceBundle =  ResourceBundle.getBundle("RB", locale);
		System.out.println(resourceBundle.getString("hello"));
	}

}
