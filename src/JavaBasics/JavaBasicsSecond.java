package JavaBasics;

import java.util.Scanner;

public class JavaBasicsSecond {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int subject1,subject2,subject3;
		subject1=subject2=subject3=0;
		System.out.println("::Java Basic::");
		System.out.println("::Welcome to find total marks::");
		System.out.print("Enter marks for subject1: ");
		subject1 = sc.nextInt();		
		System.out.print("Enter marks for subject2: ");
		subject2 = sc.nextInt();
		System.out.print("Enter marks for subject3: ");
		subject3 = sc.nextInt();
		int totalMarks = subject1+subject2+subject3; 
		System.out.printf("%20s","\n---Result---\n");
		System.out.print("Toatl Marks: "+totalMarks);
		sc.close();
	}
}
