package ocajp._0_Recap.virtualmethodinvocation;

public class AnimalFeedTime {

	public static void main(String[] args) {
				
		//alternate to instanceof strategy
		Bird bird = new Bird();
		Lion lion = new Lion();
		Cow cow = new Cow();
		
		//all animals call the same method that they have inherited from their
		//abstract superclass. However, how they have all chosen to implement
		// it is entirely up to them. This is much more efficient than the 
		// casting that happens with the instanceof strategy
		feedAnimal(bird);
		feedAnimal(lion);
		feedAnimal(cow);
		hearAnimal(bird);
		hearAnimal(lion);
		hearAnimal(cow);

	}
	//look how much shorter and more efficient the feedAnimal method can be
	public static void feedAnimal(Animal animal){
		//Java looks at the actual animal type at Runtime and then calls the 
		//appropriate method. This is called virtual method invocation
		animal.feed();
	}
	
	//look how much shorter and more efficient the feedAnimal method can be
	public static void hearAnimal(Animal animal){
		//Java looks at the actual animal type at Runtime and then calls the 
		//appropriate method. This is called virtual method invocation
		animal.makeNoise();
	}
}
