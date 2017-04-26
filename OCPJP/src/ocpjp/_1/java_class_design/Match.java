/**
 * 
 */
package ocpjp._1.java_class_design;



/**
 * @author keithclarges
 *
 */
public class Match {

	public MatchDuration matchDuration;
	
	static MatchDuration matchDuration2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Match match = new Match();
		match.matchDuration = MatchDuration.U15_U16;
				
		Match match1 = new Match();
		match1.matchDuration = MatchDuration.U17_U18;
				
		for (MatchDuration matchDuration: MatchDuration.values()){
			System.out.println(matchDuration + " plays " +matchDuration.getMinutes() + " minutes.");

		}
	}

}
