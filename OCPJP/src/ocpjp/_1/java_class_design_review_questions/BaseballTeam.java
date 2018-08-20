package ocpjp._1.java_class_design_review_questions;
//q4
public class BaseballTeam {
	
	private String city, mascot;
	private int numberOfPlayers;
	
	public BaseballTeam (String city, String mascot, int numberOfPlayers){
		this.city = city;
		this.mascot = mascot;
		this.numberOfPlayers = numberOfPlayers;
	}
	
	public boolean equals(Object obj){
		
		if (! (obj instanceof BaseballTeam)){
			return false;
		}
		BaseballTeam other = (BaseballTeam)obj;
		return (city.equals(other.city) && mascot.equals(other.mascot)); 
	}
	
	/*
	 * This hashCode method implementation is incorrect because it violates the rule that 2 objects 
	 * that are equal must return the same hashcode
	 */
//	public int hashCode (){
//		return numberOfPlayers;
//	}
	
	/*
	 * This is a correct implementation of hashCode as 2 equal baseball team will alwayhs have the
	 * same hashCode
	 */
	public int hashCode (){
		return city.length() + mascot.length();
	}

}
