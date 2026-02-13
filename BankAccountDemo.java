package bankmanagement;
import java.util.Scanner;

public class BankAccountDemo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
//account creation		
		System.out.println("Enter Account holder:");
		String name = sc.nextLine();
		System.out.println("initial deposit:");
		double deposit = sc.nextDouble();
		sc.nextLine();
		System.out.println("Account Type:");
		String Type = sc.nextLine();
		
		BankAccount account = new BankAccount(name , deposit , Type);
		
		int choice;
		
		do {
			System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            //System.out.println("2. Deposit with Mode");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account");
            System.out.println("4. Total Accounts Created");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            choice = sc.nextInt();
            
            switch(choice) {
            
            case 1:
                System.out.print("Enter deposit amount: ");
                double amt = sc.nextDouble();
                account.deposit(amt);
                break;

            //case 2:
               // System.out.print("Enter deposit amount: ");
               // double amt2 = sc.nextDouble();
               // sc.nextLine();
               // System.out.print("Enter mode (Cash/Cheque/UPI): ");
               // String mode = sc.nextLine();
               // account.deposit(amt2, mode);
              //  break;

            case 2:
                System.out.print("Enter withdrawal amount: ");
                double wamt = sc.nextDouble();
                account.withdraw(wamt);
                break;

            case 3:
                account.displayAccount();
                break;

            case 4:
                BankAccount.showTotalAccounts();
                break;

            case 5:
                System.out.println("Thank you for using the Bank Application.");
                break;

            default:
                System.out.println("Invalid choice");
        }

    } while (choice != 5);

    sc.close();
}

		}
		
	
	

