/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example4_singleton_pattern;

/**
 * @author keithclarges - 
 * 
 * This class is responsible for managing the amount of hay that is accessible
 * to animal trainers/feeders across the zoo application. We only need one 
 * instance of the HayStorage object in memory
 * 
 * Instead of passing the same shared HayManager object to every class and method
 * that uses it, the better option is to create a singleton class. This strategy
 * centralises the data and removes the need to keep passing it around the 
 * application This way, we do not have a whole lot of pointers to all of the 
 * HayManager objects in memory
 *
 */
public class HayStorage {
	
	private int quantity = 0;
	
	//Constructors are always marked private to ensure that no other class
	// is capable of instantiating another version of the class. By making
	// the constructors private, the class is effectively marked final
	private HayStorage(){};
	
	//creation of the singleton - always created as private static variable
	private static final HayStorage instance = new HayStorage();
	
	//This method will allow us to access the HayStorage singleton instance
	public static HayStorage getInstance(){
		return instance;
	}
	//synchronized prevents 2 processes from running the same method at the 
	//exact same time
	public synchronized void addhay(int amount){
		quantity += amount;
	}
	
	public synchronized boolean removeHay(int amount){
		if (quantity < amount){
			return false;
		}
		quantity -= amount;
		return true;
	}
	
	public synchronized int getHayQuantity(){
		return quantity;
	}

}
