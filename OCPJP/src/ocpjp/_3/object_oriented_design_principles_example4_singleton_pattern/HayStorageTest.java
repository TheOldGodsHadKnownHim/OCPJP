/**
 * 
 */
package ocpjp._3.object_oriented_design_principles_example4_singleton_pattern;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author keithclarges
 *
 */
public class HayStorageTest {
	
	private HayStorage hayStorage;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		hayStorage = HayStorage.getInstance();
	}
	
	@Before
	public void tearDown() throws Exception {

		hayStorage.quantity = 0;
	}

	/**
	 * Test method for
	 * {@link ocpjp._3.object_oriented_design_principles_example4_singleton_pattern.HayStorage#getInstance()}
	 * .
	 */
	@Test
	public void testGetInstance() {
		Assert.assertTrue(hayStorage != null);
}

	/**
	 * Test method for
	 * {@link ocpjp._3.object_oriented_design_principles_example4_singleton_pattern.HayStorage#addhay(int)}
	 * .
	 */
	@Test
	public void testAddhay() {
		
		Assert.assertTrue(hayStorage.addHay(34));
	}

	/**
	 * Test method for
	 * {@link ocpjp._3.object_oriented_design_principles_example4_singleton_pattern.HayStorage#removeHay(int)}
	 * .
	 */
	@Test
	public void testRemoveHay_enoughHayToEnableRemoval() {
		Assert.assertTrue(hayStorage.addHay(34));
		Assert.assertTrue(hayStorage.removeHay(14));
	}
	
	/**
	 * Test method for
	 * {@link ocpjp._3.object_oriented_design_principles_example4_singleton_pattern.HayStorage#removeHay(int)}
	 * .
	 */
	@Test
	public void testRemoveHay_notEnoughHayToEnableRemoval() {
		Assert.assertTrue(hayStorage.addHay(13));
		Assert.assertFalse(hayStorage.removeHay(14));
	}

	/**
	 * Test method for
	 * {@link ocpjp._3.object_oriented_design_principles_example4_singleton_pattern.HayStorage#getHayQuantity()}
	 * .
	 */
	@Test
	public void testGetHayQuantity() {
		hayStorage.addHay(34);
		hayStorage.removeHay(14);
		Assert.assertEquals(hayStorage.getHayQuantity(),20);
	}

}
