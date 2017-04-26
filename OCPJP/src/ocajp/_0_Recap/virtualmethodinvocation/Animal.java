package ocajp._0_Recap.virtualmethodinvocation;

public abstract class Animal{

	public void makeNoise(){
		System.out.println("Generic animal noise");
	}
	
	//abstract method - implementation must be provided by
	//a concrete class that extends this class
	abstract void feed();
}

