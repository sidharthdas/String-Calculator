package com.stringcalculatorutils;

import java.util.Objects;

import com.stringcalculator.exception.InvalidInputException;
import com.stringcalculator.exception.NegativeNumberException;

public class StringCalculatorUtils {
	
	public int add(String s) throws InvalidInputException, NegativeNumberException {
		if(s.isBlank()) {
			return 0;
		}
		
		if(s.contains("\n,")) {
			throw new InvalidInputException("INVALID input");
		}
		
		int sum = 0;
		
		String s1 = s.replaceAll(System.getProperty("line.separator"), ",");
		String[] stringArr = s1.split(",");
		
		String negativeNumber = null;
		for(String str :stringArr) {
			if(Integer.parseInt(str)< 0) {
				if(negativeNumber == null) {
					negativeNumber = str;
				}
				negativeNumber = negativeNumber +", "+ str;
			}
		}
		if(Objects.nonNull(negativeNumber)) {
			throw new NegativeNumberException("negatives not allowed. Negative number entered: "+negativeNumber);
		}
		
		
		for(String str : stringArr) {
			
			sum = sum + Integer.parseInt(str);
			
		}
		return sum;
	}

}
