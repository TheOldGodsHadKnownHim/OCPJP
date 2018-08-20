package ocpjp._5.string_processing_resource_bundles;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class Zoo_Example {

	public static void main(String[] args) {

		Locale br_Canada = new Locale("en", "US");
		Locale fr_Canada = new Locale("fr", "FR");

		printProperties(br_Canada);
		System.out.println();
		printProperties(fr_Canada);
		System.out.println();
		printPairs(br_Canada);
		System.out.println();
		printPairs(fr_Canada);

		showHowPropertyDefaultWorks(br_Canada);

	}

	public static void printProperties(Locale locale) {

		ResourceBundle resourceBundle = ResourceBundle.getBundle("Zoo", locale);
		System.out.println(resourceBundle.getString("hello"));
		System.out.println(resourceBundle.getString("greeting"));
		System.out.println(resourceBundle.getString("open"));

		if (locale.getCountry().equals("US")) {
			// a variable in an rb string
			String format = resourceBundle.getString("helloByName");
			String formatted = MessageFormat.format(format, "Keith");
			System.out.println(formatted);
		}

		if (locale.getCountry().equals("FR")) {

			String formatFr = resourceBundle.getString("helloByName");
			String formattedFr = MessageFormat.format(formatFr, "Keith","Dave");
			System.out.println(formattedFr);
		}

	}

	public static void printPairs(Locale locale) {

		ResourceBundle resourceBundle = ResourceBundle.getBundle("Zoo", locale);

		Set<String> keys = resourceBundle.keySet();

		System.out
				.println("Using functional programming to iterate over the key value set in the "
						+ "properties file");

		keys.stream().map(k -> k + " : " + resourceBundle.getString(k))
				.forEach(System.out::println);

		System.out.println("Traditional for each loop to do the same job");

		for (String key : keys) {
			System.out.println(key + " : " + resourceBundle.getString(key));
		}
	}

	public static void showHowPropertyDefaultWorks(Locale locale) {

		/**
		 * Working with Properties
		 */
		Properties properties = new Properties();

		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);

		rb.keySet().stream().forEach(k -> properties.put(k, rb.getString(k)));

		System.out.println(properties);
		System.out.println(properties.getProperty("fake"));// prints null - prop
															// doesn't exist
		System.out.println(properties.getProperty("fake", "default"));// prints
																		// "default"
		System.out.println(properties.getProperty("open"));// prints
															// "the zoo is open"
		System.out.println(properties.getProperty("open", "default"));// prints
																		// "the zoo is open"
	}

}
