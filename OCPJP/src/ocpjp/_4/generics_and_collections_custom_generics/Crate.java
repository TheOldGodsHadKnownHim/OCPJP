/**
 * 
 */
package ocpjp._4.generics_and_collections_custom_generics;

/**
 * @author keithclarges
 *
 */

/*
 * T is used for a generic data type. T will be available anywhere within the crate class. When you
 * instantiater the class you tell the compiler what should be used in place of T for that particular
 * instance
 * 
 */
public class Crate <T>{
	
	private T contents;
	
	public T emptyCrate(){
		return contents;
	}
	
	public String packCrate(T contents){
		this.contents=contents;
		return this.contents.toString() + " is being packed";
	}

}
