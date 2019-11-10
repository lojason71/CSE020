import java.util.Scanner;

public class Manipulate {

	public static void main(String[] args) {		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter Two Integers: ");
		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		System.out.println("Sum of " + n1 + " " + "and " + n2 + " " + "is " + (n1+n2));
		System.out.println("Difference of " + n1 + " " + "and " + n2 + " " + "is " + (n1-n2));
		System.out.println("Product of " + n1 + " " + "and " + n2 + " " + "is " + (n1*n2));
		System.out.println("Integer cast of " + "(" + n1 + " " + "/ " + n2 + ")" +" " + "is " + (n1/n2));
		
		System.out.println();
		
		System.out.println("Enter Two Shorts: ");
		short s1 = kb.nextShort();
		short s2 = kb.nextShort();
		System.out.println("Sum of " + s1 + " " + "and " + s2 + " " + "is " + (s1+s2));
		System.out.println("Difference of " + s1 + " " + "and " + s2 + " " + "is " + (s1-s2));
		System.out.println("Product of " + s1 + " " + "and " + s2 + " " + "is " + (s1*s2));
		System.out.println("Short cast of " + "(" + s1 + " " + "% " + s2 + ")" +" " + "is " + (s1%s2));
		
		System.out.println();
		
		System.out.println("Enter Two Floats: ");
		float f1 = kb.nextFloat();
		float f2 = kb.nextFloat();
		System.out.println("Sum of " + f1 + " " + "and " + f2 + " " + "is " + (f1+f2));
		System.out.println("Difference of " + f1 + " " + "and " + f2 + " " + "is " + (f1-f2));
		System.out.println("Product of " + f1 + " " + "and " + f2 + " " + "is " + (f1*f2));
		System.out.println("Float cast of " + "(" + f1 + " " + "% " + f2 + ")" +" " + "is " + (f1%f2));
		
		System.out.println();
		
		System.out.println("Enter Two Doubles: ");
		double d1 = kb.nextDouble();
		double d2 = kb.nextDouble();
		System.out.println("Sum of " + d1 + " " + "and " + d2 + " " + "is " + (d1+d2));
		System.out.println("Difference of " + d1 + " " + "and " + d2 + " " + "is " + (d1-d2));
		System.out.println("Product of " + d1 + " " + "and " + d2 + " " + "is " + (d1*d2));
		System.out.println("Double cast of " + "(" + d1 + " " + "% " + d2 + ")" +" " + "is " + (d1%d2));		
		
		
	}

}
