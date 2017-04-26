/**
 * 
 */
package ocajp._0_Recap.hashCode;

/**
 * @author keithclarges
 *
 */
public class HashCodePractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Card card = new Card(1,"Ace", "Hearts");
		Card card2 = new Card(2,"Queen", "Spades");
		Card card3 = new Card(3,"Ace", "Hearts");

		System.out.println(card.equals(card2));
		System.out.println(card.equals(card3));
		System.out.println(card3.equals(card));
		System.out.println(card.hashCode());
		System.out.println(card2.hashCode());
		System.out.println(card3.hashCode());
		
		System.out.println(card3.hashCode() == card.hashCode());


	}

}
