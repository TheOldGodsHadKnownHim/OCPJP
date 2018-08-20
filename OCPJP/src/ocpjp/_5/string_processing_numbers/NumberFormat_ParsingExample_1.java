package ocpjp._5.string_processing_numbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat_ParsingExample_1 {

	public static void main(String[] args) {

		String ticketPrice = "40,45";
		//String ticketPrice = "40.45";
		String ticketPrice1 = "$40,45";



		NumberFormat nf = NumberFormat.getInstance(Locale.US);
		NumberFormat nf1 = NumberFormat.getInstance(Locale.FRANCE);
		NumberFormat nf2 = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		NumberFormat nf3 = NumberFormat.getInstance(Locale.JAPAN);
		
		NumberFormat nfc= NumberFormat.getCurrencyInstance(Locale.US);
//		NumberFormat nfc1 = NumberFormat.getInstance(Locale.FRANCE);
//		NumberFormat nfc2 = NumberFormat.getInstance(Locale.CANADA_FRENCH);
//		NumberFormat nfc3 = NumberFormat.getInstance(Locale.JAPAN);


		try {
			System.out.println(nf.parse(ticketPrice));
			System.out.println(nf1.parse(ticketPrice));
			System.out.println(nf2.parse(ticketPrice));
			System.out.println(nf3.parse(ticketPrice));
			System.out.println(nfc.parse(ticketPrice1));
//			System.out.println(nfc1.parse(ticketPrice1));
//			System.out.println(nfc2.parse(ticketPrice1));
//			System.out.println(nfc3.parse(ticketPrice1));
		} catch (ParseException e) {
			System.out.println("Parse Exception caught" + e);
		}

	}

}
