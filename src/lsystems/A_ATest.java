package lsystems;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A_ATest {
	private LRule rule;
	
	@Before
	public void setUp() throws Exception {
		rule = new A_A();
	}

	@Test
	public void testMatch() {
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void testBody() {
		char[] chars = {'A'};
		assertEquals(chars, rule.getBody());
	}

}
