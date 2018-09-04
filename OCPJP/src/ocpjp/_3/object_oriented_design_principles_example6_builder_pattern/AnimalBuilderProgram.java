/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example6_builder_pattern;

import java.util.Arrays;

import ocpjp._3.object_oriented_design_principles_example5_immutable_pattern.Animal_;

/**
 * @author keithclarges
 *
 */
public class AnimalBuilderProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AnimalBuilder iguanaBuilder = new AnimalBuilder();
		iguanaBuilder.setAge(3).setSpecies("Reptile")
				.setFavouriteFoods(Arrays.asList("Soup, Cheese"));

		// object created with the final build call
		Animal iguana = iguanaBuilder.build();
		System.out.println(iguana.toString());

		AnimalBuilder cowBuilder = new AnimalBuilder();
		// object created with the final build call chained onto the setters
		System.out.println(cowBuilder.setAge(10)
				.setSpecies("Herefordshire Bullock")
				.setFavouriteFoods(Arrays.asList("Grass, Milk")).build()
				.toString());

	}

}
