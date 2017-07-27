package ocpjp._9a.threads;


public class TestIncrementCounter { 
	
	
	public static void main (String [] args){
		
		CounterThread  ct = new CounterThread();
		Thread  ct1 = new Thread(ct);
		Thread  ct2 = new Thread(ct);

		ct1.start();
		ct2.start();
		
//		int x = 1;
//		System.out.println(x++);
//		System.out.println(x);

	}
}
	
