package com.sapients.number;

import java.util.Scanner;

public class Number_main {

	public static void main(String[] args) {
		Number number=new Number();
		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int isprime=number.checkPrime(n);
		if(isprime==1)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
		boolean isamstrong=number.checkAmstrong(n);
		if(isamstrong==true)
			System.out.println("Amstrong number");
		else
			System.out.println("Not Amstrong number");
		boolean ispal=number.checkPalindrome(n);
		if(ispal==true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}

}
