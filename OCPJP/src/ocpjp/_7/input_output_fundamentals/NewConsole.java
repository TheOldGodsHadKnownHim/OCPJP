/**
 * 
 */
package ocpjp._7.input_output_fundamentals;

import java.io.Console;

import junit.framework.Assert;

/**
 * @author keithclarges
 *
 */
public class NewConsole {
	
	public static void main(String[] args) {

		String name = "";
		Console console = System.console();
		
		Assert.assertNotNull(console);
		
		char [] pw;
		
		pw = console.readPassword("%s", "pw: ");
		
		for (char ch : pw){
			console.format("%c ", ch);
			console.format("\n");
		}

		MyUtility myUtility = new MyUtility();
		while(true){
			name = console.readLine("%s", "input ? : ");
			console.format("output: %s \n", myUtility.doStuff(name));
		}
	}
}

class MyUtility{
	
	String doStuff(String arg1){
		return "Result is " + arg1;
	}
}


