/**
 * 
 */
package ocpjp._5.string_processing_dates;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author keithclarges
 *
 */
public class NumberFormat_Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * The numberFormat class is abstract so, like the DateFormat class, you will need to use
		 * static instance methods to create an instance of NumberFormat. The NumberFormat class
		 * is used to format number or currency values
		 */
		
		float fl = 123.4567f;
		Locale france = new Locale("fr");
		
		NumberFormat [] nfa = new NumberFormat[4];
		
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(france);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(france);
		
		for (NumberFormat nf : nfa){
			System.out.println(nf.format(fl));
		}
//		Output
//		123.457
//		123,457
//		€123.46
//		123,46 ¤

	}

}
