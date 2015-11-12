package JavaOOPs;

public class Account {
	int accountNo;
	String accountType;
	int accountBalance;
	
	// this is for 3rd question
	public Account() {
		// TODO Auto-generated constructor stub
	}

	// this is for 3rd question
	Account(int acNum, String acType, int acBalance) {
		this.accountNo = acNum;
		this.accountType = acType;
		this.accountBalance = acBalance;
	}

	public void setAccountDetails(int acNum, String acType, int acBalance) {
		this.accountNo = acNum;
		this.accountType = acType;
		this.accountBalance = acBalance;
	}

	public void withdraw() {
		if (accountBalance < 1000) {
			System.err.println("You have insufficient credit");

		} else {
			accountBalance -= 1000;
			System.out.println("Please collect your cash 1000");
		}
	}

	public void deposit() {
		accountBalance += 1000;
		System.out.println("Transaction succeeded!!");
	}

	public void dispAccountDetails() {
		System.out.println("Account Details\n------------------");
		System.out.println("Account Number: " + accountNo);
		System.out.println("Account Type: " + accountType);
		System.out.println("Account Balance: " + accountBalance);
	}
}
