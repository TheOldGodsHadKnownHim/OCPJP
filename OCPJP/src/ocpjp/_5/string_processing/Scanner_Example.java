/**
 * 
 */
package ocpjp._5.string_processing;

import java.util.Scanner;

/**
 * @author keithclarges
 *
 */
public class Scanner_Example {

	/**
	 * @param args
	 * 
	 * java Scanner_Example "\d\d"
  		input: 1b2c335f456
	 */
	public static void main(String[] args) {

		System.out.print("Input: ");
		System.out.flush();
		try {
			Scanner s = new Scanner(System.in);
			String token;
			do {
				token = s.findInLine(args[0]);
				System.out.println("Found: " + token);
			}while (token != null);
			
		}catch(Exception e){
			System.out.println("scan exc");
		}
	}

}
