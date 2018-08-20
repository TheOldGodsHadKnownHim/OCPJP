package ocpjp._5.string_processing_resource_bundles;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author keithclarges
 * 
 * This class is an example of how to create a Java resource bundle
 *
 */
public class Zoo_en extends ListResourceBundle {

	public static void main(String[] args) {

		//ResourceBundle rb =  ResourceBundle.getBundle("ocpjp._5.string_processing_resource_bundles.Zoo", Locale.US);
		ResourceBundle rb =  ResourceBundle.getBundle("Zoo", Locale.US);
		System.out.println(rb.getObject("open"));
		
	}

	@Override
	protected Object[][] getContents() {
		
		// below is the equivalent to the Zoo_en properties file
		
		return new Object [][]{
				{"hello", "Hello"},
				{"open", "The zoo is open from Java RB"}
		};
	}

}
