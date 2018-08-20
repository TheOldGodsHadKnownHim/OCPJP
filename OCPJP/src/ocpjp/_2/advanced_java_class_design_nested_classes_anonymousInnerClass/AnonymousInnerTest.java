/**
 * 
 */
package ocpjp._2.advanced_java_class_design_nested_classes_anonymousInnerClass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author keithclarges
 *
 */
public class AnonymousInnerTest {

	@Test
	public void testDetermineAdmissionPrice() {

		AnonymousInner anonymousInner = new AnonymousInner();

		int basePrice = 10;
		int expectedValue = 7;
		int actualValue = anonymousInner.determineAdmissionPrice(basePrice);
		
		System.out.println(actualValue);

		assertTrue(
				"Test has failed because the actual value returned is not equal to 7. ",
				expectedValue == actualValue);
	}

}
