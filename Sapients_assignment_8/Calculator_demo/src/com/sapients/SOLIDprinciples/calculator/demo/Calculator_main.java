package com.sapients.SOLIDprinciples.calculator.demo;

import java.util.Scanner;

public class Calculator_main {
	public static void main(String[] args) {
		
		//making use of Liskov principle
		
		Calculation cal=new Calculation();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=scan.nextInt();
		cal.setNum1(num1);
		int num2=scan.nextInt();
		cal.setNum2(num2);
		System.out.println("+ ,- ,* ,/");
		System.out.println("Enter one operator among these");
		String op=scan.next();
		cal.setOperator(op);
		if(op=="+"||op=="-"||op=="*"||op=="/")
		{
		cal.cal_method();
		Display print=new Display();
		print.display_method(cal);
		}
		else {
			System.out.println("Invalid Operator");
		}
	}
	
}
