import java.util.Scanner;

public class TenAverage {

	public static void main(String[] args) {
		System.out.println("This program will find the average of up to 10 numbers");

		Scanner input = new Scanner(System.in);

		int count, total, runningCount;

		System.out.print("Please choose amount of numbers to average (0-10): ");
		count = input.nextInt();

		runningCount = count;
		total = 0;
		
		while (runningCount > 0 && runningCount <= 10) {
			
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			int num = input.nextInt();
			total = total + num;
			runningCount = runningCount - 1;
			
		}
		
		if (count > 0 && count <= 10) {
			System.out.println("Average is " + ((double)total/count));
		}
		
		else if (count > 10) {
			System.out.println("Input is too high!");
		}		
		
		else {
			System.out.println("There are no numbers to average.");
		}
	}
}