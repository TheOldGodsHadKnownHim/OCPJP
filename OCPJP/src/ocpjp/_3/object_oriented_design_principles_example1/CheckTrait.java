/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example1;

import ocpjp._3.object_oriented_design_principles_example2.Player;


/**
 * @author keithclarges
 *
 * - Interface used to demonstrate the use of lambdas and functional interfaces
 *
 */
@FunctionalInterface
public interface CheckTrait {

	public boolean test(Animal animal);
	//public boolean test2(Player player);
}
