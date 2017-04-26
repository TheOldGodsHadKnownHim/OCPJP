package ocpjp._1.java_class_design;

public class Micra extends Car {

	public static void main(String[] args) {

		Micra micra = new Micra();
		// implement abstract methods in first concrete superclass
		micra.goUphill();
		micra.getEngineSize();
		// inherited non-abstract methods
		micra.beepHorn();// overriding the method from parent
		micra.expelFumes();// from grandparent

		// Overloading the beepHorn method
		micra.beepHorn(2);
		micra.beepHorn(8);

	}

	@Override
	void goUphill() {
		System.out.println("Micra trundling uphill");
	}

	@Override
	void getEngineSize() {
		System.out.println("1.2L");
	}

	@Override
	public void beepHorn() {
		System.out.println("HHHHOOOOOOOOOONK!!!!");
	}

	public void beepHorn(int force) {
		if (force < 5) {
			System.out.println("BEEP BEEP!");
		} else {
			System.out.println("HHHHOOOOOOOOOONK!!!!");
		}
	}

}
