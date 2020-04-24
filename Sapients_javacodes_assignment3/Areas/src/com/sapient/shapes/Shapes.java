package com.sapient.shapes;

import java.math.BigDecimal;

class Circle {
	BigDecimal calculateArea(int radius)
	{
		//calculating the are of circle using logic (3.14*radius*radius)
		
		return(new BigDecimal("3.14").multiply(new BigDecimal(radius).multiply(new BigDecimal(radius))));
	}
}
class Square {
	long calculateArea(int sides)
	{
		// calculating the are of square using the logic (sides*sides)
		
		return(sides  * sides);
	}
}
class Triangle {
	BigDecimal calculateArea(int sides)
	{
		//calculating the area of trinagle using the logic (0.433*sides*sides)
		
		return(new BigDecimal("0.433").multiply(new BigDecimal(sides).multiply(new BigDecimal(sides))));
	}
}

public class Shapes {
	int numberOfSides;
	void calculateShapeArea(int numberOfSides,int length)
	{
		this.numberOfSides=numberOfSides;
		
		// calling the method calculateArea() in circle class to, calculate area of circle
		
		if(numberOfSides==1)
			{
				Circle circlearea=new Circle();
				BigDecimal area=circlearea.calculateArea(length);
				System.out.println("The Area of the circle is " +area);
			}
		
		// calling the method calculateArea() in  Triangle class, to calculate area of traingle
		
		else if(numberOfSides==3)
			{
				Triangle trianglearea=new Triangle();
				BigDecimal area=trianglearea.calculateArea(length);
				System.out.println("The Area of the Triangle is "+ area);
			}
		
		// calling the method calculateArea() in  Square class, to calculate area of square
		
		else if(numberOfSides==4)
		{
			Square squarearea=new Square();
			long area=squarearea.calculateArea(length);
			System.out.println("The Area of the Square is "+ area);
		}
		else
		{
			System.out.println("NoShapes Present");
		}
	}
	public static void main(String[] args) {
		Shapes shapes=new Shapes();
		
		//test cases
		
		shapes.calculateShapeArea(3,12);
		shapes.calculateShapeArea(4,15);
		shapes.calculateShapeArea(5,15);
	}
}
