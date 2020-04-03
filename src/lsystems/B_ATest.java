package lsystems;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class B_ATest {

	private LRule rule;
	
	@Before
	public void setUp() throws Exception {
		rule = new B_A();
	}

	@Test
	public void testMatch() {
		assertEquals('B', rule.getMatch());
	}
	
	@Test
	public void testBody() {
		char[] chars = {'A'};
		assertEquals(chars, rule.getBody());
	}

}
