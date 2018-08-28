package ocpjp._3.object_oriented_design_principles_example7_functional_interfaces;

import ocpjp._3.object_oriented_design_principles_example1.Animal;

@FunctionalInterface
public interface SprintFaster extends Sprint {

	/*
	 * This is an override of the parent sprint method; therefore, this interface can be considered
	 * a functional interface as it only has one abstract method. 
	 */
	public void sprint(Animal animal);
	
}
