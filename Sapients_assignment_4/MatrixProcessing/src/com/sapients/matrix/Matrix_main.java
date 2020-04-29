package com.sapients.matrix;

import java.util.Scanner;

public class Matrix_main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Matrix matrix;
     
		//asking user regarding the size of matrix
		
		System.out.println("Do you want specify matrix size?(Y/N)");
		String choice=scan.next();
		
		//if the user's choice is "y" then invoking the constructor having argument as size
		
		if(choice.equals("Y")||choice.equals("y"))
		{
			System.out.println("Enter the size of matrix");
			int size=scan.nextInt();
		    matrix=new Matrix(size);
		    System.out.println("Enter "+size+"x"+size+" matrix elements");
			matrix.read();
			System.out.println("Matrix:");
			matrix.display();
			System.out.println("Enter another matrix of size "+size+"x"+size+" to add and multiply with previous matrix");
			Matrix secondmatrix=new Matrix(size);
			secondmatrix.read();
			System.out.println("Second matrix:");
			secondmatrix.display();
			Matrix matrixAfterAddition=matrix.add(secondmatrix);
			System.out.println("Addition of matrices :");
			matrixAfterAddition.display();
			Matrix matrixAfterMultiplication=matrix.multiply(secondmatrix);
			System.out.println("Multiplication of matrices :");
			matrixAfterMultiplication.display();
			Matrix copymatrix=new Matrix(matrix);
			copymatrix.display();
			matrix=secondmatrix=matrixAfterAddition=matrixAfterMultiplication=null;
		}
		
		//if the user's choice is "n" then invoking the default constructor
		
		else if(choice.equals("N")||choice.equals("n"))
		{
			matrix=new Matrix();
			System.out.println("Enter 3x3 matrix elments");
			matrix.read();
			System.out.println("Matrix:");
			matrix.display();
			System.out.println("Enter another matrix of size  3x3 to add and multiply with previous matrix");
			Matrix secondmatrix=new Matrix();
			secondmatrix.read();
			System.out.println("Second matrix:");
			secondmatrix.display();
			Matrix matrixAfterAddition=matrix.add(secondmatrix);
			System.out.println("Addition of matrices :");
			matrixAfterAddition.display();
			Matrix matrixAfterMultiplication=matrix.multiply(secondmatrix);
			System.out.println("Multiplication of matrices :");
			matrixAfterMultiplication.display();
			Matrix copymatrix=new Matrix(matrix);
			copymatrix.display();
			matrix=secondmatrix=matrixAfterAddition=matrixAfterMultiplication=null;
		}
		else
		{
			System.out.println("Choice is invalid");	
		}
		System.gc();
	}

}
