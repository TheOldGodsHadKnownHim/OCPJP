package ocpjp._3.object_oriented_design_principles_example4_singleton_pattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class LlamaTrainerTest {

	@Test
	public void testFeedLlamas() {
		
		LlamaTrainer llamaTrainer = new LlamaTrainer();
		
		assertTrue(llamaTrainer.feedLlamas(10));
	}

}
