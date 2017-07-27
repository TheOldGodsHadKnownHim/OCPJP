package ocpjp._2.advanced_java_class_design_nested_classes_localInnerClass;

public class TestNested {

	public class A {
	}

	public static class B {
	}

	public void useClasses() {
		
		new A();
		new TestNested.A();//same as new a
		new TestNested().new A();
		new TestNested.B();
		//new B();
	}
}