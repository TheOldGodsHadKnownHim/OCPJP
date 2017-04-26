package ocpjp._2.advanced_java_class_design_nested_classes_memberInnerClass;

public class Nested {

	private int x = 10;

	private class DoubleNested {

		private int x = 20;

		private class TripleNested {

			private int x = 30;

			public void printAll() {
				System.out.println(x);// 30
				System.out.println(this.x);// 30
				System.out.println(DoubleNested.this.x);// 20
				System.out.println(Nested.this.x);// 10

			}
		}

	}

	public static void main(String[] args) {

		Nested nested = new Nested();
		Nested.DoubleNested doubleNested = nested.new DoubleNested();
		Nested.DoubleNested.TripleNested tripleNested = doubleNested.new TripleNested();
		tripleNested.printAll();

	}

}
