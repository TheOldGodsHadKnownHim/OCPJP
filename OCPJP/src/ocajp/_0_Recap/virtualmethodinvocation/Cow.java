package ocajp._0_Recap.virtualmethodinvocation;

public class Cow extends Animal {

	@Override
	public void feed() {
		feedCow();
	}
	
	@Override
	public void makeNoise(){
		System.out.println("MOOOOOOOOOOOOOO!!!!!!");
	}

	private void feedCow() {
		System.out.println("Happy cow eating his hay");
	}

}
