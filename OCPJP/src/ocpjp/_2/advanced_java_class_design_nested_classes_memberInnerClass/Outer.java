package ocpjp._2.advanced_java_class_design_nested_classes_memberInnerClass;

public class Outer {

	private String greeting = "Hello - this greeting is being accessed from a "
			+ "method in the Inner class";

	// defined at the member level
	protected class Inner {

		public void go() {
			// Can access private members of outer class
			System.out.println(greeting);
		}
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		// Call the method where the Inner class is instantiated
		outer.callInner();

		// another way to print the greeting
		Outer outer2 = new Outer();
		Inner inner = outer2.new Inner();
		inner.go();
	}

}
