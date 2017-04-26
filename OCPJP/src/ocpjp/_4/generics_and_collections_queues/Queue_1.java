/**
 * 
 */
package ocpjp._4.generics_and_collections_queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * @author keithclarges
 *
 */
public class Queue_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayDeque<String> faveNames = new ArrayDeque<>();
		/*
		 * add an element to the back of the queue - if the size of the queue is fixed and an attempt
		 * is made to add an element to a full queue, an IllegalStateException will be thrown. 
		 */
		System.out.println(faveNames.add("Maisie"));
		//should print Maisie
		System.out.println(faveNames.element());
		/*
		 * add an element to the back of the queue - should print true - would print false if this was a
		 * 	fixed size queue and it couldn't be added
		 */
		System.out.println(faveNames.offer("Ted")); //[Maisie, Ted]
		System.out.println(faveNames.offer("Wilf")); //[Maisie, Ted, Wilf]
		/*
		 * Remove an element from the queue - will only remove a single instance - prints true if 
		 * element exists
		 */
		System.out.println(faveNames.remove("Ted")); //[Maisie, Wilf]
		//add Ted back in, but this time to the front
		faveNames.push("Ted"); //[Ted, Maisie, Wilf]
		//remove an element from the top of the queue and return it - prints and returns Ted
		System.out.println(faveNames.poll()); //[Maisie, Wilf]
		//returns the element from the top of the queue -prints Maisie
		System.out.println(faveNames.peek()); //[Maisie, Wilf]
		//remove an element from the top of the queue and return it - prints and returns Ted
		System.out.println(faveNames.pop()); //[Wilf]
		
		/*
		 * If the queue was empty and pop was attempted, a NoSucElementException would be 
		 * thrown. However, if poll did the same, a null would be returned.                                            
		 */

		System.out.println(faveNames.toString());
	}
}
