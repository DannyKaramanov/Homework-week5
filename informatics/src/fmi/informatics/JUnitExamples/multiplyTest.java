package fmi.informatics.JUnitExamples;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTest {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.multiply(5);
		assertEquals(25, output);
	}

}
