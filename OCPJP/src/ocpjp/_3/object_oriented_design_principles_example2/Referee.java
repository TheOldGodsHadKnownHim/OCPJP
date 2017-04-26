/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example2;

/**
 * @author keithclarges
 *
 */
public class Referee implements FitnessAssessment {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ocpjp._3.object_oriented_design_principles._1_RefereeingStyle#isFit(int)
	 */
	@Override
	public boolean isFit(int fitnessTestScore) {
		if (fitnessTestScore > 6) {
			System.out.println("Referee is fit");
			return true;

		} else {
			System.out.println("Referee is not fit");
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ocpjp._3.object_oriented_design_principles._1_RefereeingStyle#isConsistent
	 * ()
	 */
	@Override
	public boolean isConsistent(int crucialErrors, int gamesPlayed) {
		if (crucialErrors < 2 || gamesPlayed/crucialErrors > 10){
			System.out.println("Referee is consistent");
			return true;
		}else {
			System.out.println("Referee is inconsistent");
			return false;
		}
	}

}
