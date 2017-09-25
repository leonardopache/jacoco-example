package com.pache.test.jacocoexample;

import org.junit.Assert;
import org.junit.Test;

import com.pache.jacocoexample.DivisionBySubtraction;

public class DivisionBySubtractionTest {
	@Test
	public void divisionRecursivelyTest() {
		int quotient = DivisionBySubtraction.subtractionRecursively(25, 3);
		Assert.assertEquals(8, quotient);
	}

	@Test
	public void divisionInteractivelyTest() {
		int quotient = DivisionBySubtraction.subtractionInteractively(25, 3);
		Assert.assertEquals(8, quotient);
	}

	@Test
	public void divisionByZero() {
		Assert.assertEquals(0, DivisionBySubtraction.subtractionInteractively(10, 0));

		Assert.assertEquals(0, DivisionBySubtraction.subtractionRecursively(10, 0));
	}

	@Test
	public void dividendLowerThenDivisor() {
		Assert.assertEquals(0, DivisionBySubtraction.subtractionInteractively(3, 4));

		Assert.assertEquals(0, DivisionBySubtraction.subtractionRecursively(3, 4));
	}
	
	@Test
	public void dividendZero() {
		Assert.assertEquals(0, DivisionBySubtraction.subtractionInteractively(0, 0));

		Assert.assertEquals(0, DivisionBySubtraction.subtractionRecursively(0, 0));
	}
}
