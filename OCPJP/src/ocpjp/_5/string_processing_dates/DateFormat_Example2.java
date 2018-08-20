package ocpjp._5.string_processing_dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.UnsupportedTemporalTypeException;

public class DateFormat_Example2 {

	public static void main(String[] args) {

		LocalDate dateMaisieBorn = LocalDate.of(2016, Month.APRIL, 17);
		LocalTime timeMaisieBorn = LocalTime.of(06, 30, 12);
		LocalDateTime dateTimeMaisieBorn = LocalDateTime.of(dateMaisieBorn,
				timeMaisieBorn);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter
				.ofLocalizedDate(FormatStyle.SHORT);

		// format method on the formatter
		System.out.println(dateTimeFormatter.format(dateMaisieBorn));
		try {
			System.out.println(dateTimeFormatter.format(timeMaisieBorn));
		} catch (UnsupportedTemporalTypeException utte) {
			System.out.println("UnsupportedTemporalTypeException caught");
		}
		System.out.println(dateTimeFormatter.format(dateTimeMaisieBorn));

		// format methods on the date objects
		System.out.println(dateMaisieBorn.format(dateTimeFormatter));
		try {
			System.out.println(timeMaisieBorn.format(dateTimeFormatter));
		} catch (UnsupportedTemporalTypeException utte) {
			System.out.println("UnsupportedTemporalTypeException caught");
		}
		System.out.println(dateTimeMaisieBorn.format(dateTimeFormatter));

	}

}
