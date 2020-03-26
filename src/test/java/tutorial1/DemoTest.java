package tutorial1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DemoTest {
	@Test
	public void shouldReturnTrue() {
		Demo demo = new Demo();
		
		assertTrue(demo.getBool());
	}
}
