/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example1;

import java.util.function.Predicate;

/**
 * @author keithclarges
 *
 *         - Class used to demonstrate the use of lambdas and functional
 *         interfaces
 *
 */
public class FindMatchingAnimals_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		print(new Animal("fish", false, true), animal -> animal.canSwim());
		print(new Animal("kangaroo", true, false), b -> b.canHop());
		
		print(new Animal("fish", false, true),  (Animal animal) -> {return animal.canSwim();});
		print(new Animal("kangaroo", true, false),  (Animal b) -> {return b.canHop();});
	}

	/*
	 * Using this Predicate interface eliminates the need for the CheckTrait interface. It also make 
	 * the code more reusable. 
	 */
	private static void print(Animal animal, Predicate <Animal> checkTrait) {
		if (checkTrait.test(animal)) {
			System.out.println(animal);
		}
	}

}
