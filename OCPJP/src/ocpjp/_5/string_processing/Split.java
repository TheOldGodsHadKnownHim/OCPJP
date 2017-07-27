package ocpjp._5.string_processing;

public class Split {

	public static void main(String[] args) {

		String names = "John-.-George-.-Paul-.-Ringo";
		String [] results = names.split("-..");
		
		for (String str: results){
			System.out.println(str);
		}
		
	}

}
