/**
 * 
 */
package ocpjp._4.generics_and_collections_generics_and_legacy_code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keithclarges
 *
 */
public class LegacyAutoboxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//create raw list
		List numbers = new ArrayList<>();
		/*
		 * add a primitive int to that list and Java will automatically autobox it to an Integer because
		 * List is a type that holds objects and Integer is an object, whereas int is not
		 */
		numbers.add(5);
		/*
		 * Because we are not using generics in the creation of our List, Java has no idea that the 
		 * list contains an Integer. It only knows that we have an Object, and an Object CANNOT
		 * be unboxed into an int. Hence the code below would get a compiler error. 
		 */
		//int result = numbers.get(0);
	}

}
