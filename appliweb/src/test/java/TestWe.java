import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.commons.MyStringUtils;
import org.junit.Test;

public class TestWe {

	
	@Test
	public void test() {
		assertTrue(MyStringUtils.isNullOrEmpty(""));
		assertFalse(MyStringUtils.isNullOrEmpty("null"));
	}

	@Test
	public void test2() {
		assertTrue(MyStringUtils.isNullOrEmpty(""));
		assertFalse(MyStringUtils.isNullOrEmpty("null"));
	}
}
