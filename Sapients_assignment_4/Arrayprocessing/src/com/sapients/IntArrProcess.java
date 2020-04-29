package com.sapients;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class IntArrProcess{
	int[] arr;
	int size;
	public IntArrProcess()
	{
		arr=new int[10];
		this.size=10;
	}
	public IntArrProcess(int size) {
		arr=new int[size];
		this.size=size;
	}
	public IntArrProcess(IntArrProcess array)
	{
		System.out.println("Invoked the copy constructor");
		this.size=array.size;
		this.arr=array.arr;
	}
	void read() {
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
	}
	void display()
	{
		System.out.println("Printing horizontally");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
		System.out.println("Printing vertically");
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
	void sort()
	{
		ArrayList<Integer> arraylist=new ArrayList<>();
		for(int i:arr)
		{
			arraylist.add(Integer.valueOf(i));
		}
		Collections.sort(arraylist);
		System.out.println("Sorted elements:"+arraylist);
	}
	void biggest()
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<size;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("The biggest value is:"+max);
	}
	void smallest() {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<size;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("The smallest value is:"+min);
	}
	void sum()
	{
		int sum=0;
		for (int i = 0; i < size; i++) 
            sum+=  arr[i];
		System.out.println("sum:"+sum);
	}
	void secondBiggest()
	{
		 int first = Integer.MIN_VALUE; 
		 int second = Integer.MIN_VALUE; 
	        for (int i = 0; i < size ; i++) 
	        { 
	            /* If current element is smaller than  
	            first then update both first and second */
	            if (arr[i] > first) 
	            { 
	                second = first; 
	                first = arr[i]; 
	            } 
	       
	            /* If arr[i] is in between first and  
	               second then update second  */
	            else if (arr[i] > second && arr[i] != first) 
	                second = arr[i]; 
	        } 
	          
	        if (second == Integer.MIN_VALUE) 
	             System.out.print("There is no second largest"+ 
	                                 " element\n"); 
	        else
	             System.out.println("The second largest element"+ 
	                                      " is "+ second); 
	}
	public void finalize()
	{
		size=0;
		arr=null;
	}
}

