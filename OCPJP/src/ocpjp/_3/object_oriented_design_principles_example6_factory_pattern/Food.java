/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example6_factory_pattern;

/**
 * @author keithclarges
 *
 *
 *
 */
public abstract class Food {
	
	private int quantity;
	
	public Food(int quantity){
		this.quantity=quantity;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public abstract void consumed();

}

