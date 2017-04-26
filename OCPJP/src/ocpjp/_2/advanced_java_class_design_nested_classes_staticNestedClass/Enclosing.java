package ocpjp._2.advanced_java_class_design_nested_classes_staticNestedClass;

public class Enclosing {
	
	private int total=50;
	
		static class Nested{
			private int price = 6;
		}

	public static void main(String[] args) {
		Nested nested = new Nested();
		System.out.println(nested.price);
				
	}

}
