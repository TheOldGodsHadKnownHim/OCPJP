/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example4_singleton_pattern;

/**
 * @author keithclarges
 *
 */
public class LlamaTrainer {
	
	public boolean feedLlamas(int numberOfLlamas){
		
		int amountNeeded = 5 * numberOfLlamas;
		
		HayStorage hayStorage = HayStorage.getInstance();

		if (hayStorage.getHayQuantity() < amountNeeded){
			hayStorage.addHay(amountNeeded + 10);
		}
		
		//check that there's enough hay to feed the llamas as there could
		//be multiple llama trainers and any one of them could have taken
		//hay to feed the llamas before we had a chance to use it. 
		boolean fed = hayStorage.removeHay(amountNeeded);
		
		if (fed){
			System.out.println("Llamas have been fed");
		}
		
		return fed;
	}

}
