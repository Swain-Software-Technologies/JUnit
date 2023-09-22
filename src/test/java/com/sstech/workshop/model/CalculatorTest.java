/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.workshop.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author STRINATH Sep 22, 2023
 * 
 * @Description : 
 */
public class CalculatorTest {

	@Test
	void testCalculator() {
		System.out.println("Calculator tested Successfull");
	}
	
	@Test
	public void testDoDivision() {
		Calculator calculator = new Calculator();
		int result = calculator.doDivision(4, 2);
		assertEquals(2, result, "4/2 did not produce 2");
	}
}
