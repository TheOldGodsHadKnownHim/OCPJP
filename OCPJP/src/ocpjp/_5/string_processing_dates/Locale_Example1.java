/**
 * 
 */
package ocpjp._5.string_processing_dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author keithclarges
 *
 */
public class Locale_Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(2017, 03, 17);
		
		Date d = c.getTime();
		
		Locale italy = new Locale("it","IT");
		Locale portugal = new Locale("pt", "PT");
		Locale brazil = new Locale("pt","BR");
		Locale india = new Locale("hi","IN");
		Locale japan = new Locale("ja", "JP");
		
		DateFormat df_Irl = DateFormat.getInstance();
		System.out.println("Ireland: " + df_Irl.format(d));//Ireland: 17/04/17 22:37
		
		DateFormat df_IrlFull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Ireland Full: " + df_IrlFull.format(d));//Ireland Full: 17 April 2017
		/*
		 * NB - DateFormat objects can only have their locales set at the time of instantiation. You 
		 * cannot change the Locale of an existing instance
		 */
		DateFormat df_Ita = DateFormat.getDateInstance(DateFormat.FULL, italy);
		System.out.println("Italy: " + df_Ita.format(d));//Italy: lunedì 17 aprile 2017
		
		DateFormat df_Por = DateFormat.getDateInstance(DateFormat.FULL, portugal);
		System.out.println("Portugal: " + df_Por.format(d));//Portugal: Segunda-feira, 17 de Abril de 2017
		
		DateFormat df_Bra = DateFormat.getDateInstance(DateFormat.FULL, brazil);
		System.out.println("Brazil: " + df_Bra.format(d));//Portugal: Segunda-feira, 17 de Abril de 2017
		
		DateFormat df_Ind = DateFormat.getDateInstance(DateFormat.FULL, india);
		System.out.println("India: " + df_Ind.format(d));//India: सोमवार, १७ अप्रैल, २०१७
		
		DateFormat df_Jap = DateFormat.getDateInstance(DateFormat.FULL, japan);
		System.out.println("Japan: " + df_Jap.format(d));//Japan: 2017年4月17日

		//Let's display the five countries as they would be written in Ireland
		System.out.println("How Italy is written In Ireland: "  + italy.getDisplayCountry());
		System.out.println("How Portugal is written In Ireland: "  + portugal.getDisplayCountry());
		System.out.println("How Brazil is written In Ireland: "  + brazil.getDisplayCountry());
		System.out.println("How India is written In Ireland: "  + india.getDisplayCountry());
		System.out.println("How Japan is written In Ireland: "  + japan.getDisplayCountry());
		
//		Output
//		How Italy is written In Ireland: Italy
//		How Portugal is written In Ireland: Portugal
//		How Brazil is written In Ireland: Brazil
//		How India is written In Ireland: India
//		How Japan is written In Ireland: Japan
		
		//Now let's display the five countries as they would be written in their own country
		System.out.println("How Italy is written In Italy: "  + italy.getDisplayCountry(italy));
		System.out.println("How Portugal is written In Portugal: "  + portugal.getDisplayCountry(portugal));
		System.out.println("How Brazil is written In Brazil: "  + brazil.getDisplayCountry(brazil));
		System.out.println("How India is written In India: "  + india.getDisplayCountry(india));
		System.out.println("How Japan is written In Japan: "  + japan.getDisplayCountry(japan));
// 		Output
//		How Italy is written In Italy: Italia
//		How Portugal is written In Portugal: Portugal
//		How Brazil is written In Brazil: Brasil
//		How India is written In India: भारत
//		How Japan is written In Japan: 日本
		
		//Now let's display the five countries as they would be written in their own country
		System.out.println("Language spoken in Italy: "  + italy.getDisplayLanguage(italy));
		System.out.println("Language spoken in Portugal: "  + portugal.getDisplayLanguage(portugal));
		System.out.println("Language spoken in Brazil: "  + brazil.getDisplayLanguage(brazil));
		System.out.println("Language spoken in India: "  + india.getDisplayLanguage(india));
		System.out.println("Language spoken in Japan: "  + japan.getDisplayLanguage(japan));
		System.out.println("Indian in Japanese: "  + india.getDisplayLanguage(japan));

//output
//		Language spoken in Italy: italiano
//		Language spoken in Portugal: português
//		Language spoken in Brazil: português
//		Language spoken in India: हिंदी
//		Language spoken in Japan: 日本語
//		Indian in Japanese: ヒンディー語
	}

}
