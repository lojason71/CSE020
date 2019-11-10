import java.util.Scanner;
public class Interviewer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int age;
		String answerq1;
		String answerq2;
		String answerq3;
		String answerq4;
		String answerq5;

		System.out.println("What is your age? "); //fix this so integer doesn't skip a question (fixed lesgo) 
		age = input.nextInt();
		
		input.nextLine();
		
		if (age < 18) {
			System.out.println("Goodbye!");
			System.exit(0);
			input.close();
		}
		
			System.out.println("Tell me something you think is special about yourself.");
			answerq1 = input.nextLine();
		
		System.out.println("What is one thing you would do if you had the ability to do it?");
		answerq2 = input.nextLine();
		
		System.out.println("How would you describe yourself in one word?");
		answerq3 = input.nextLine();

		System.out.println("What is one strength you could bring to the table?");
		answerq4 = input.nextLine();
		
		System.out.println("What is your goal in life?");
		answerq5 = input.nextLine();

		
		System.out.println(); // gap between input and output
		
		System.out.print("Their age is ");
		System.out.println(age);
		
		System.out.print("Something special about them: ");
		System.out.println(answerq1);
		
		System.out.print("Something they would like to do: ");
		System.out.println(answerq2);
		
		System.out.print("A one word description of themselves: ");
		System.out.println(answerq3);
		
		System.out.print("One strength they have is: ");
		System.out.println(answerq4);
		
		System.out.print("Their goal is to: ");
		System.out.println(answerq5);

	}

}
