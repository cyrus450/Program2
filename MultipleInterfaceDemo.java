package multipleinterface;
import java.util.Scanner;
public class MultipleInterfaceDemo {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emplyoee name: ");
		String name= sc.nextLine();
		
		System.out.println("Enter age: ");
		int age= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter desgination: ");
		String designation= sc.nextLine();
		
		System.out.println("\nEnter department: ");
		String department= sc.nextLine();
		
		Employee emp = new Employee(name, age , department, designation);
		
		int choice;
		do {
		
			System.out.println(" \n---emplyoee menu--- ");
			System.out.println("1.Display emplyoee ");
			System.out.println("2.Display personal: ");
			System.out.println("3.Display Both: ");
			System.out.println("4.EXIT");
			System.out.println("5.Enter your choice: ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("\nPD ");
				emp.displayPersonalDetails();
				break;
				
			case 2:
				System.out.println("\nOD ");
				emp.displayOfficialDetails();
				break;
				
			case 3:
				System.out.println("\n PD ");
				emp.displayPersonalDetails();
				System.out.println("\n OD ");
				emp.displayOfficialDetails();
				break;
				
			case 4:
				System.out.println("exiting.... ");	
			break;
			
			default:
				System.out.println("inbvalid.... ");
			}
		}while(choice !=4);
		sc.close();
		
				
		}
		
		
	}
	

	

