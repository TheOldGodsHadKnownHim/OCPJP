package ocpjp._9a.threads;

//CalcPI1.java
class CalcPI1
{
public static void main (String [] args)
{
   MyThread1 mt = new MyThread1 ();
   mt.start ();
   try
   {
       Thread.sleep (10); // Sleep for 10 milliseconds
   }
   catch (InterruptedException e)
   {
   }
   System.out.println ("pi = " + mt.pi);
}
}
class MyThread1 extends Thread
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
