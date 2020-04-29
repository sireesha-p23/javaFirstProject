package com.sapients;

import java.util.Scanner;

public class IntArrProcessMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		IntArrProcess array;
     
		//asking user regarding the size of array
		
		System.out.println("Do you want specify array size?(Y/N)");
		String choice=scan.next();
		
		//if the user's choice is "y" then invoking the constructor having argument as size
		
		if(choice.equals("Y")||choice.equals("y"))
		{
			System.out.println("Enter the size of array");
			int size=scan.nextInt();
		    array=new IntArrProcess(size);
		    System.out.println("Enter "+size+ " numbers");
			array.read();
			array.display();
			array.sort();
			array.biggest();
			array.smallest();
			array.sum();
			array.secondBiggest();
			IntArrProcess copyarray=new IntArrProcess(array);
			copyarray.display();
			array=copyarray=null;
		}
		
		//if the user's choice is "n" then invoking the default constructor 
		
		else if(choice.equals("N")||choice.equals("n"))
		{
			array=new IntArrProcess();
			System.out.println("Enter 10 numbers");
			array.read();
			array.display();
			array.sort();
			array.biggest();
			array.smallest();
			array.sum();
			array.secondBiggest();
			IntArrProcess copyarray=new IntArrProcess(array);
			copyarray.display();
			array=copyarray=null;
		}
		else
		{
			System.out.println("Choice is invalid");	
		}
		System.gc();
	}
}
