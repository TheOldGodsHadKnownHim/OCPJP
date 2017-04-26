package ocpjp._4.generics_and_collections_custom_generics;

public class Vegetable {

	private String name;
	private String shape;
	private double weight;
	private String colour;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString(){
		return "An " + this.colour + " " + this.name + " that weighs " + this.weight + " kilos.";
	}
}
