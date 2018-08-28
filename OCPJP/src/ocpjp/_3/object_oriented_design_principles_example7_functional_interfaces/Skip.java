package ocpjp._3.object_oriented_design_principles_example7_functional_interfaces;

import ocpjp._3.object_oriented_design_principles_example1.Animal;

@FunctionalInterface
public interface Skip extends Sprint {
	
	/*
	 * Neither of the below methods are abstract so the resulting Skip interface only has one
	 * abstract method (the one it inherits from Sprint)
	 */
	
	public default int getHopCount(Animal animal) {
		return 10;
	}
	
	public static void skip (int speed){
		
	}

}
