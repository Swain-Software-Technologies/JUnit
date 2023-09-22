/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.workshop.model;

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
public class JunitDemoTest {

	@BeforeAll
	public static void testOnlyBeforeAllTestCases() {
		System.out.println("BOAT");
	}
	
	@BeforeEach
	public void setup() {
		System.out.println("Setup");
	}
	
	@Test
	public void m1() {
		System.out.println("Tested m1 functionality");
	}
	
	@Test
	public void m2() {
		System.out.println("Tested m2 functionality");
	}
	
	@AfterEach
	public void tierDown() {
		System.out.println("Tested tierDown functionality");
	}
	
	@AfterAll
	public static void testOnlyAfterAllTestCases() {
		System.out.println("AOAT");
	}
}
