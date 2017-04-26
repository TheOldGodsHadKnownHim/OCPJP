/**
 * 
 */
package ocpjp._5.string_processing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author keithclarges
 *
 */
public class Regex_Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Pattern p = Pattern.compile(args[0]);
		Matcher m = p.matcher(args[1]);
		
		System.out.println("\nSource: " + args[1]);
		System.out.println(" Index: 0123456789" );
		System.out.println("Expression: " + m.pattern());
		System.out.print("Match positions: "  );
		while (m.find()){
			System.out.print(m.start() + ", ");
		}
		System.out.println(" ");
	}
	
	/*
	 * Example of searching String by regexes
	 * 
	 * Example 1 - Searching for a combination of letters ("ab" in this case)
	 * 
	 * use the args "ab" "abdjhab"
	 * 
	 * prints Match positions: 0, 5,  
	 * 
	 * Example 2 - searching for all of the numeric digits in a String
	 * 
	 *  \d is the expression used to look for numeric digits
	 *  
	 *  Use the args to "\\d" "a12wed34fgt56"
	 *  
	 *  prints Match positions: 1, 2, 6, 7, 11, 12,  
	 *  
	 *  Example 3 - searching for all the word characters in a String
	 *  
	 *  Use the args "\\w" "a 1 56 _z"
	 *  
	 *  prints Match positions: 0, 2, 4, 5, 7, 8,  
	 *  
	 *  Example 4 - searching for a boundary condition (word versus non-word in this case). In cases
	 *  that meet this condition it is always the second character in a pair of characters that gets
	 *  selected
	 *  
	 *  Use the args "\\b" "w2w w$ &#w2"
	 *  
	 *  prints Match positions: 0, 3, 4, 5, 9, 11,  
	 *  
	 *  Example 5 - searching for a word boundary condition 
	 *  
	 *  Use the args "\\b" "#ab de#"
	 *  
	 *  prints Match positions: 1, 3, 4, 6,  
	 *  
	 *  Example 6 - searching for a not-a-word-boundary condition
	 *  
	 *  Use the args "\\B" "#ab de#" - assume invisible chars at start and end of String.\B matches
	 *  all positions where \b doesn't match
	 *  
	 *  prints Match positions: 0, 2, 5, 7,  
	 */

}
