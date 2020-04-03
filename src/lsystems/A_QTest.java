package lsystems;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A_QTest {

private LRule rule;
	
	@Before
	public void setUp() throws Exception {
		rule = new A_Q();
	}

	@Test
	public void testMatch() {
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void testBody() {
		char[] chars = {'Q'};
		assertEquals(chars, rule.getBody());
	}

}
