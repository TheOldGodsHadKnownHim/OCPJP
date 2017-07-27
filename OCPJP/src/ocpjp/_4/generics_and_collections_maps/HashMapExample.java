/**
 * 
 */
package ocpjp._4.generics_and_collections_maps;

import java.util.HashMap;
import java.util.Map;

/**
 * @author keithclarges
 *
 */
public class HashMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> dev_kc
		
		

System.out.printf("This is %1$s %1$s %1$s", "what", "it", "is"); 
System.out.printf("\n"); 

 
<<<<<<< HEAD
>>>>>>> dev_keith
=======
>>>>>>> dev_kc

		/*
		 * A HashMap stores keys in a hash table. This means that it uses the hashCode() method
		 * of the keys to retrieve their values more efficiently. The main benefit of this is that adding
		 * and retrieving elements by key both have constant time. The drawback is that you lose the
		 * order in which you inserted the elements. 
		 * 
		 * If you wanted to maintain the order in which you inserted the items you could use a TreeMap
		 */
		Map <String, String> faveRestaurants = new HashMap<>();
		
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> dev_kc

		
		faveRestaurants.put("0", null);
		System.out.println(faveRestaurants.get("0"));//prints Taste Food Company
		faveRestaurants.put(null, "bla[]]h");

		System.out.println(faveRestaurants.get(null));//prints Taste Food Company
		System.out.println(faveRestaurants.get(null));//prints Taste Food Company

		
<<<<<<< HEAD
>>>>>>> dev_keith
=======
>>>>>>> dev_kc
		//add data to the map
		faveRestaurants.put("1", "Taste Food Company");
		faveRestaurants.put("2", "Lovely Food Company");
		faveRestaurants.put("3", "Cafe Amore");

		System.out.println(faveRestaurants.isEmpty());//prints false
		System.out.println(faveRestaurants.size());//prints 3
		System.out.println(faveRestaurants.get("1"));//prints Taste Food Company
		System.out.println(faveRestaurants.get("4"));//prints null
		System.out.println(faveRestaurants.remove("4"));//prints null
		System.out.println(faveRestaurants.remove("3"));//prints Cafe Amore
		System.out.println(faveRestaurants.containsKey("3"));//prints false
		System.out.println(faveRestaurants.containsKey("2"));//prints true
		System.out.println(faveRestaurants.containsValue("McDonalds"));//prints false
		System.out.println(faveRestaurants.containsValue("Taste Food Company"));//prints true
		System.out.println(faveRestaurants.containsKey("3"));//prints false
		System.out.println(faveRestaurants.keySet());//prints [1,2]
		System.out.println(faveRestaurants.values());//prints [Taste Food Company,Lovely Food Company]
		faveRestaurants.clear();//removes everything from the map
		System.out.println(faveRestaurants.isEmpty());//prints true
	}
}
