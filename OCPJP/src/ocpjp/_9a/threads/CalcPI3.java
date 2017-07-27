package ocpjp._9a.threads;

//CalcPI3.java
class CalcPI3
{
public static void main (String [] args)
{
   MyThread3 mt = new MyThread3 ();
   mt.start ();
   try
   {
       mt.join ();//main thread will not execute until mt is dead
       System.out.println("mt run method completed");
   }
   catch (InterruptedException e)
   {
   }
   System.out.println ("pi = " + mt.pi);
}
}
class MyThread3 extends Thread
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
