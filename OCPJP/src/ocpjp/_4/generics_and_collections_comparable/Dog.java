/**
 * 
 */
package ocpjp._4.generics_and_collections_comparable;

/**
 * @author keithclarges
 *
 */
public class Dog implements Comparable<Dog> {
	
	private String name;
	private Integer id;
	
	Dog (String name, Integer id){
		this.name=name;
		this.id=id;
	}
	
	@Override
	public String toString(){
		return name + id.toString();
	}

	@Override
	public int compareTo(Dog dog) {
		return name.compareTo(dog.name);
	}
	
	/*
	 * It is vitally important that you have consistency between your compareTo and your equals()
	 * method. For example, the compareTo method above is based on name. Therefore, truth in terms
	 * of equality should also be based on name. Commented out below is an incorrect implementation
	 * of equals where id is used as the equality marker
	 */
	@Override
	public boolean equals(Object obj){
		
		if (!(obj instanceof Dog)){
			return false;
		}else {
			Dog dog = (Dog)obj;
			return this.name.equals(dog.name);
		}
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}
}

//@Override
//public boolean equals(Object obj){
//	
//	if (!(obj instanceof Dog)){
//		return false;
//	}else {
//		Dog dog = (Dog)obj;
//		return this.id.equals(dog.id);
//	}
//}
