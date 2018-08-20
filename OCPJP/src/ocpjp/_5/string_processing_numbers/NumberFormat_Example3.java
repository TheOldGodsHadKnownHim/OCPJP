package ocpjp._5.string_processing_numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_Example3 {

	public static void main(String[] args) {

		int attendeesPerYear = 3_200_000;

		int monthlyAttendees = attendeesPerYear / 12;

		NumberFormat numberFormat = NumberFormat.getInstance();
		System.out.println(numberFormat.format(monthlyAttendees));

		NumberFormat numberFormatUs = NumberFormat.getInstance(Locale.US);
		System.out.println(numberFormatUs.format(monthlyAttendees));

		NumberFormat numberFormatGermany = NumberFormat
				.getInstance(Locale.GERMANY);
		System.out.println(numberFormatGermany.format(monthlyAttendees));

		NumberFormat numberFormatFrenchCanada = NumberFormat
				.getInstance(Locale.CANADA_FRENCH);
		System.out.println(numberFormatFrenchCanada.format(monthlyAttendees));

	}

}
