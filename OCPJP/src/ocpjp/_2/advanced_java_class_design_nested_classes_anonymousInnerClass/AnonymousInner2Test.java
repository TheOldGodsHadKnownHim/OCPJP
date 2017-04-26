package ocpjp._2.advanced_java_class_design_nested_classes_anonymousInnerClass;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnonymousInner2Test {

	@Test
	public void testPay() {
		
		int expected = 25;
		
		AnonymousInner2 anonymousInner2 = new AnonymousInner2();
		
		int actual = anonymousInner2.pay();
			
		assertTrue(
				"Test has failed because the actual value returned is not equal to 25. ",
				expected == actual);
		}

}
