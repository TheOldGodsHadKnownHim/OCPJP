/**
 * 
 */
package ocajp._0_Recap.enums;

/**
 * @author keithclarges
 *
 */
public enum OnlyOne {
	
	ONCE(true);
	
	private OnlyOne(boolean b){
		System.out.println("Calling the OnlyOne constructor");
	}
	
	public static void main (String [] args){
		
		OnlyOne firstCall = OnlyOne.ONCE;
		OnlyOne secondCall = OnlyOne.ONCE;

	}

}
