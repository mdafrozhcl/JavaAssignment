package JavaOOPs;

import java.util.Scanner;

class Rectangle {
	double length, breadth;

	public Rectangle() {

	}

	Rectangle(double l, double b) {
		this.length = l;
		this.breadth = b;
	}

	public double area() {
		return length * breadth;
	}
}

public class RectangleDemo {
	public static void main(String[] args) {
		System.out.println("Welcome to area of rectangle");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		double length = sc.nextDouble();
		System.out.print("Enter breadth: ");
		double breadth=sc.nextDouble();
		System.out.println("Rectangle: "+new Rectangle(length,breadth).area());
		sc.close();
	}
}
