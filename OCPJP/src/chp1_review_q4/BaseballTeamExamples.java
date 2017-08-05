package chp1_review_q4;

public class BaseballTeamExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseballTeam baseballTeam = new BaseballTeam("Milwaukee", "Brewy", 40);
		
		BaseballTeam baseballTeam1 = new BaseballTeam("Milwaukee", "Brewy", 41);
		
		BaseballTeam baseballTeam2 = new BaseballTeam("Delawaret", "Delly", 22);

		
		/*
		 * A baseball team's equality is based on the name of the city and the name of the mascot. If they
		 * are identical 2 baseball teams are considered equal. 2 identical baseball teams must have the 
		 * same hashcode
		 * 
		 * On the other hand 2 baseball teams could have the same hashcode, but may not be equal
		 * 
		 */

		System.out.println(baseballTeam.equals(baseballTeam1));	
		System.out.println(baseballTeam.hashCode());
		System.out.println(baseballTeam1.hashCode());
		
		System.out.println(baseballTeam.equals(baseballTeam2));	
		System.out.println(baseballTeam.hashCode());
		System.out.println(baseballTeam2.hashCode());
		System.out.println(baseballTeam1.equals(baseballTeam2));	
		System.out.println(baseballTeam1.hashCode());
		System.out.println(baseballTeam2.hashCode());

	}

}
