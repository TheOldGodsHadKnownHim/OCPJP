/**
 * 
 */
package ocpjp._5.string_processing;

/**
 * @author keithclarges
 *
 */
public class String_example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		//Create a new String object with reference variable x and value "Java"
		String x = "Java";
		/*
		 * As a result of using the concat method the JVM will create a second String object with the 
		 * value "Java Rules!". However, there is no reference to it, so it is instantly lost. It cannot be 
		 * accessed
		 */
		x.concat(" Rules!");
		//Because of what is explained above, what will be printed is x = "Java"
		System.out.println("x = " + x);
		
		//Object created and lives on the heap - referenced by s
		String s = "abc";
		//Another reference to the same object on the heap
		String s2 = s;
		
		System.out.println("s = " + s);//prints abc
		System.out.println("s2 = " + s2);//prints abc
		
		//a new object is create on the heap because the String that s references is immutable and 
		//cannot be changed. However, the value the referenc points to can be changed and this is
		//what has happened here
		s = s.concat("def");
		
		System.out.println("s = " + s);//prints abcdef
		System.out.println("s2 = " + s2);//prints abc
		
		
		 String in = "1 a2 b 3 c4d 5e";
         String[] chunks = in.split(args[0]);
         System.out.println("count " + chunks.length);
         for(String s3 : chunks){
           System.out.print("<" + s3 + ">  ");
       }
		
	}

}
