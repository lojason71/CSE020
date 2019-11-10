import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.println("Please enter the first integer: ");
		n1 = input.nextInt();

		System.out.println("Please enter the second integer: ");
		n2 = input.nextInt();

		long average;
		average = ((long)n1+(long)n2)/2;
		System.out.println("The average of the numbers is " + average);

		float f1, f2;

		System.out.println("Please enter the first float:");
		f1 = input.nextFloat();

		System.out.println("Please enter the second float: ");
		f2 = input.nextFloat();

		double faverage;
		faverage = (( (double)f1+(double)f2 )/2);
		System.out.println("The average of the numbers is " + faverage);

		short s1, s2;

		System.out.println("Please enter the first short: ");
		s1 = input.nextShort();

		System.out.println("Please enter the second short: ");
		s2 = input.nextShort();

		int shortAvg;
		shortAvg = (((int)s1+(int)s2)/2);
		System.out.println("The average of the numbers is " + shortAvg);
	}

}
