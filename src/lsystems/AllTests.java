package lsystems;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ A_AATest.class, A_ATest.class, A_BCTest.class, A_QTest.class, A_XTest.class, B_ATest.class,
		C_BTest.class, LLineTest.class })
public class AllTests {

}
