package LangPackage;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Welcome to the palindrome program");
		System.out.print("Enter the word: ");
		String word=new Scanner(System.in).next();
		if(new StringBuffer(word).reverse().toString().equals(word)){
			System.out.println("word: "+word+" is palindrome");
		}else{
			System.out.println("word: "+word+" is not palindrome");
		}
			
	}
}
