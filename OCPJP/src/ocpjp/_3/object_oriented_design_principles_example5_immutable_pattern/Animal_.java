package ocpjp._3.object_oriented_design_principles_example5_immutable_pattern;

import java.util.ArrayList;
import java.util.List;

import ocpjp._3.object_oriented_design_principles_example6_builder_pattern.AnimalBuilder;

//Example of an immutable class - Rule 5 --the class is marked final
// so it cannot be subclassed and therefore it's methods cannot be overridden
public final class Animal_ {
	
	//Rule 1 - all fields marked private and final
	private final String species;
	private final int age;
	private final List<String> favouriteFoods;
	private final boolean hasFur;

	//Rule 2 - a constructor is used to set all the properties of the object
	private Animal_ (String species, int age, List<String> favouriteFoods, boolean hasFur){
		this.species=species;
		this.age=age;
		if(favouriteFoods == null){
			throw new RuntimeException("favourite foods is required");
		}
		this.favouriteFoods=new ArrayList<String>(favouriteFoods);
		this.hasFur = hasFur;
	}
	
	//Rule 3 - no setter methods are defined
	public String getSpecies(){
		return species;
	}
	
	public int getAge(){
		return age;
	}
	
	public boolean getHasFur(){
		return hasFur;
	}
	
	//Rule 4 - no references to the mutable list are publically available
	public int getFavouriteFoodsCount(){
		return favouriteFoods.size();
	}
	
	public String getFavouriteFood(int index){
		return favouriteFoods.get(index);
	}
	
	@Override
	public String toString(){
		return "This " + age + " year old "+ species + " loves to eat " + favouriteFoods.toString();
		
	}
	
	public static class AnimalBuilder{
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
		 * private constructor directly
		 * 
		 * @return a new instance of type Animal_
		 */
		public Animal_ build(){
			return new Animal_(species, age, favouriteFoods, hasFur);
		}
	}

}
