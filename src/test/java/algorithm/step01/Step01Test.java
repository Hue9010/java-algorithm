package algorithm.step01;

import static org.junit.Assert.*;

import org.junit.Test;

public class Step01Test {

	@Test
	public void 문제답() {
		String str = "4\n1 3 5 7";
		assertEquals(3, Step01.solution(str));
	}

	@Test
	public void 소수구하는_메소드() {
		assertEquals(1, Step01.findPrimeNumber(2));
		assertEquals(1, Step01.findPrimeNumber(3));
		assertEquals(0, Step01.findPrimeNumber(4));
		assertEquals(1, Step01.findPrimeNumber(5));
	}

}
