package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Calc;

public class CalcsubTest {

	@Test
	public void test() {
		Calc c = new Calc();
		assertEquals(2, c.sub(2, 1));
	}

}
