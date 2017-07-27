package ocpjp._2.advanced_java_class_design_nested_classes_anonymousInnerClass;

public class TestClass {
	
	public class A {
		
	}
	
	public static class B {
		
	}
	
	public static void main (String [] args){
		
		class C{
			
		}	
		new C();
		new TestClass().new A();
		new TestClass.B();
		new B();
	}

}
