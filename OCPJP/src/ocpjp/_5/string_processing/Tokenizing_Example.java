/**
 * 
 */
package ocpjp._5.string_processing;

/**
 * @author keithclarges
 *
 */
public class Tokenizing_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
		
		/*
		 * args[0] = "ab5 ccc 45 @" 
		 * args[1] = "\d"
		 * 
		 * contiguous digits (those touching or sharing a border create an empty token)
		 */

		String [] tokens = args[0].split(args[1]);
		System.out.println("Number of tokens: " + tokens.length);
		
		for (String s : tokens){
			System.out.println(">" + s + "<");
		}
=======
=======
>>>>>>> dev_kc

		/*
		 * args[0] = "ab5 ccc 45 @" args[1] = "\d"
		 * 
		 * contiguous digits (those touching or sharing a border create an empty
		 * token)
		 */

//		String[] tokens = args[0].split(args[1]);
//		System.out.println("Number of tokens: " + tokens.length);
//
//		for (String s : tokens) {
//			System.out.println(">" + s + "<");
//		}

		java.util.StringTokenizer st = new java.util.StringTokenizer(
				"a aa aaa", "x");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

<<<<<<< HEAD
>>>>>>> dev_keith
=======
>>>>>>> dev_kc
	}

}
