package ocpjp._2.advanced_java_class_design_nested_classes_localInnerClass;

public class Onion {

	private String data = "skin";

	private class Layer extends Onion {
		String data = "thegoodpart";

//		public String getData() {
//			return data;
//		}
	}

	public Layer getData() {
		//return new Layer().getData();
		return new Layer();
	}

	public static void main(String[] args) {
		Onion o = new Onion();
		System.out.println(o.getData().data);
	}
}