/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example3;

/**
 * @author keithclarges
 *
 */
public class Lemur extends Primate implements HasTail {
	
	public int age = 10;
	
	@Override
	 public boolean isTailStriped(){
		return false;
	}

}
