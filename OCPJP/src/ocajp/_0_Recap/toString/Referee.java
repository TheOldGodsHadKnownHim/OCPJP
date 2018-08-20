package ocajp._0_Recap.toString;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author keithclarges
 *
 */
public class Referee {

	private int id;
	private String name;
	private int grade;
	private String startDate;
	private int gamesOfficiated;

	public Referee(int id, String name, int grade, String startDate,
			int gamesOfficiated) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.startDate = startDate;
		this.gamesOfficiated = gamesOfficiated;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
//	@Override
//	public String toString() {
//		return this.name + this.id;
//	}

}
