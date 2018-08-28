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

		/*
		 * we are passing a lambda as the second parameter of the print method. The print method
		 * expects a CheckTrait as the second parameter. Since we are passing a lambda instead, 
		 * Java treats CheckTrait as a functional interface and tries to map it to a single abstract
		 * method. 
		 * 
		 * Because the interface's method takes an Animal, it means that the lambda parameter has
		 * to be an animal. 
		 */
		print(new Animal("fish", false, true), animal -> animal.canSwim());
		print(new Animal("kangaroo", true, false), b -> b.canHop());
		
		/*
		 * Another way these expressions can be written
		 */
		print(new Animal("fish", false, true),  (Animal animal) -> {return animal.canSwim();});
		print(new Animal("kangaroo", true, false),  (Animal b) -> {return b.canHop();});
		
		
		/*
		 * Lambdaing the Sound interface
		 */
		printAnimalSound(new Animal("fish", false, true, "blurphblurphblurph"), animal ->  animal.getCallingSound());
		printAnimalSound(new Animal("kangaroo", true, false, "skippeeeee"), b -> b.getCallingSound());
	}

	private static void print(Animal animal, CheckTrait checkTrait) {
		if (checkTrait.test(animal)) {
			System.out.println(animal);
		}
	}
	
	private static void printAnimalSound(Animal animal, Sound sound) {
		if (sound.makeSound(animal) != null && animal.toString().equals("fish")) {
			System.out.println(animal.getCallingSound());
		}
		if (sound.makeSound(animal) != null && animal.toString().equals("kangaroo")) {
			System.out.println(animal.getCallingSound());
		}
	}

}
