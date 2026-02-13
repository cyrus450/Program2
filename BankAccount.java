package bankmanagement;
import java.util.Scanner;

class BankAccount {
	String accountHolder;
	String accountType;
	double balance;
	
	static int totalAccounts = 0;
	//c1
	BankAccount(String name){
		this.accountHolder = name;
		this.accountType = "savings";
		this.balance = 0;
		totalAccounts++;
		
	}
	//c2
	BankAccount(String name,double deposit){
		this.accountHolder = name;
		this.accountType = "savings";
		this.balance = deposit;
		totalAccounts++;
	}
	//c3
	BankAccount(String name , double deposit, String type){
		this.accountHolder = name;
		this.accountType = type;
		this.balance = deposit;
		totalAccounts++;
	}
	//deposit
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited:" + amount);
		
	}
	//void deposit(double amount , String mode) {
		//balance += amount;
		//System.out.println("Deposited:" + amount);
		//System.out.println("Mode:" + mode);
	//}
	void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("insufficient balance");
		}else {
			balance -= amount;
			System.out.println("withdrawn:"+amount);
			System.out.println("Current Balance: " + balance);
		}
		}
	void displayAccount() {
		System.out.println("Acc details");
		System.out.println("name:" + accountHolder);
		System.out.println("type:" + accountType);
		System.out.println("balance:" + balance);
		
	}
	static void showTotalAccounts() {
		System.out.println("Total acc:" + totalAccounts);
		
	}
	}

		
	
	

	