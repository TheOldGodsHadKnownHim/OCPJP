package ocpjp._2.advanced_java_class_design_nested_classes_staticNestedClass;

public class Enclosing {
	
	private int total=50;
	
		public static class Nested{
			private int price = 6;
			
			public int getPrice(){
				return this.price;
			}
		}

	public static void main(String[] args) {
		Nested nested = new Nested();
		System.out.println(nested.price);
		//below won't compile as variables of the outer class are not accessible to a static inner classes
		//System.out.println(nested.total);
		
		Enclosing.Nested nested2 = new Enclosing.Nested();
		int x = nested2.price;

				
	}

}
