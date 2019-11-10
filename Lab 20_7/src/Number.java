import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 1-26: ");
		double num = input.nextInt();
		char alphabetchar;
		System.out.println("You have entered " + num);
		
		if (num < 27 && num > 0) {
			alphabetchar = (char)(num+64);
			System.out.println("Character " + num + " of the Alphabet is " + alphabetchar);
		}
		else {
			System.out.println("Invalid Input! Number is outside of acceptable range.");
		}
	}

}
