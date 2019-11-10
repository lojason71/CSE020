import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		int count = 0;
		int runningCount = 0;
		int total = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("This program will find the average of as many numbers as you like.");
		System.out.println();
		System.out.print("Please choose the number of values to average: ");
		count = input.nextInt();
		
		runningCount = count;
		
		while (runningCount > 0 && runningCount <= count) {
			System.out.print("Please enter the " + (count - runningCount + 1) + " number: ");
			int num = input.nextInt();
			total += num;
			runningCount -= 1;
		}
		System.out.println("The average of all the numbers is " + ((double) total/(count+1)));
	}
}
