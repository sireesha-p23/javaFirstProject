package com.sapients.SOLIDprinciples.calculator.demo;

public class Calculator {
	
	//making use of single responsibility principle
	
	int num1;
	 int num2;
	 float result;
	String operator;
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
