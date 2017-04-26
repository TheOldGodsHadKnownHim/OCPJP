/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example6_factory_pattern;

/**
 * @author keithclarges
 *
 */
public class FoodFactory {
	
	public static Food getFood(String animalName){
		
		switch(animalName){
		case "zebra": return new Hay(100);
		//we see below that different animals can share the same food
		case "rabbit": return new Pellets(5);
		case "goat": return new Pellets(30);
		case "polar bear": return new Fish(10);

		}
		throw new UnsupportedOperationException("Unsupported animal: " + animalName);
	}

}
