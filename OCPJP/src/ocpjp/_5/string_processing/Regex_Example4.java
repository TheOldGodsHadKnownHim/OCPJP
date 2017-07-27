package ocpjp._5.string_processing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Example4 {

	public static void main(String[] args) {

		String str = "o brother, where art thou! boo man!";
		String rex = "\\Bo";
		String replace = "X";
		Pattern p = Pattern.compile(rex);
		Matcher m = p.matcher(str);
		String val = m.replaceAll(replace);
		System.out.println(val);
	}

}
