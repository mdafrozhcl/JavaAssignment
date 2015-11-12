package JavaOOPs;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Morgan Bank Application");
		Account userAccount = new Account();
		int acNum = 100;
		String acType ="savings";
		int acBalance= 2000;
		int choice = 1;
		while (choice != 0) {
			String msg = "Menu" + "\n----\n" + "1. Open Account\n"
					+ "2. Deposit\n" + "3. Withdraw\n" + "4. Account details\n0. Exit"
					+ "\nEnter Your choice: ";
			System.out.print(msg);
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				break;
			case 1:
				System.out.print("Enter Account Number: ");
				acNum = sc.nextInt();
				System.out.print("Enter Account Type: ");
				acType = sc.next();
				System.out.print("Enter Account Balance: ");
				acBalance = sc.nextInt();
				userAccount.setAccountDetails(acNum, acType, acBalance);
				break;
			case 2:
				System.out.println("1000 will be deposited shortly");
				userAccount.deposit();
				break;
			case 3:
				userAccount.withdraw();
				break;
			case 4:
				userAccount.dispAccountDetails();
				break;
			default:
				System.err.println("Invalid choice, please try again");
			}
		}
		System.out.println("Good Bye...");
		// this is for 3rd question
		new Account(acNum, acType, acBalance).dispAccountDetails();
		sc.close();
	}
}
