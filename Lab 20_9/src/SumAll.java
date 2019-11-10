import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		int max = 0;
		int count = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("This program will find the sum of all numbers till a specified maximum.");
		System.out.println();
		System.out.print("Please enter the max amount of numbers to add: ");
		max = kb.nextInt();
		int i = 0;
		while (i <= max){
			System.out.println("Number " + i);
			count += i;
			i++;
		}
		System.out.println("The sum of all numbers from 0 till " + max + " is: " + count);
		
		

	}

}
