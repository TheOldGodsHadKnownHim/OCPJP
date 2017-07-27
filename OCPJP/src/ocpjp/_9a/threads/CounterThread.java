/**
 * 
 */
package ocpjp._9a.threads;

/**
 * @author keithclarges
 *
 */
public class CounterThread implements Runnable {
	
	Counter counter = new Counter();
	@Override
	public void run() {
		counter.increment();
	}

}
