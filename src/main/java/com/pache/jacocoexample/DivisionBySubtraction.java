package com.pache.jacocoexample;

/**
 * Divide a dividend by divisor with repeatedly subtracting until the result
 * become less than divisor. The quotient is obtained by counting the number of
 * subtractions. Implemented Recursively and Interactively
 * 
 * @author lpache
 */
public final class DivisionBySubtraction {

	private DivisionBySubtraction() {
		throw new AssertionError("Utility Class, Do not instantiate !!");
	}

	public static int subtractionInteractively(int dividend, final int divisor) {
		if (isDivisionResultZero(dividend, divisor))
			return 0;
		else {
			return executeDivision(dividend, divisor);
		}
	}

	private static int executeDivision(int dividend, final int divisor) {
		int interaction = 0;
		int remainder = dividend;
		while (remainder >= divisor) {
			remainder = remainder - divisor;
			interaction++;
		}
		return interaction;
	}

	public static int subtractionRecursively(final int dividend, final int divisor) {
		if (isDivisionResultZero(dividend, divisor))
			return 0;
		else
			return (1 + subtractionRecursively(dividend - divisor, divisor));
	}

	private static boolean isDivisionResultZero(final int dividend, final int divisor) {
		return dividend == 0 || divisor == 0 || dividend <= divisor;
	}
}