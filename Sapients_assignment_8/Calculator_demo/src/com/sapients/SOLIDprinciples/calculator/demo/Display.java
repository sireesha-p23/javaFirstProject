package com.sapients.SOLIDprinciples.calculator.demo;

public class Display {
	
	//making use of single responsibility principle..... this Class handles only display part

	public void display_method(Calculation cal) {
		System.out.println(cal.num1+cal.operator+cal.num2+"="+cal.result);
	}
}
