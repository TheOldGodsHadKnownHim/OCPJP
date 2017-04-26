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
class Dragon{}
class Unicorn{}
public class LegacyDragons {

	public static void main(String[] args) {

		//pre java5 method of creating a list
		List unicorns = new ArrayList();
		unicorns.add(new Unicorn());
		/*
		 * Java uses a technique called type erasure to interact with legacy code. Essentially, what 
		 * this means is that behind the scenes all the object are changed to Object and then cast back
		 * to their intended object at RunTime. This is fine if developers only pass in objects that will
		 * be able to be cast without issue. However, in the scenario below a List of unicorns is passed
		 * to a method that is expecting a List of type Dragons. When a unicorn is attempted to be cast
		 * to a dragon, a ClassCastException will be thrown. 
		 * 
		 * The point is that the compilet doesn't know unicorns is not a list of dragons. The compiler
		 * only knows that it might not be, and that is why he provides a warning about the fact that
		 * a raw type is being passed. 
		 */
		printDragon(unicorns);
	}
	
	/*
	 * private method to take a list of dragons and print them out
	 */
	private static void printDragon(List<Dragon> dragons){
		for (Dragon dragon : dragons){
			System.out.println(dragon);
		}
	}

}
