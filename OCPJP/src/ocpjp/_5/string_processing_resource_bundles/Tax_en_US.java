package ocpjp._5.string_processing_resource_bundles;

import java.util.Date;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author keithclarges
 *
 *This is an example of how to use a ResourceBundle that has an Object, rather than a String value
 */
public class Tax_en_US extends ListResourceBundle {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("ocpjp._5.string_processing_resource_bundles.Tax", Locale.US);
		System.out.println(rb.getObject("tax"));

	}

	@Override
	protected Object[][] getContents() {
		return new Object [][] {
				{
					"tax", new Date()
				}
		};
	}

}
