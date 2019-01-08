package testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code.Calc;

public class CalcTest {
	@Test
	public void addShouldReturn()
	{
		Calc c = new Calc();
		assertEquals(6, c.add(3, 3));
	}
}
