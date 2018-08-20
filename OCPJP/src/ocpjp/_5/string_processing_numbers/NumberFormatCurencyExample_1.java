package ocpjp._5.string_processing_numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatCurencyExample_1 {

	public static void main(String[] args) {

		int attendeesPerYear = 3_200_000;

		int monthlyAttendees = attendeesPerYear / 12;

		NumberFormat irishCurrency = NumberFormat.getCurrencyInstance();
		System.out.println(irishCurrency.format(monthlyAttendees));

		NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(usCurrency.format(monthlyAttendees));

		NumberFormat japCurrency = NumberFormat
				.getCurrencyInstance(Locale.JAPAN);
		System.out.println(japCurrency.format(monthlyAttendees));

		NumberFormat canadianCurrency = NumberFormat
				.getCurrencyInstance(Locale.CANADA_FRENCH);
		System.out.println(canadianCurrency.format(monthlyAttendees));

	}

}
