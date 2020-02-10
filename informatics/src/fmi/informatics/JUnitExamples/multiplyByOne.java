package fmi.informatics.JUnitExamples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class multiplyByOne {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		
		assertEquals(10, test.multiplyByOne(10, 1));
		assertEquals(5, test.multiplyByOne(5, 1));
		assertEquals(8, test.multiplyByOne(8, 1));
	
	}

}
