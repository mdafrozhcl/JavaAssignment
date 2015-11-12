package LangPackage;

import java.util.Scanner;

enum Vowels {
	a, e, i, o, u
}

public class VowelsProgram {
	public static void main(String[] args) {
		System.out.println("Welcome to the vowels-consonents program");
		System.out.print("Enter the String: ");
		String line= new Scanner(System.in).nextLine();
		int length = line.length();
		line = line.replace(" ", "");
		int wordCount = line.length();
		wordCount = length - wordCount;
		System.out.println("Number of words are "+(wordCount+1));
		int consonentCount = line.replaceAll("a|e|i|o|u", "").length();
		length = line.length();
		int vowelCount=length-consonentCount;
		System.out.println("Number of vowels are "+vowelCount);
		System.out.println("Number of consonents are "+consonentCount);
	}
}
