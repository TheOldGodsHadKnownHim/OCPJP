package ocpjp._6.exceptions_and_assertions;

public class _1_assertions {

	public static void main(String[] args) {
		
		//Normal way to deal with assumptions
//		if (resolveAge(19)) {
//			getRound();
//		} else {
//			System.out.println("Didn't get in. No beers tonight");
//		}
		
		//assertions remove a lot of code from the equation
		assert(resolveAge(7));
		getRound();

	}

	public static boolean resolveAge(int x) {
		boolean isEighteen = false;
				
		if (x >= 18) {
			System.out.println("In you go");
			isEighteen = true;
		} else if (x < 18) {
			System.out.println("Not tonight pal");
			isEighteen = false;
		}
		return isEighteen;
	}

	public static void getRound() {
		System.out.println("Customer buys round for friends");
	}
}
