/**
 * 
 */
package ocpjp._5.string_processing_dates;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * @author keithclarges
 *
 */
public class NumberFormat_Example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		float fl = 123.45678f;
		
		NumberFormat nf = NumberFormat.getInstance();
		
		//default value of 3
		System.out.println(nf.getMaximumFractionDigits());//3
		
		//Notice how the number is rounded not truncated
		System.out.println(nf.format(fl));//123.457
		
		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(fl));//123.45678
		
		try {
			System.out.println(nf.parse("123.4567"));//123.4567
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parse("123.4567"));//123
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}

	}

}
