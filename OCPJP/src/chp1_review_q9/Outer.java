package chp1_review_q9;

public class Outer {
	
	private int x = 24;
	
	
	/**
	 * This is a method that contains a local inner class. 
	 * @return x
	 */
	public int getX(){
		String message = "x is " + x;
		
		//local inner class
		class Inner {
			 private int x = Outer.this.x;
			 
			 public void printX(){
				 System.out.println(message + x);
			 }
		}
		
		Inner in = new Inner();
		in.printX();
		return x;
	}

	public static void main(String[] args) {
			new Outer().getX();
	}

}
