package com.sapients.matrix;

import java.util.Scanner;

public class Matrix {
	int[][] matrix;
	int size;
	Matrix()
	{
		size=3;
		matrix=new int[3][3];
	}
	Matrix(int size)
	{
		this.size=size;
		matrix=new int[size][size];
	}
	Matrix(Matrix matrix)
	{
		System.out.println("Invoked the copy constructor");
		this.size=matrix.size;
		this.matrix=matrix.matrix;
	}
	void read() {
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				matrix[i][j]=scanner.nextInt();
			}
		}	
	}
	void display()
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(this.matrix[i][j]+" ");
			}
			System.out.print("\n");
		}	
	}
	Matrix add(Matrix secondmatrix)
	{
		Matrix res=new Matrix(size);
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				res.matrix[i][j]=matrix[i][j]+secondmatrix.matrix[i][j];
			}
		}	
		return res;
	}
	Matrix multiply(Matrix secondmatrix)
	{
		Matrix res=new Matrix(size);
		int i, j, k; 
	    for (i = 0; i < size; i++) 
	    { 
	        for (j = 0; j < size; j++) 
	        { 
	            res.matrix[i][j] = 0; 
	            for (k = 0; k < size; k++) 
	                res.matrix[i][j] += this.matrix[i][k]*secondmatrix.matrix[k][j]; 
	        } 
	    } 
	    return res;
	}
	public void finalize() {
		matrix=null;
		size=0;
	}
}
