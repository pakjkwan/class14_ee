package util;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilJdbcTest {

	@Test
	public void testTest() {
		JdbcTest test=new JdbcTest();
		assertTrue(test.getName().equals("홍길동"));
	}

}
