package Figures;

import java.util.Scanner;

abstract class Figure
{
	double dim1;
	double dim2;
	double dim3;

		
	abstract void findArea(); 
	abstract void findPerimeter();
}

class Circle extends Figure{
	
	final double PI = 3.14159;
	
	public Circle(double radius)
	{
		this.dim1 = radius;
	}
	
	public void circleDetails()
	{
 		System.out.println("The radius of the circle is: " + dim1); 
	}
	
	public void findArea()
	{
 		System.out.println("The area of the circle is: " + (PI*dim1*dim1)); 
	}
	
	public void findPerimeter()
	{
 		System.out.println("The circumference of the circle is: " + (2*PI*dim1)); 
	}

}

class Rectangle extends Figure{
	
	 
	
	public Rectangle(double length, double width)
	{
		this.dim1 = length;
		this.dim2 = width;
	}
	
	public void rectangleDetails()
	{
		System.out.println("The length of the rectangle is: " + dim1); 
		System.out.println("The width of the rectangle is: " + dim2);
	}
	
	public void findArea()
	{
 		System.out.println("The area of the rectangle is: " + (dim1 * dim2)); 
	}
	
	public void findPerimeter()
	{
		System.out.println("The perimeter of the rectangle is: " + (2*(dim1 + dim2))); 
	}
	
}

class Triangle extends Figure{
	 
	
	public Triangle(double side1, double side2, double side3)
	{
		this.dim1 = side1;
		this.dim2 = side2;
		this.dim3 = side3;
	}
	
	public void triangleDetails()
	{
		System.out.println("The length of first side of the triangle is: " + dim1); 
		System.out.println("The length of second side of the triangle is: " + dim2); 
		System.out.println("The length of third side of the triangle is: " + dim3); 
	}
	
	public void findArea()
	{
		double s = dim1 + dim2 + dim3;
 		System.out.println("The area of the triangle is: " + Math.sqrt((s)*(s-dim1)*(s-dim2)*(s-dim3))); 
	}
	
	public void findPerimeter()
	{
		System.out.println("The perimeter of the rectangle is: " + (dim1 + dim2 + dim3)); 
	}
}
  
 public class FigureDemo {

	public static void main(String[] args) {

		System.out.println("This program prints the area and perimeter of figures given their details");
 
		System.out.println("\nPlease input the radius of the circle to find its area and circumference");
		Scanner scan1 = new Scanner(System.in);
		double radius = scan1.nextDouble();
		
		Circle circleObject = new Circle(radius);
	            
        circleObject.circleDetails();
        circleObject.findPerimeter();
        circleObject.findArea();
		
        
        System.out.println("\nPlease input the length and width of the rectangle to find its area and perimeter");
		
        System.out.println("Please input the length");
        Scanner scan2 = new Scanner(System.in);
		double length = scan2.nextDouble();
		
		System.out.println("Please input the width");
        Scanner scan3 = new Scanner(System.in);
		double width = scan3.nextDouble();
		
		Rectangle rectangleObject = new Rectangle(length, width);
		rectangleObject.rectangleDetails();
		rectangleObject.findPerimeter();
		rectangleObject.findArea();
		
		
		System.out.println("\nPlease input the three sides of the triangle to find its area and perimeter");
			
        System.out.println("Please input the first side");
        Scanner scan4 = new Scanner(System.in);
		double side1 = scan4.nextDouble();
		
		System.out.println("Please input the second side");
        Scanner scan5 = new Scanner(System.in);
		double side2 = scan5.nextDouble();
		
		System.out.println("Please input the third side");
        Scanner scan6 = new Scanner(System.in);
		double side3 = scan6.nextDouble();
	
		Triangle triangleObject = new Triangle(side1, side2, side3);
		triangleObject.triangleDetails();
		triangleObject.findPerimeter();
		triangleObject.findArea();		
	}

}
