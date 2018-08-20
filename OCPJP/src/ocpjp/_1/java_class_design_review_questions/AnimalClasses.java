package ocpjp._1.java_class_design_review_questions;
//q17
public enum AnimalClasses {
	
	// if the enum contains more detail than just the name, then it must end in a semicolon
	MAMMAL(true), FISH(Boolean.FALSE), BIRD(false), REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false);
	
	boolean hasHair;
	
	// enum constructors must be private
	private AnimalClasses (boolean hasHair){
		this.hasHair=hasHair;
	}
	
	public boolean hasHair(){
		return hasHair;
	}
	
	public void giveWig(){
		hasHair=true;
	}

}
