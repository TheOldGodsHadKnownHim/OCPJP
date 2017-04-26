package ocpjp._5.string_processing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Example2 {
	
	public static void main(String[] args) {

		Pattern p = Pattern.compile(args[0]);
		Matcher m = p.matcher(args[1]);
		
		System.out.println("\nSource: " + args[1]);
		System.out.println(" Index: 0123456789" );
		System.out.println("Expression: " + m.pattern());
		while (m.find()){
			System.out.print("\nIndex starting position: " + m.start() + ", " + "Sequence of matching "
					+ "characters: " + m.group());
		}
		System.out.println(" ");
	}
	
	/*
	 * Example 1 - "\d+" "1 a12 234b" 
	 * 
	 * 
	 */
}

