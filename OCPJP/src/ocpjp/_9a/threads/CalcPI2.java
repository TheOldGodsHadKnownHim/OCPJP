package ocpjp._9a.threads;

//CalcPI2.java
class CalcPI2
{
public static void main (String [] args)
{
   MyThread2 mt = new MyThread2 ();
   mt.start ();
   while (mt.isAlive ())
	   System.out.println("mt is still alive");
     try
     {
         Thread.sleep (10); // Sleep for 10 milliseconds
     }
     catch (InterruptedException e)
     {
     }
	   System.out.println("mt is now dead");
   System.out.printf("pi = " + mt.pi);
}
}
class MyThread2 extends Thread
{
boolean negative = true;
double pi; // Initializes to 0.0, by default
public void run ()
{
   for (int i = 3; i < 100000; i += 2)
   {
        if (negative)
            pi -= (1.0 / i);
        else
            pi += (1.0 / i);
        negative = !negative;
   }
   pi += 1.0;
   pi *= 4.0;
   System.out.println ("Finished calculating PI");
}
}
