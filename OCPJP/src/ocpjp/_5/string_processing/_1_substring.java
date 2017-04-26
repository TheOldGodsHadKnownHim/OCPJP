package ocpjp._5.string_processing;

public class _1_substring {

	public static void main(String[] args) {

		last2("xxxx");
	}

	public static int last2(String str) {
		int counter = 0;

		if (str.length() >= 3) {

			String endOfString = str.substring(str.length() - 2, str.length());

			for (int i = 0; i < str.length() - 2; i++) {
				if (str.substring(i, i + 2).equals(endOfString)) {
					counter++;
				}
			}
		}
		return counter;
	}
}
