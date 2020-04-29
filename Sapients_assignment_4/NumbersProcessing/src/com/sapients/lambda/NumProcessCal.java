package com.sapients.lambda;

import java.util.Scanner;

class NumProcessCal{ 
	public static void main(String[] args) {
	NumProcess add=(int x, int y) -> x + y;
	NumProcess multiply=(int x, int y) -> x * y;
	NumProcess subtract=(int x, int y) -> x - y;
	NumProcess divide=(int x, int y) -> x / y;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter 2 integers");
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	System.out.println("add: "+add.cal(a,b));
	System.out.println("Multiply: "+multiply.cal(a,b));
	System.out.println("subtract: "+subtract.cal(a,b));
	System.out.println("divide: "+divide.cal(a,b));
	add=multiply=subtract=divide=null;
	System.gc();
	}
}
