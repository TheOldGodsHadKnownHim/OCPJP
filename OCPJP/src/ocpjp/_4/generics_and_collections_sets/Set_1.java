/**
 * 
 */
package ocpjp._4.generics_and_collections_sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author keithclarges
 *
 */
public class Set_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set <Integer> hashSetNums = new HashSet<>();
		Set <Integer> treeSetNums = new TreeSet<>();
		
		hashSetNums = performAddingLoop(hashSetNums);		
		treeSetNums = performAddingLoop(treeSetNums);
		
		long hashSetDuration = performGetLoop(hashSetNums);
		long treeSetDuration = performGetLoop(treeSetNums);
		System.out.println(treeSetDuration-hashSetDuration);

	}
	
	private static Set<Integer> performAddingLoop (Set <Integer> set){
				
		for (int i =0; i < 10000000; i++){
			set.add(i);
		}
			
		return set;
	}
	
	private static long performGetLoop (Set <Integer> set){
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < set.size(); i++){
			set.iterator().next();
		}
		
		long endTime = System.currentTimeMillis();
	
		return endTime - startTime;
	}

}
