/**
 * 
 */
package ocpjp._5.string_processing_dates;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author keithclarges
 *
 */
public class Calendar_example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Date date = new Date(1_000_000_000_000L);//1 trillion milliseconds

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		//print out the date
		System.out.println(calendar.getTime());
		
		//lets find out what day of the week this date fell on
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		//now let's add a month to the date
		calendar.add(Calendar.MONTH, 1);
		System.out.println(calendar.getTime());

		//now convert it back to a java.util.Date object
		Date date2 = calendar.getTime();
		System.out.println(date2.toString());
		
		/*
		 * Using the roll() method. I'm not sure of the value of it but I need to know it for the exam
		 * 
		 * For my example I'm going to roll 4 months on to my calendar instance, which is currently
		 * in October. So, you might think that adding 4 months would automatically increment the
		 * year,  but it actually doesn't. Interesting the what is printed is GMT rather than IST, which
		 * was printed for all the other examples. 
		 */
		calendar.roll(Calendar.MONTH, 4);
		System.out.println(calendar.getTime());
		
		Calendar c1 = Calendar.getInstance(Locale.JAPAN);
		System.out.println(c1.getTime());

		
		
		
		
	}

}
