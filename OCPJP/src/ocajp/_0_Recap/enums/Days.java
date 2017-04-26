/**
 * 
 */
package ocajp._0_Recap.enums;

/**
 * @author keithclarges
 *
 */
public enum Days {

	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY {
		@Override
		public void printWorkSchedule() {
			System.out.println("Brlliant - No work today");
		}
	},
	SUNDAY {
		@Override
		public void printWorkSchedule() {
			System.out.println("Another lie in - get the fry on");
		}
	};

	public void printWorkSchedule() {
		System.out.println("9-6");
	}

	public static void main(String[] args) {
		Days.MONDAY.printWorkSchedule();
		Days.THURSDAY.printWorkSchedule();
		Days.SATURDAY.printWorkSchedule();
		Days.SUNDAY.printWorkSchedule();
	}

}
