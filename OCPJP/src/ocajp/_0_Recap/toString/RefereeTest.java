package ocajp._0_Recap.toString;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RefereeTest {

	@Test
	public void test() {

		Referee referee = new Referee(1, "Keith Clarges", 1, "2008", 657);
		
		assertEquals(
				"Referee[id=1,name=Keith Clarges,grade=1,startDate=2008,gamesOfficiated=657]",
				referee.toString());
		
		assertEquals(
				"Referee[id=1,name=Keith Clarges,grade=1,startDate=2008,gamesOfficiated=657]",
				referee.toString());
	}
}
