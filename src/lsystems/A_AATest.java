package lsystems;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A_AATest {
	private LRule rule;
	
	@Before
	public void setUp() throws Exception {
		rule = new A_AA();
	}

	@Test
	public void testMatch() {
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void testBody() {
		char[] chars = {'A', 'A'};
		assertEquals(chars, rule.getBody());
	}


}
