/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example1;

/**
 * @author keithclarges
 *
 *         - Class used to demonstrate the use of lambdas and functional
 *         interfaces
 *
 */
public class Animal {

	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String s, boolean hopper, boolean swimmer) {
		this.species = s;
		this.canHop = hopper;
		this.canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return species;
	}

}
