/**
 * 
 */
package ocpjp._5.string_processing_dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * @author keithclarges
 *
 */
public class DateFormat_Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	Date date = new Date(1_000_000_000_000L);//1 trillion milliseconds
	
	DateFormat [] dateFormatArray = new DateFormat[6];
	/*
	 * DateFormat is an abstract class so we have to use instance factory methods in order to get
	 * instances of this class. 
	 */
	dateFormatArray[0] = DateFormat.getInstance();
	//Examples below of overloaded getDateInstance() methods
	dateFormatArray[1] = DateFormat.getDateInstance(0, Locale.JAPAN);
	dateFormatArray[2] = DateFormat.getDateInstance(DateFormat.SHORT);
	dateFormatArray[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
	dateFormatArray[4] = DateFormat.getDateInstance(DateFormat.LONG);
	dateFormatArray[5] = DateFormat.getDateInstance(DateFormat.FULL);
	
	for (DateFormat df : dateFormatArray){
		//Using the format method to format out Date object into the various Date Format
		System.out.println(df.format(date));
	}
// what gets printed
//	09/09/01 02:46
//	09-Sep-2001
//	09/09/01
//	09-Sep-2001
//	09 September 2001
//	09 September 2001
	
	
	/*
	 * USING THE PARSE() METHOD
	 */
	DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
	String s = df.format(date);
	System.out.println(s);//prints 09/09/01
	
	//now parse the String back into a Date object
	try {
		Date date2 = df.parse(s);
		Date date3 = df.parse("ghghs");
		System.out.println(date2.toString());//Sun Sep 09 00:00:00 IST 2001
	} catch(ParseException pe){
		System.out.println(pe.getMessage());

	}

}}
