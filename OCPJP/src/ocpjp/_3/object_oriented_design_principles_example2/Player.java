/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example2;

/**
 * @author keithclarges
 *
 */
public class Player implements FitnessAssessment {
	
	@Override
	public boolean isFit(int fitnessTestScore) {
		if (fitnessTestScore > 8) {
			System.out.println("Player is fit");
			return true;

		} else {
			System.out.println("Player is not fit");
			return false;
		}
	}

	@Override
	public boolean isConsistent(int crucialErrors, int gamesPlayed) {
		if (crucialErrors < 2 || gamesPlayed/crucialErrors > 5){
			System.out.println("Player is consistent");
			return true;
		}else {
			System.out.println("Player is not consistent");
			return false;
		}
	}

}
