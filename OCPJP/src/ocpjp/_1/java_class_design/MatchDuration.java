/**
 * 
 */
package ocpjp._1.java_class_design;

/**
 * @author keithclarges
 *
 */
public enum MatchDuration {
	
	
	U12_U13(60), U14(70), U15_U16 (80), U17_U18(90);
	//U12_U13, U14, U15_U16, U17_U18;
	
	MatchDuration(){
	}

	
	MatchDuration(int minutes){
		this.minutes = minutes;
	}
	
	private int minutes;
	
	public int getMinutes(){
		return this.minutes;
	}


}
