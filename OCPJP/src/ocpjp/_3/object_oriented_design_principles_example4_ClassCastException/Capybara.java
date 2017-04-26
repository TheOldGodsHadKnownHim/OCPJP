/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example4_ClassCastException;

/**
 * @author keithclarges
 *
 */
public class Capybara extends Rodent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Rodent rodent = new Rodent();
		//Runtime exception thrown because a rodent is not necessarily a capybara
//		Capybara capybara = (Capybara)rodent;
//		System.out.println(capybara.isUgly);
		
		if (rodent instanceof Capybara){
			Capybara capybara = (Capybara)rodent;
			System.out.println(capybara.isUgly);
		}else {
			System.out.println("Rodent is not an instance of capybara");

		}
		
	}

}
