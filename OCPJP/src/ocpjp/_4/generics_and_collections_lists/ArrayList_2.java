/**
 * 
 */
package ocpjp._4.generics_and_collections_lists;

import java.util.Arrays;
import java.util.List;

/**
 * @author keithclarges
 *
 *
 *This class looks at how to convert an array to a list and also how to convert a list back to a 
 *primitive array
 */
public class ArrayList_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		//create array of String object
		String [] toys = {"Wilfred", "Annabel"};
		//print the contents of the array - basic array uses length
		printArray(toys);
		//convert to a list
		List<String> maisieToys = Arrays.asList(toys);
		//print the list
		System.out.println(maisieToys.toString());
		//change one of the values and reprint both - what is interesting here is that even though we
		//have modified a value in maisieToys, it is also reflected in toys because maisieToys is backed
		//by the original array so a change in one is reflected in the other
		maisieToys.set(1, "Jerry");
		printArray(toys);
		System.out.println(maisieToys.toString());
		//further emphasise point by modifying value in original array and reprinting
		toys[0]= "Porridge";
		printArray(toys);
		System.out.println(maisieToys.toString());
		//now make an array from the list
		String  [] toys2 = (String[]) maisieToys.toArray();
		printArray(toys2);
		//prove that the list is not resizable because it is backed by the underlying array which has its
		//size defined at the time of initialization
		try {
			maisieToys.remove(0);
		} catch (UnsupportedOperationException e) {
			System.out.println("UnsupportedOperationException caught. Item cannot be removed from the list");			
		}
		try {
			maisieToys.add(2, "Wilfred");;
		} catch (UnsupportedOperationException e) {
			System.out.println("UnsupportedOperationException caught. Item cannot be added to the list");			
		}

	}
	
	private static void printArray(String [] array){
		for (int i = 0; i < array.length;i++){
			System.out.print(array[i] + " - ");
		}
	}

}
