/**
 * 
 */
package ocpjp._9a.threads;

/**
 * @author keithclarges
 *
 */
//ThreadDemo.java
class ThreadDemo
{
public static void main (String [] args){
	
	/*
	 * This is the main thread. It kicks off the MyThred object but also has its own for loop that it
	 * executes seperately
	 */
   MyThread mt = new MyThread ();
   mt.start ();
   for (int mt2 = 0; mt2 < 50; mt2++)
        System.out.println ("mt2 = " + mt2 + ", mt2*mt2 = " + mt2 * mt2);
}
}
class MyThread extends Thread
{
	
	/*
	 *THis method is activated by mt.start() in main
	 */
public void run ()
{
   for (int count = 1, row = 1; row < 20; row++, count++)
   {
        for (int i = 0; i < count; i++)
             System.out.print ('*');
        System.out.print ('\n');
   }
}
}
