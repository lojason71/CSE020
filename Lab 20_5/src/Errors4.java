import java.util.Scanner;

public class Errors4 {

	public static void main(String[] args) {

		int n1, n2;

		Scanner kbd;

		System.out.println("This program asks the user for two integers and calculates their sum as an integer.");

		kbd = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		
		n1 = kbd.nextInt();

		System.out.print("Enter the second number: ");
		n2 = kbd.nextInt();

		System.out.println("The sum of the numbers is " + ((long)n1 + (long)n2));
	}

}