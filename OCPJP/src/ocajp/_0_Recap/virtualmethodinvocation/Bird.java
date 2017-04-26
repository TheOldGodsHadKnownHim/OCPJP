package ocajp._0_Recap.virtualmethodinvocation;

public class Bird extends Animal {
	
	@Override
	public void makeNoise() {
		System.out.println("BACAWWWWWW!");
	}
	
	@Override
	public void feed(){
		feedBird();
	}
	
	private void feedBird(){
		System.out.println("Happy bird eating his seed");
	}

}