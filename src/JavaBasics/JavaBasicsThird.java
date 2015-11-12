package JavaBasics;

import java.util.Scanner;

public class JavaBasicsThird {

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Java Basics");
		System.out.println("::welcome to employee salary program::");
		int empno=0;
		String empName="";
		double empBasicSalary=0.0;
		System.out.print("Enter employee number: ");
		empno= sc.nextInt();
		System.out.print("Enter employee name: ");
		empName = sc.nextLine();
		sc.next();
		System.out.print("Enter employee basic salary: ");
		empBasicSalary = sc.nextDouble();
		double hra = empBasicSalary *0.20;
		double ta = empBasicSalary *0.15;
		double da = empBasicSalary *0.30;
		double pf = empBasicSalary *0.12;
		double grossSalary = empBasicSalary +hra+ta+da+pf;
		double it=grossSalary *0.18;
		System.out.println("::Result::");
		System.out.println("emp no: "+empno);
		System.out.println("emp name: "+empName);
		System.out.println("emp basic salary: "+empBasicSalary);
		System.out.println("hra:"+hra);
		System.out.println("ta:"+ta);
		System.out.println("da:"+da);
		System.out.println("pf:"+pf);
		System.out.println("gross salary:"+grossSalary);
		System.out.println("it:"+it);
		double netsalary=(grossSalary-(it+pf));
		System.out.println("net salary:"+netsalary);
		sc.close();
		
	}
}
