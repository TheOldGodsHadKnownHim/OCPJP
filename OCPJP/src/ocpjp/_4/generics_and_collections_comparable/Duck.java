/**
 * 
 */
package ocpjp._4.generics_and_collections_comparable;

/**
 * @author keithclarges
 *
 */
public class Duck implements Comparable<Duck> {
	
	private String name;
	
	Duck(String name){
		this.name=name;
	}
	
	@Override
	public String toString(){
		return name;
	}
	
	/*
	 * We will be comparing the ducks by name. The String class already has a compareTo method
	 * so we can just delegate to that. 
	 * 
	 * How the comparTo method actually works
	 * 
	 * If both ducks have the exact same name, 0 will be returned
	 * 
	 * If name is smaller than duck.name a number less than 0 will be returned
	 * 
	 * If name is bigger than duck.name a number greater than 0 will be returned
	 */
	@Override
	public int compareTo(Duck duck){
		return name.compareTo(duck.name);
	}

}
