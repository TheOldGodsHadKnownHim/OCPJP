/**
 * 
 */
package ocpjp._4.generics_and_collections_lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keithclarges
 *
 */
public class ArrayList_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List <String> maisieToys = new ArrayList<>();
		System.out.println(maisieToys.add("Wilf"));//prints true - [Wilf]
		System.out.println(maisieToys.add("Blocks"));//prints true - [Wilf, Blocks]
		maisieToys.add(1,"Giraffe");//void return type - can't print - [Wilf, Giraffe, Blocks]
		System.out.println(maisieToys.set(1,"Annabel"));//prints Giraffe - [Wilf, Annabel, Blocks]
		//maisieToys.add(1,"Giraffe");//void return type - can't print - [Wilf, Giraffe, Blocks]
		//System.out.println(maisieToys.set(1,"Annabel"));//prints Giraffe - [Wilf, Annabel, Blocks]
		maisieToys.add("Porridge");
		System.out.println(maisieToys);
	}

}
