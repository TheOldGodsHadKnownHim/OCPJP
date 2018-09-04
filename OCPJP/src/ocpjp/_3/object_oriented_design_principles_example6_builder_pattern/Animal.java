package ocpjp._3.object_oriented_design_principles_example6_builder_pattern;

import java.util.ArrayList;
import java.util.List;

import ocpjp._3.object_oriented_design_principles_example6_builder_pattern.AnimalBuilder;

public final class Animal {
	
	private final String species;
	private final int age;
	private final List<String> favouriteFoods;
	private final boolean hasFur;

	public Animal (String species, int age, List<String> favouriteFoods, boolean hasFur){
		this.species=species;
		this.age=age;
		if(favouriteFoods == null){
			throw new RuntimeException("favourite foods is required");
		}
		this.favouriteFoods=new ArrayList<String>(favouriteFoods);
		this.hasFur = hasFur;
	}
	
	public String getSpecies(){
		return species;
	}
	
	public int getAge(){
		return age;
	}
	
	public boolean getHasFur(){
		return hasFur;
	}
	
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
	

}
