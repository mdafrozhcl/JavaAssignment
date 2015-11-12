package JavaBasics;

import java.util.Scanner;

public class JavaBasicsFirst {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int itemNum = 0;
		String itemName="";
		double rate =0.0;
		int quantity = 0;
		System.out.println("::Java Basic::");
		System.out.println("::Welcome to find total with scanner program::");
		System.out.print("Enter item number: ");
		itemNum = sc.nextInt();		
		System.out.print("Enter item Name: ");
		itemName = sc.next();
		System.out.print("Enter rate of item: ");
		rate = sc.nextDouble();
		System.out.print("Enter quantity: ");
		quantity =sc.nextInt();
		double totalPrice = quantity * rate; 
		System.out.printf("%20s","\n\n---Result---\n");
		System.out.printf("%-6s%-10s: %d\n","Item", "Number", itemNum);
		System.out.printf("%-6s%-10s: %s\n","Item", "Name", itemName);
		System.out.printf("%-6s%-10s: %.2f\n","Item", "Rate", rate);
		System.out.printf("%-6s%-10s: %d\n","Item", "Quantity",quantity);
		System.out.printf("%-6s%-10s: %.2f","Total", "Price", totalPrice);
		sc.close();
	}

}
//output
/*  
::Java Basic section::
::Welcome to find total with scanner program::
Enter item number: 10
Enter item Name: shampoo
Enter rate of item: 2.32
Enter quantity: 4
       ---Result---
Item  Number    : 10
Item  Name      : shampoo
Item  Rate      : 2.32
Item  Quantity  : 4
Total Price     : 9.28 
*/

