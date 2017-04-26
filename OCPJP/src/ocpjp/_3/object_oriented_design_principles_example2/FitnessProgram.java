/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example2;


/**
 * @author keithclarges
 *
 */
public class FitnessProgram {
	
	public void checkFitnessLevels(FitnessAssessment personToAssess){
		personToAssess.isFit(9);
	}
	
	public void checkConsistencyLevels(FitnessAssessment personToAssess){
		personToAssess.isConsistent(3, 0);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FitnessProgram fitnessProgram = new FitnessProgram();
		fitnessProgram.checkFitnessLevels(new Referee());
		fitnessProgram.checkConsistencyLevels(new Referee());
		fitnessProgram.checkFitnessLevels(new Player());
		fitnessProgram.checkConsistencyLevels(new Player());

	}

}
