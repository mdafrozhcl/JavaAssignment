package JavaOOPs.Shapes;

import java.util.Scanner;

// 7th question requirement
/*abstract class Shape {
 abstract public double area();
 }*/

//8th question requirement
interface Shape {
	abstract public double area();
}

//7th question requirement
// class Rectangle extends Shape
//8th question requirement
class Rectangle implements Shape {
	double length, breadth;

	public Rectangle() {

	}

	Rectangle(double l, double b) {
		this.length = l;
		this.breadth = b;
	}

	@Override
	public double area() {
		return length * breadth;
	}

}
//7th question requirement
// class Circle extends Shape
//8th question requirement
class Circle implements Shape {
	double radius;

	public Circle() {

	}

	public Circle(double r) {
		this.radius = r;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}

public class ShapeDemo {
	public static void main(String[] args) {
		System.out.println("Welcome to the shape demo program");
		Scanner sc = new Scanner(System.in);
		System.out.println(":Area of a rectangle:");
		System.out.print("Enter the length: ");
		double l = sc.nextDouble();
		System.out.print("Enter the breath: ");
		double b = sc.nextDouble();
		System.out.println("Area of rectangle with the given values is "
				+ new Rectangle(l, b).area());
		System.out.println(":Area of a Circle:");
		System.out.print("Enter the radius: ");
		double r = sc.nextDouble();
		System.out.println("Area of rectangle with the given values is "
				+ new Circle(r).area());
		sc.close();
	}
}
