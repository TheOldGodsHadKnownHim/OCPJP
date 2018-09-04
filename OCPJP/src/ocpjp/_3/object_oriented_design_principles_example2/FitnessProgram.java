/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example2;


/**
 * @author keithclarges
 *
 */
public class FitnessProgram {
	
	public void checkFitnessLevels(FitnessAssessment personToAssess, int fitnessScore){
		personToAssess.isFit(fitnessScore);
	}
	
	public void checkConsistencyLevels(FitnessAssessment personToAssess,  int gamesPlayed, int crucialErrors){
		personToAssess.isConsistent(crucialErrors, gamesPlayed);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FitnessProgram fitnessProgram = new FitnessProgram();
		fitnessProgram.checkFitnessLevels(new Referee(), 5);
		fitnessProgram.checkConsistencyLevels(new Referee(), 9, 300);
		fitnessProgram.checkFitnessLevels(new Player(), 9);
		fitnessProgram.checkConsistencyLevels(new Player(), 10, 300);

	}

}
