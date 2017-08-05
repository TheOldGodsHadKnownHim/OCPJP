package ocpjp._2.advanced_java_class_design_nested_classes_staticNestedClass;

public class Enclosing {
	
	//This instance variable is not available to the static nested class
	private int total=50;
	
	private static int penalty = 100;
	
		public static class Nested{
			private int price = 6;
			
			public int getPrice(){
				return this.price;
			}
			
			public int getPenalty(){
				return penalty;
			}
		}

	public static void main(String[] args) {
		Nested nested = new Nested();
		System.out.println(nested.price);
		//below won't compile as non-static variables of the outer class are not accessible to a static inner classes
		//System.out.println(nested.total);
		
		Enclosing.Nested nested2 = new Enclosing.Nested();
		int x = nested2.price;
		System.out.println(x);
		int y = nested2.getPenalty();
		System.out.println(y);

				
	}

}
