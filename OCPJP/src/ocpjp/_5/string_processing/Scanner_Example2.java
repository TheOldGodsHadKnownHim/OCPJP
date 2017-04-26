/**
 * 
 */
package ocpjp._5.string_processing;

import java.util.Scanner;

/**
 * @author keithclarges
 *
 */
public class Scanner_Example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean b, b2;
		int i;
		String s, hits = "";
		
		Scanner s1 = new Scanner(args[0]);
		Scanner s2 = new Scanner(args[1]);
		s2.useDelimiter(",");
		
		/*
		 * The first while look takes argument 0 and adds an s for every value that exists. In this case
		 * there will be 4 s's added
		 */
		while (b = s1.hasNext()){
			s=s1.next();
			hits += "s";
		}
		/*
		 * This while loop takes the same list of Strings and checks the type of content they are and
		 * then adds to the hits variable accordingly. 
		 */
		while (b = s2.hasNext()){
			if(s2.hasNextInt()){
				i = s2.nextInt();
				hits += "i";
			}else if (s2.hasNextBoolean()){
				b2 = s2.nextBoolean();
				hits+=b;
			}else {
				s2.next();
				hits += "s2";
			}
		}
		System.out.println("Hits: " + hits); //prints Hits: ssssitrueis2

	}

}
