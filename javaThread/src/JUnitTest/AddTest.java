package JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void Addtest() {
		MyJUnitClass jUnit = new MyJUnitClass();
		int result = jUnit.add(100, 100);
		assertEquals(200,result);
		//fail("Not yet implemented");
	}

}
