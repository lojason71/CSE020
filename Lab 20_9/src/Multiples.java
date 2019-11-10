import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		int maximum = 0;
		int multiple = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("This program prints out multiples of a given number till a specified maximum.");
		System.out.println();
		System.out.print("Please enter the maximum number: ");
		maximum = kb.nextInt();
		System.out.print("Please enter the number whose multiples to print: ");
		multiple = kb.nextInt();
		System.out.println("Multiples of " + multiple + " from 1 till " + maximum + " are: " );

		int i = 0;
		while (i <= maximum) {
			if (i % multiple == 0) {
			System.out.println("Number " + (i) );
			}
			i++;
		}
		
	}

}
