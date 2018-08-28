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
	private String callingSound;
	
	public Animal(String s, boolean hopper, boolean swimmer) {
		this.species = s;
		this.canHop = hopper;
		this.canSwim = swimmer;
	}

	public Animal(String s, boolean hopper, boolean swimmer, String s1) {
		this.species = s;
		this.canHop = hopper;
		this.canSwim = swimmer;
		this.callingSound = s1;
	}

	public boolean canHop() {
		return this.canHop;
	}

	public boolean canSwim() {
		return this.canSwim;
	}
	
	public String getSpecies(){
		return this.species;
	}
	
	public String getCallingSound(){
		return this.callingSound;
	}

	@Override
	public String toString() {
		return this.species;
	}

}
