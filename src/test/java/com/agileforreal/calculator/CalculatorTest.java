package com.agileforreal.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calculator = new Calculator();
	
	@Test
	void test() {
		assertEquals(18 , calculator.sum(9, 9));
	}

}
