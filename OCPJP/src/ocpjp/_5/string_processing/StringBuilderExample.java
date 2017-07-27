package ocpjp._5.string_processing;

public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("8");
		int i = 8;
		// System.out.println(8 + i + sb); Compilation issue - you can't add an
		// int and a Stringbuilder object
		System.out.println(8 + i + sb.toString());// however, you can append a
													// String to an int
	}

}
