/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.workshop.model;

/**
 * @author STRINATH Sep 22, 2023
 * 
 * @Description :
 */
public class Calculator {

	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	public int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	public int doDivision(int dividend, int divisor) {
		return dividend / divisor;
	}
}
