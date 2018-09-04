package ocpjp._3.object_oriented_design_principles_example4_ClassCastException;

import ocpjp._3.object_oriented_design_principles_example3.Lemur;
import ocpjp._3.object_oriented_design_principles_example3.Primate;

public class CastingProgram {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Primate primate = new Lemur();
		System.out.println(primate.hasHair());

		Lemur lemur = (Lemur) primate;
		System.out.println(lemur.age);

		Rodent rodent = new Rodent();
		// Runtime exception thrown because a rodent is not necessarily a
		// capybara


		Rodent rodent2 = new Capybara(); 
		
		Rodent rodent3 = new Rodent();
		
		Capybara capybara1 = new Capybara();
		
		
		/*
		 * Casting an object from a subclass to a superclass doesn't require an explicit cast
		 */
		rodent3 = capybara1;
		System.out.println(rodent3.isUgly);
		
		/*
		 * Casting an object from a superclass to a subclass does require an explicit cast
		 */
		capybara1 = (Capybara)rodent3;
		System.out.println(capybara1.isUgly);
		System.out.println(capybara1.numLegs);


		
		/*
		 * The compiler will not allow casts to unrelated types
		 */
		capybara1 = (Lemur)rodent3;

		/*
		 * Even when the code compiles without issue, an exception may be thrown at runtime if the 
		 * object being cast is not actually an instance of that class. See example below. The compiler
		 * can't know that rodent isn't an instance of Capybara
		 */
		try {
			Capybara capybara = (Capybara)rodent;
			System.out.println(capybara.isUgly);
		} catch (ClassCastException cce) {
			System.out.println(cce.getMessage());
		}
		
		isCapybara(rodent);
		isCapybara(rodent2);
	}
	
	public static void isCapybara(Rodent rodent){
		if (rodent instanceof Capybara) {
			Capybara capybara = (Capybara) rodent;
			System.out.println(capybara.isUgly);
			System.out.println(capybara.numLegs);
		} else {
			System.out.println("Rodent is not an instance of capybara");
		}
	}
}
