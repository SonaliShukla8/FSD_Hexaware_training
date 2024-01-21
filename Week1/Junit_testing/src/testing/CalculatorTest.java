package testing;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator cal= new Calculator();
		int actual=cal.add(4,5);
		assertEquals(9, actual);
	}

	@Test
	void testSubtract() {
		Calculator cal= new Calculator();
		int actual=cal.subtract(4,5);
		assertEquals(-1, actual);
	}
	@Test
	void toMultiply() {
		Calculator calculator=new Calculator();
		int actual=calculator.multiply(5,0);
//		assertEquals(6, actual);
		assertNotEquals(6, actual);
	}

}
