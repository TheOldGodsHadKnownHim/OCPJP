/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example6_factory_pattern;

/**
 * @author keithclarges
 *
 */
public class ZooKeeperProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Depending on the animal name value that is passed in to the getFood method, the 
		 * zoo keeper program returns different types of food for use in our FoodFactory
		 * 
		 * The zookeeper doesn't care what type of food that is retrieved, so long as it implements the
		 * food interface
		 * 
		 * At a later date the rules and logic in FoodFactory could be change without having any 
		 * affect on the ZooKeeper program
		 */
		final Food food = FoodFactory.getFood("polar bear");
		food.consumed();
	}

}
