/**
 * 
 */
package ocajp._0_Recap.equals;

import ocajp._0_Recap.equals.Referee;

/**
 * @author keithclarges
 *
 */
public class EqualsPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Referee referee = new Referee(1, "Keith Clarges", 1, "2008", 657);
		Referee referee2 = new Referee(2, "Ian Morgan", 1, "2008", 645);
		Referee referee3 = new Referee(1, "Ian Morgan", 1, "2008", 645);
		Referee referee4 = new Referee(1, "Keith Byrne", 1, "2008", 645);

		System.out.println(referee.equals(referee2));

		// reflexive example - should print true
		System.out.println("Reflexive: " + referee.equals(referee));
		// symmetric example - should print true
		System.out.println("Symmetric Part 1: " + referee.equals(referee3));
		System.out.println("Symmetric Part 2: " + referee3.equals(referee));
		// transitive examples - should print true
		System.out.println("Transitive Part 1: " + referee.equals(referee3));
		System.out.println("Transitive Part 2: " + referee3.equals(referee4));
		System.out.println("Transitive Part 3: " + referee.equals(referee4));
		// null check - should return false
		System.out.println("Null check: " + referee.equals(null));
		// not instance of referee check - should return false
		System.out
				.println("Non instanceof check: " + referee.equals("Referee"));

	}

}
