package JavaOOPs;

import java.util.Scanner;

class Employee {
	String name;
	double salary;

	public Employee() {

	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\tSalary: " + salary;
	}
}

class Manager extends Employee {
	String department;

	public Manager() {

	}

	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}

	@Override
	public String toString() {
		return super.toString() + "\tDepartment: " + department;
	}
}

class Executive extends Manager {
	public Executive() {

	}

	public Executive(String name, double salary, String department) {
		super(name, salary, department);
	}

	@Override
	public String toString() {
		return "Executive: " + super.toString();
	}
}

public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to employee salary program");
		System.out.println(":Employee:");
		System.out.print("Enter the name of the Employee: ");
		String name = sc.next();
		System.out.print("Enter the salary: ");
		double salary = sc.nextDouble();
		Employee emp1 = new Employee(name, salary);
		System.out.println(emp1);
		System.out.println(":Manager:");
		System.out.print("Enter the name of the Manager: ");
		name = sc.next();
		System.out.print("Enter the salary: ");
		salary = sc.nextDouble();
		System.out.print("Enter the department: ");
		String department = sc.next();
		Manager mgr = new Manager(name, salary, department);
		System.out.println(mgr);
		System.out.println(":Executive:");
		System.out.print("Enter the name of the Executive Manager: ");
		name = sc.next();
		System.out.print("Enter the salary: ");
		salary = sc.nextDouble();
		System.out.print("Enter the department: ");
		department = sc.next();
		Executive exc = new Executive(name, salary, department);
		System.out.println(exc);
		sc.close();
	}
}
