/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example1;

/**
 * @author keithclarges
 *
 *         - Class used to demonstrate the use of lambdas and functional
 *         interfaces
 *
 */
public class FindMatchingAnimals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		print(new Animal("fish", false, true), a -> a.canHop());
		print(new Animal("kangaroo", true, false), a -> a.canHop());
	}

	private static void print(Animal animal, CheckTrait checkTrait) {
		if (checkTrait.test(animal)) {
			System.out.println(animal);
		}
	}

}
