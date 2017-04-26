/**
 * 
 */
package ocajp._0_Recap.enums;

/**
 * @author keithclarges
 *
 */
public enum Season {

	WINTER {
		public void printHours() {
			System.out.println("9am-3pm");
		}
	},
	SPRING {
		public void printHours() {
			System.out.println("9am-5pm");
		}
	},
	SUMMER {
		public void printHours() {
			System.out.println("9am-9pm");
		}
	},
	AUTUMN {
		public void printHours() {
			System.out.println("9am-7pm");
		}
	};

	public abstract void printHours();

	public static void main(String[] args) {
		Season.SUMMER.printHours();
	}
}
