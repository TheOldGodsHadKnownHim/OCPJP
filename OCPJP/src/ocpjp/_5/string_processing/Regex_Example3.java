package ocpjp._5.string_processing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Example3 {
	
	public static void main(String[] args) {

//		Pattern p = Pattern.compile("\\w\\d");
//		Matcher m = p.matcher("Chelsea_FC_1905");
//		
//		System.out.println("Source: Chelsea_FC_1905");
		
		Pattern p = Pattern.compile("\\a?");
		Matcher m = p.matcher("aba");
		
		System.out.println("Source: aba");
		
		System.out.println(" Index: 012345678901234" );
		System.out.println("Expression: " + m.pattern());
		/*
		 * find() is the key method - it cranks up the regex engine and does some searching
		 */
		while (m.find()){
			System.out.print("\nStarting position of index match: " + m.start() + " " + m.end());
			String valueReturned = m.group();
			System.out.println("\nValue returned: " + valueReturned);
		}
		System.out.println(" ");
	}

}
