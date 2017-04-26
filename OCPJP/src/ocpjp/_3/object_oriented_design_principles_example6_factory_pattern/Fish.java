/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example6_factory_pattern;

/**
 * @author keithclarges
 *
 */
public class Fish extends Food {

	/**
	 * This constructor has default access in order to restrict the creation of a Food object. By doing 
	 * this it means that any class outside of this package can only create a instance of Food by 
	 * going through the FoodFactory. The only limitation of this is that our FoodFactory and all of
	 * our food instances must be created in the same package. 
	 * 
	 * @param quantity
	 */
	 Fish(int quantity) {
		super(quantity);
	}

	@Override
	public void consumed() {
		System.out.println("Fish eaten: " + getQuantity());
	}

}
