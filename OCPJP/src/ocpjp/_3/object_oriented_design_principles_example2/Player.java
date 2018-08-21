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
	/*
	 * You have to have the 'public' access modifier here. This is because you cannot reduce the 
	 * visibility of the inherited isFit method from the FitnessAssessment interface. What you will
	 * also notice is that the method declaration in the interface does not contain the 'public'
	 * access modifier. This does not matter. Under the hood, the compiler provides the 'public' 
	 * keyword for all interface methods
	 */
	 public boolean isFit(int fitnessTestScore) {
		if (fitnessTestScore > 8) {
			System.out.println("Player is fit");
			return true;

		} else {
			System.out.println("Player is not fit");
			return false;
		}
	}
	
	//overloaded isFit method with default access modifier
	 boolean isFit(long fitnessTestScore) {
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
