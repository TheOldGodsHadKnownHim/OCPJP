/**
 * 
 */
package ocpjp._4.generics_and_collections_generics_and_legacy_code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keithclarges
 *
 */
public class LegacyUnicorns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List <Unicorn> unicorns = new ArrayList<>();
		addUnicorn(unicorns);
		/*
		 * It is a this point that problems arise because at index position 0 is a dragon, yet the developer
		 * here is clearly expecting there to be a Unicorn there. A ClassCastException will be thrown. 
		 */
		Unicorn unicorn = unicorns.get(0);
	}

	/*
	 * Takes a List as an argument but it does not specify what type of list. This has the potential 
	 * to cause an issue if the developer does not pass in the expected object, which is a unicorn 
	 */
	private static void addUnicorn(List unicorn){
		//a Dragon is added and this is not a problem for now because there is no restrictionn in what
		//type can be added
		unicorn.add(new Dragon());
	}
}
