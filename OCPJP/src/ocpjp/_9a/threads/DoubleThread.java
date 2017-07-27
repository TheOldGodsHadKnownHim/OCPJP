package ocpjp._9a.threads;

public class DoubleThread {
	
	public static void main (String [] args){
		
		Thread thread = new Thread(){
			public void run(){
				System.out.println("does method run without being invoked?");
			}
		};
		

	}

}
