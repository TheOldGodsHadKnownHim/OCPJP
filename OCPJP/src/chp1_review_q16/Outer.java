package chp1_review_q16;

public class Outer {
	
	class Inner {}

	public static void main(String[] args) {
		
		/*
		 * A member inner class needs to be created using an instance of the outer class. First it 
		 * creates an object of the outer class and then from that it creates the object of the inner class
		 */

		//Inner in = new Inner();//missing outer instance
		//Inner in1 = Outer.new Inner();//can't resolve outer
		//Outer.Inner in2 = new Outer.Inner();//missing brackets and new keyword for inner instance
		//Outer.Inner in3 = new Outer().Inner();//missing new keyword for inner instance
		Outer.Inner in4 = new Outer().new Inner();
		Inner in5 = new Outer().new Inner();
		
		//a way of doing it in 2 steps
		Outer outer = new Outer();
		Inner inner = outer.new Inner();



	}

}
