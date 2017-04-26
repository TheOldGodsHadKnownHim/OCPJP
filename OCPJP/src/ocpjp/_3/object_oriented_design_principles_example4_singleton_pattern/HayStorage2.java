/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example4_singleton_pattern;

/**
 * @author keithclarges
 *
 */
public class HayStorage2 {

	private int quantity = 0;
	private static final HayStorage2 instance;

	// static block
	/*
	 * using the static block to initialise the HayStorage2 instance allows
	 * us to potentially handle cases where the constructor throws an exception
	 */
	static {
		instance = new HayStorage2();
	}

	private HayStorage2() {
	}

	public static HayStorage2 getInstance() {
		return instance;
	}

	// synchronized prevents 2 processes from running the same method at the
	// exact same time
	public synchronized void addhay(int amount) {
		quantity += amount;
	}

	public synchronized boolean removeHay(int amount) {
		if (quantity < amount) {
			return false;
		}
		quantity -= amount;
		return true;
	}

	public synchronized int getHayQuantity() {
		return quantity;
	}
}
