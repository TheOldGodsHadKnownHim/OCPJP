package ocpjp._3.object_oriented_design_principles_example7_functional_interfaces;

import ocpjp._3.object_oriented_design_principles_example1.Animal;

@FunctionalInterface
public interface Sprint {

	void sprint(Animal animal);
	
	/*
	 * Adding a 2nd abstract method would cause a compiler error when using the 
	 * @FunctionalInterface annotation
	 */
	//void walk(Animal animal);

	
}
