package ocpjp._4.generics_and_collections_custom_generics;

public class CrateProgram {
	
public static void main(String [] args){
	
	Crate<Vegetable> veg = new Crate<>();
	
	Vegetable vegetable = new Vegetable();
	vegetable.setName("carrot");
	vegetable.setColour("orange");
	vegetable.setShape("Cylinder");
	vegetable.setWeight(2.0);
	
	String packedVeg = veg.packCrate(vegetable);
	System.out.println(packedVeg);
	
}

}
