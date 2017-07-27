package ocpjp._9a.threads;

class MyRunnable implements Runnable {
	public void run(){
		for (int i =1; i <=3;i++){
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}

public class ManyThreads {
	public static void main (String [] args){
		MyRunnable r = new MyRunnable();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		Thread three = new Thread(r);
		one.setName("ThreadOneExecuting_");
		two.setName("ThreadTwoExecuting_");
		three.setName("ThreadThreeExecuting_");
		one.start();
		two.start();
		three.start();
	}
}
