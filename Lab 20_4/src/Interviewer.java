import java.util.Scanner;
public class Interviewer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int age;
		float height;
		String name;
		String answerq1;
		String answerq2;
		String answerq3;
		String answerq4;
		String answerq5;

		System.out.println("What is your name? "); 
		name = input.nextLine();
		
		System.out.println("What is your age? "); 
		age = input.nextInt();		
		
		
		System.out.println("What is your height in centimeters? "); 
		height = input.nextFloat();		
		input.nextLine();
		
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
		
		System.out.print("So, your name is " + name + ". ");
		System.out.print("You are " + age + " years old. ");
		System.out.print("You are " + height + " centimeters. ");
		System.out.print("You said something special about you is " + answerq1 + ". ");
		System.out.print("You would " + answerq2 + " if you could. ");
		System.out.print("You described yourself as " + answerq3 + ". ");
		System.out.print("One of your strengths is that " + answerq4 + ". ");
		System.out.print("Your goal in life is to" + answerq5 + ". ");
		
		

	}

}
