package ocajp._0_Recap.virtualmethodinvocation;

public class Lion extends Animal {
	

	@Override
	public void feed() {
		feedLion();
	}
	
	@Override
	public void makeNoise(){
		System.out.println("ROARRRRRRRRR!!!!!");
	}

	private void feedLion() {
		System.out.println("Happy lion eating his meat");
	}

}
