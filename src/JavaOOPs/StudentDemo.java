package JavaOOPs;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to student demo program");
		System.out.print("Enter student roll number: ");
		int rollNum=sc.nextInt();
		System.out.print("Enter student Name: ");
		String Name=sc.next();
		System.out.print("Enter mark1: ");
		int mark1=sc.nextInt();
		System.out.print("Enter mark2: ");
		int mark2=sc.nextInt();
		System.out.print("Enter mark3: ");
		int mark3=sc.nextInt();
		Student studObj = new Student();
		studObj.setStudDetails(rollNum, Name, mark1,mark2,mark3);
		studObj.calculateTotal();
		studObj.displayStudDetails();
		// This is 3rd question
		Student studObj1= new Student(rollNum, Name, mark1,mark2,mark3);
		studObj1.calculateTotal();
		studObj1.displayStudDetails();
		sc.close();
	}
}
