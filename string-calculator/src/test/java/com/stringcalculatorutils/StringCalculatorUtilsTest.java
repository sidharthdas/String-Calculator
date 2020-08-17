package com.stringcalculatorutils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.stringcalculator.exception.InvalidInputException;
import com.stringcalculator.exception.NegativeNumberException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StringCalculatorUtilsTest {
	
	StringCalculatorUtils stringCalculatorUtils;
	int count = 0;
	
	@BeforeEach
	void init() {
		stringCalculatorUtils = new StringCalculatorUtils();
	}

	@Test
	void addTest() throws InvalidInputException, NegativeNumberException {
		//System.out.println(stringCalculatorUtils.add("1\n2,3"));
		count++;
		assertEquals(6, stringCalculatorUtils.add("1\n2,3"));
	}
	
	@Test
	void exceptionAddTest() throws InvalidInputException, NegativeNumberException {
		//System.out.println(stringCalculatorUtils.add("1\n2,3"));
		count++;
		assertThrows(NegativeNumberException.class, () ->stringCalculatorUtils.add("1,-2,-3"));
	}
	
	@AfterAll
	void countAddMethod() {
		System.out.println(count);
	}

}
