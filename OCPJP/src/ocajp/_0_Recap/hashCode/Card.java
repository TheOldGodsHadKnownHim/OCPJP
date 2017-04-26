/**
 * 
 */
package ocajp._0_Recap.hashCode;

/**
 * @author keithclarges
 *
 */
public class Card {

	private String rank;
	private String suit;
	private int serialNumber;

	public Card(int serialNumber, String rank, String suit) {
		if (serialNumber < 0 || rank == null || suit == null) {
			throw new IllegalArgumentException();
		}
		this.rank = rank;
		this.suit = suit;
		this.serialNumber = serialNumber;
	}

	@Override
	public boolean equals(Object obj) {

		// check cast
		if (obj instanceof Card) {
			Card card = (Card) obj;
			return rank.equals(card.rank) && suit.equals(card.suit);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return this.serialNumber;
	}

}
