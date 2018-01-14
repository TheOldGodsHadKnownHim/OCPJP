/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example5_immutable_pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ocpjp._3.object_oriented_design_principles_example6_builder_pattern.AnimalBuilder;
import ocpjp._3.object_oriented_design_principles_example6_factory_pattern.Fish;
import ocpjp._3.object_oriented_design_principles_example6_factory_pattern.Food;
import ocpjp._3.object_oriented_design_principles_example6_factory_pattern.FoodFactory;

/**
 * @author keithclarges
 *
 */
public class AnimalProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AnimalBuilder catBuilder = new AnimalBuilder();
		
		Animal_ animal_ = catBuilder.setAge(6).setSpecies("Cat").
				setFavouriteFoods(Arrays.asList("whiskas", "bonio")).setHasFur(true).build();
		/*
		 * IMMUTABLE
		 * 
		 * Because Animal_ has a private constructor any instance to be created needs to be done
		 * using the AnimalBuilder class
		 */
		//Animal_ animal_ = new Animal_("Cat", 6, Arrays.asList("whiskas", "bonio"));
		
		System.out.println("Animals species is: " + animal_.getSpecies());
		System.out.println("Animals age is: " + animal_.getAge());
		
		//Want to print the animal's favourite food but I cannot access the mutable list directly
		List<String> faveFoods = new ArrayList<String>();
		for(int i = 0; i < animal_.getFavouriteFoodsCount(); i++){
			faveFoods.add(animal_.getFavouriteFood(i));
		}
		System.out.println("Animals fave foods are: " + faveFoods.toString());
		
		/*
		 * MUTABLE
		 */
		List<String> foods = new ArrayList<String>();
		foods.add("whiskas");
		foods.add("bonio");
		Animal animal = new Animal(foods);
		System.out.println("Animals fave foods are: " + animal.getFavouriteFoods());
		/*
		 * I now create a new list and populate it by invoking the getter method
		 * from the Animal class
		 */
		List<String> foods2 = animal.getFavouriteFoods();
		/*
		 * The problem is that when I now interact with this list, I cause problems
		 * to my original list, which in the example below, has been totally cleared
		 * out. This is dangerous territory. 
		 */
		foods2.clear();
		/*
		 * Printing from the animal instance now produces an empty list
		 */
		System.out.println("Animals fave foods are: " + animal.getFavouriteFoods());
	}
}
