package ocpjp._6.exceptions_and_assertions;

public class _2_multi_catch {
	
	public static void main(String[] args) {
		
		//take 2 values from the array and add them
		int [] kidsAges = {2,4,6,8};
		
		//change x value to a non index to cause ArrayIndexOutOfBoundsException
		// change y value to 0 to cause ArithmeticException
		try {
			int z = divideTwoOfTheKidsAges(kidsAges[5], 0);
			System.out.println("Result is: " + z);
		}catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
			System.out.println("Method 1 Exception caught");
			e.printStackTrace();	
		}
		//Compiler will know the 2 candidate exceptions
		try {
			int z = divideTwoOfTheKidsAges2(kidsAges[3], 0);
			System.out.println("Result is: " + z);
		}catch (Exception e){
			System.out.println("Method 2 Exception caught");
			e.printStackTrace();	
		}
	}
	
	public static int divideTwoOfTheKidsAges(int x, int y){
		return x/y;
	}
	
	//Declaring what gets thrown in the signature
	public static int divideTwoOfTheKidsAges2(int x, int y) throws ArrayIndexOutOfBoundsException, ArithmeticException{
		return x/y;
	}
}
