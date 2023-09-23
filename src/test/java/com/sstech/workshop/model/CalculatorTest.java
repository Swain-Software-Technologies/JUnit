/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.workshop.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
	
	
	Calculator calculator;
	
	@BeforeEach
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void testAdd_ForPositiveNumber() {
		int result = calculator.add(10, 23);
		assertEquals(33, result);
	}
	
	@Test
	public void testAdd_ForNegativeNumber() {
		int result = calculator.add(-10, -23);
		assertEquals(-33, result);
	}
	
	@Test
	public void testAdd_ForPositiveNegativeNumber() {
		int result = calculator.add(10, -23);
		assertEquals(-13, result);
	}
	
	
	public void testSub() {
		fail("Not yet implemented");
	}
	
	public void testMul() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testDoDivision() {
		int result = calculator.doDivision(4, 2);
		assertEquals(2, result, "4/2 did not produce 2");
	}
	
	@AfterEach
	public void tierDown() {
		calculator = null;
	}
}
