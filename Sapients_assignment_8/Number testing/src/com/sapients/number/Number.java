package com.sapients.number;
public class Number {
	int checkPrime(int num)
	{
		 boolean flag = false;
	        for(int i = 2; i <= num/2; ++i)
	        {
	            // condition for nonprime number
	            if(num % i == 0)
	            {
	                flag = true;
	                break;
	            }
	        }

	        if (!flag)
	        	return 1;
	        else
	        	return 0;
	    }
	boolean checkAmstrong(int n) {
		 int c=0,a,temp;  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    	return true;
		    else 
		    	return false;
		   } 
	boolean checkPalindrome(int num)
	{
		 int  reversedInteger = 0, remainder, originalInteger;

	        originalInteger = num;

	        // reversed integer is stored in variable 
	        while( num != 0 )
	        {
	            remainder = num % 10;
	            reversedInteger = reversedInteger * 10 + remainder;
	            num  /= 10;
	        }

	        // palindrome if orignalInteger and reversedInteger are equal
	        if (originalInteger == reversedInteger)
	        	return true;
	        else
	        	return false;
	    }
	
	
}


