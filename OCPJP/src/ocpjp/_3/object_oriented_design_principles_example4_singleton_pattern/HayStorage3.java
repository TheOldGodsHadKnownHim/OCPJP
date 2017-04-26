/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example4_singleton_pattern;

/**
 * @author keithclarges
 *
 *         Applying lazy initialisation
 */
public class HayStorage3 {

	private int quantity = 0;

	private HayStorage3() {
	};

	/*
	 * Because we are using lazy-initialisation the compiler will not allow us
	 * to set the variable as final. As a result of this it is not thread safe
	 * as two threads could call the getInstance() method at the same time,
	 * meaning that there would be 2 objects in memory, when we only want one.
	 * 
	 * The way around this is to use the synchronized keyword on the
	 * getInstance() method, which will ensure that only one thread can access
	 * the method at a time, and thus, only one object will be created.
	 */
	private static HayStorage3 instance;

	public static synchronized HayStorage3 getInstance() {
		/*
		 * Does not create the singleton object when the class is loaded into
		 * memory, but rather the first time it is requested by the client
		 */
		if (instance == null) {
			instance = new HayStorage3();// not thread safe
		}
		return instance;
	}

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
