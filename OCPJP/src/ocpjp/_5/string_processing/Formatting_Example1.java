/**
 * 
 */
package ocpjp._5.string_processing;

/**
 * @author keithclarges
 *
 */
public class Formatting_Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i1 = -123;
		int i2 = 12345;
		
		/*
		 * Take the first arg, put negative numbers in brackets and print the result to a minimum 
		 * of 7 places. 
		 */
		System.out.printf(">%1$(7d< \n", i1);
		/*
		 * Pad this argument with zeroes if necessary, using the locale specific comma to a minimum
		 * of 7 places
		 */
		System.out.printf(">%0,7d< \n", i2);
		/*
		 * Include a + or - sign with this arg to a minimum of 7 places
		 */
		System.out.format(">%+-7d< \n", i2);
		/*
		 * Print the 2nd arg first (should be a boolean) and print the 1st arg second to a minimum of
		 * 5 places
		 */
		System.out.printf(">%2$b + %1$5d< \n", i1, false);
	}

}
