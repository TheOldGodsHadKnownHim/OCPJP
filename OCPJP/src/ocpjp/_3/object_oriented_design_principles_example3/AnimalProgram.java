/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example3;

/**
 * @author keithclarges
 *
 */
public class AnimalProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * This is the only object that is created and referenced
		 * 
		 * It can be passed as an instance of an interface that it implements
		 * and also any of its superclasses. 
		 */
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		/*
		 * Here, the Lemur object is passed as an instance of the interface
		 * that it implements. hasTail reference variable only has access to
		 * the members of the HasTail interface because the type of the reference to the object
		 * determines which methods and variables are accessible to the Java program. 
		 */
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		
		/*hasTail is of reference type HasTail and as such can only access variables and method of the 
		 * HasTail interface*/
		//System.out.println(hasTail.age); compilation error
		
		
		/*
		 * Here, it is also passed to an instance of its superclass. However,
		 * it can only access members that object type. In this case this 
		 * means that primate can only access variables from the primate class
		 */
		Primate primate = lemur;
		System.out.println(primate.hasHair());
		
		
		
		/*
		 * Casting objects so as to access all the members of Lemur
		 */
		
		//Casting a superclass object to a subclass object - a primate to a lemur
		Lemur lemur2 = (Lemur) primate;
		System.out.println(lemur2.age);
		
		//Casting a superclass object to a subclass object
		Lemur lemur3 = (Lemur) hasTail;
		System.out.println(lemur3.age);
	}

}
