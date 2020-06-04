package com.sapients.SOLIDprinciples.calculator.demo;

public class Calculation extends Calculator{
	
	//making use of single responsibility principle..... this Class handles only calculation part

	public void cal_method( ){
	try {
	switch(operator) {
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
