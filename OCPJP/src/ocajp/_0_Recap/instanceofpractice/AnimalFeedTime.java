package ocajp._0_Recap.instanceofpractice;

public class AnimalFeedTime {

	public static void main(String[] args) {
		
		feedAnimal(new Bird());
	}

	public static void feedAnimal(Animal animal) {
		if (animal instanceof Cow) {
			((Cow) animal).eatHay();
		} else if (animal instanceof Bird) {
			((Bird) animal).eatSeed();
		} else if (animal instanceof Lion) {
			((Lion) animal).eatMeat();
		}
	}
}
