package chp1_review_q3;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Canada";
		String s2 = new String(s1);
				
		/*
		 * == checks for reference equality
		 * 
		 * Therefore, in order for the first if statement to be true you would have had to initialise
		 * s2 like so:  String s2 = s1; 
		 * 
		 * In this scenario both if statements would be true as they would share the same reference
		 * and they would also hold the same value
		 */
		if (s1 == s2){
			System.out.println("s1 == s2");
		}
		if (s1.equals(s2)){
			System.out.println("s1.equals(s2)");
		}

	}

}
