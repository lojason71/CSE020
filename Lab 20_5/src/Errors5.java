import java.util.Scanner;

public class Errors5 {

	public static void main(String[] args) {

		Scanner kbd = new Scanner(System.in);
		float weight;
		int age;
		
		System.out.print("What is your weight in kg? " );
		weight = kbd.nextFloat();

		System.out.print("What is your age? ");
		age = kbd.nextInt();

		System.out.println("Wow! You are " + (int) (age*6.9) + " in dog years.");
		System.out.println("Your weight in lbs is " + (int) (weight * 2.2) + " with no decimal point");
	}

}