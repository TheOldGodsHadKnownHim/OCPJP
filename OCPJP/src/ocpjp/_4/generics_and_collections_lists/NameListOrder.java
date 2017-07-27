/**
 * 
 */
package ocpjp._4.generics_and_collections_lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author keithclarges
 *
 */
public class NameListOrder {

	public static List <String> getNameList(){
		
		String [] names = {"Barry", "Chris", "Adam"};
		List <String> list = Arrays.asList(names);
		return list;
		
	}
	public static void main(String[] args) {

		List<String> list = getNameList();
		Comparator c = Collections.reverseOrder();
		Collections.sort(list,c);
		System.out.println(list.toString());
	}

}
