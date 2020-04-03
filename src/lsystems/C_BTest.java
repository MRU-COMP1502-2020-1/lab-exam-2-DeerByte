package lsystems;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C_BTest {
	private LRule rule;
	
	@Before
	public void setUp() throws Exception {
		rule = new C_B();
	}

	@Test
	public void testMatch() {
		assertEquals('C', rule.getMatch());
	}
	
	@Test
	public void testBody() {
		char[] chars = {'B'};
		assertEquals(chars, rule.getBody());
	}

}
