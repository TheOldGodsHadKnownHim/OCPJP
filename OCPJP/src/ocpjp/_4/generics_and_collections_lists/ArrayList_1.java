package ocpjp._4.generics_and_collections_lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_1 {
	
	public static void main (String [] args){
		
		String input = "The lazy brown fox";
		
		String [] words = input.split(" ");
		
		String output = reverseString(input);
		System.out.println(output);
		


}

	private static String reverseString(String input){
		
		String [] words = input.split(" ");
		
		String output = "";
		
		for (int i = words.length-1; i >= 0; i--){
			output = output.concat(words[i].concat(" "));
		}
		
		return output;
	}
	
}