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
<<<<<<< HEAD
<<<<<<< HEAD
		assert(resolveAge(7));
		getRound();

=======
		assert resolveAge(18) : "customer is too young";
		getRound();
		getItDone(-8);
>>>>>>> dev_keith
=======
		assert resolveAge(18) : "customer is too young";
		getRound();
		getItDone(-8);
>>>>>>> dev_kc
	}

	public static boolean resolveAge(int x) {
		boolean isEighteen = false;
				
		if (x >= 18) {
<<<<<<< HEAD
<<<<<<< HEAD
			System.out.println("In you go");
			isEighteen = true;
		} else if (x < 18) {
			System.out.println("Not tonight pal");
=======
			isEighteen = true;
		} else if (x < 18) {
>>>>>>> dev_keith
=======
			isEighteen = true;
		} else if (x < 18) {
>>>>>>> dev_kc
			isEighteen = false;
		}
		return isEighteen;
	}

	public static void getRound() {
		System.out.println("Customer buys round for friends");
	}
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> dev_kc
	
	public static void getItDone(int counter){
		assert counter > 0 : "less than zero";
		for (int i = counter; i < counter; i++ ){
			
		}
	}
<<<<<<< HEAD
>>>>>>> dev_keith
=======
>>>>>>> dev_kc
}
