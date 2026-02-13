package printerdemo;

import java.util.Scanner;
public class Printermain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printer printerP;
		int choice;
		do {
			System.out.println("----.Printer menu----");
			System.out.println("1.Dotmatrix printer");
			System.out.println("2.Laserjet printer");
			System.out.println("3.EXIT");
			System.out.println("Enter choice");
         choice = sc.nextInt();
         
         switch(choice){
        	 case 1 : 
        		printerP = new DotMatrix();
        		printerP.configuration();
        		printerP.display();
        		 break;
        	 case 2 : 
        		 printerP = new LaserJet();
        		 printerP.configuration();
        		 printerP.display();
        		 break;	 
        	 case 3 :
        		 System.out.println("EXITing...");
        		 break;
        	default:
        	System.out.println("invalid");
        
         }
		}while (choice !=3);
		sc.close();
	}
}

				
			