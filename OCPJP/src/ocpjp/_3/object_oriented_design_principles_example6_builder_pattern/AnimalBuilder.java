package ocpjp._3.object_oriented_design_principles_example6_builder_pattern;

import java.util.List;

import ocpjp._3.object_oriented_design_principles_example5_immutable_pattern.Animal_;

/**
 * This is a mutable class. It can be modified as it is built and the result of the build method will
 * be an immutable object. Using the builder patter is analagous to taking a mutable object and
 * making it read-only
 * 
 * @author keithclarges
 *
 */
public class AnimalBuilder {
	
	private  String species;
	private int age;
	private List<String> favouriteFoods;
	private boolean hasFur;

	public AnimalBuilder setAge(int age){
		this.age = age;
		return this;
	}
	
	public AnimalBuilder setSpecies(String species){
		this.species=species;
		return this;
	}
	
	public AnimalBuilder setFavouriteFoods(List<String> foods){
		this.favouriteFoods=foods;
		return this;
	}
	
	public AnimalBuilder setHasFur(boolean hasFur){
		this.hasFur = hasFur;
		return this;
	}
	
	/**
	 * Method to build an Animal_ object. It is here that the method interacts with Animal_'s
	 * constructor directly
	 * 
	 * @return a new instance of type Animal_
	 */
	public Animal_ build(){
		return new Animal_(species, age, favouriteFoods, hasFur);
	}

}
