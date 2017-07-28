/**
 * 
 */
package ocajp._0_Recap.enums;

import java.util.TreeSet;
import java.*;
/**
 * @author keithclarges
 *
 */
public class EnumPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(RefereeGrade.SENIOR_ONE);
		printAllRefGrades();
		determineRefRequired("9");

		Days.MONDAY.printWorkSchedule();
		Days.THURSDAY.printWorkSchedule();
		Days.SATURDAY.printWorkSchedule();
		Days.SUNDAY.printWorkSchedule();
		
		TreeSet<Season> seasons = new TreeSet<>();
		seasons.add(Season.WINTER);
		seasons.add(Season.AUTUMN);
		seasons.add(Season.SUMMER);
		seasons.add(Season.SPRING);
		
		for (Season str : seasons){
			System.out.println(str);
		}
	}

	private static void printAllRefGrades() {
		for (RefereeGrade grade : RefereeGrade.values()) {
			System.out.println(grade.name());
		}
	}

	private static void determineRefRequired(String s) {

		switch (s) {
		case "S1":
			System.out.println(RefereeGrade.SENIOR_ONE.name()
					+ " referee required");
			break;
		case "1":
			System.out.println(RefereeGrade.ONE.name() + " referee required");
			break;
		case "2":
			System.out.println(RefereeGrade.TWO.name() + " referee required");
			break;
		case "3":
			System.out.println(RefereeGrade.THREE.name() + " referee required");
			break;
		case "4":
			System.out.println(RefereeGrade.FOUR.name() + " referee required");
			break;
		case "5":
			System.out.println(RefereeGrade.FIVE.name() + " referee required");
			break;
		default:
			System.out.println("Appointment of official TBC");

		}

	}
}
