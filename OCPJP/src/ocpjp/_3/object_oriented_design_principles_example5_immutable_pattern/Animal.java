/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example5_immutable_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keithclarges
 *
 */
public class Animal {

	private final List<String> favouriteFoods;
	
	public Animal (List<String> favouriteFoods){
		if(favouriteFoods == null){
			throw new RuntimeException("favourite foods is required");
		}
		this.favouriteFoods=favouriteFoods;
	}
	
	/*
	 * The inclusion of this method makes the class mutable. The list object to 
	 * which this method points cannot be changed, the items in the list can be
	 * modified. For example, all of the items in the list could be deleted by calling
	 * getFavouriteFoods.clear();
	 * 
	 * The key point here is that references to mutable objects that are contained within
	 * an immutable object should never be shared.
	 */
	public List<String> getFavouriteFoods(){
		return favouriteFoods;
	}
}
