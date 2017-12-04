package JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcateTest {

	@Test
	void test() {
		MyJUnitClass jUnit = new MyJUnitClass();
		String result = jUnit.concat("hello", "world");
		assertEquals("helloworld",result);
		//fail("Not yet implemented");
	}

}
