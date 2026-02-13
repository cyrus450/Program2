package shape;
 
	 import java.util.Scanner;

	   class Areamain {
	     public static void main(String[] args) {

	         Scanner sc = new Scanner(System.in);

	         square s = new square();
	         triangle t = new triangle();
	         circle c = new circle();

	         // Square
	         System.out.print("Enter side of square: ");
	         int side = sc.nextInt();
	         System.out.println("Square area = " + s.area(side));

	         // Triangle
	         System.out.print("Enter base of triangle: ");
	         int base = sc.nextInt();
	         System.out.print("Enter height of triangle: ");
	         int height = sc.nextInt();
	         System.out.println("Triangle area = " + t.area(base, height));

	         // Circle
	         System.out.print("Enter radius of circle: ");
	         int radius = sc.nextInt();
	         System.out.println("Circle area = " + c.area(radius));

	         sc.close();
	     }
	 }