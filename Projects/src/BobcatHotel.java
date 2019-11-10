import java.util.Scanner;

public class BobcatHotel {

	public static void main(String[] args) {
		System.out.println("ROOM OPTIONS");
		System.out.println("1. Single @ $50.50 per night");
		System.out.println("2. Double @ $75.00 per night");
		System.out.println("3. Queen @ $100.75 per night");
		System.out.println("4. King @ $150.25 per night");
		System.out.println("5. Master Suite @ $225.50 per night");
		Scanner kb = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Number of guests: ");
		int guests = kb.nextInt();
		
		System.out.print("Please your choice of room (enter 1/2/3/4/5 corresponding to the options shown above): ");
		int room = kb.nextInt();
		
		System.out.print("Please enter the number of nights: ");
		int nights = kb.nextInt();
		
		System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)? ");
		int aaa = kb.nextInt();
		
		System.out.print("Are you a club member (enter 1 for yes, 0 for no)? ");
		int member = kb.nextInt();
		
		boolean membershipdiscount = false;
		if (member == 1) {
			System.out.println();
			int random = (int)(Math.random() * 10);
			if (random <= 4) {
				System.out.println("Congratulations! You've qualified for our \"Stay 4 nights get 1 free promotion\" Discount will be applied during checkout depending on the number of days");
				membershipdiscount = true;
			}
			else { 
				System.out.println("Unfortunately, you didn't qualify for our \"Stay 4 nights get 1 free promotion\". Better luck next time!");
				membershipdiscount = false;
			}
		}
		
		//Meal plans
		System.out.println();
		int meal;
		switch(room) {
		case 5:
			System.out.println("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT");
			System.out.println("0. Complementary @ $0 per guest");
			System.out.println("1. Standard @ $30 per guest");
			System.out.println("2. Deluxe @ $50 per guest");
			System.out.println("3. Indulgence @ $85 per guest");
			System.out.print("Please select your desired meal package (enter 0/1/2/3 corresponding to the options shown above): ");
			meal = kb.nextInt();
			break;
		default:
			System.out.println("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)");
			System.out.println("0. Complementary @ $0 per guest");
			System.out.println("1. Standard @ $30 per guest");
			System.out.println("2. Deluxe @ $50 per guest");
			System.out.print("Please select your desired meal package (enter 0/1/2/ corresponding to the options shown above): ");
			meal = kb.nextInt();
		}
		
		//Checkout
		System.out.println();
		System.out.println("CHECKOUT");
		double roomcost = 0;
		double mealcost = 0;
		double aaadiscount = 0;
		double memberdiscount = 0;
		
		//Room cost
		System.out.print("Room Cost: \t");
		switch (room) {
		case 1: 
			roomcost = (50.50) * nights;
			System.out.println("$" + roomcost);
			break;
		case 2: 
			roomcost = (75.00) * nights;
			System.out.println("$" + roomcost);
			break;
		case 3: 
			roomcost = (100.75) * nights;
			System.out.println("$" + roomcost);
			break;
		case 4: 
			roomcost = (150.25) * nights;
			System.out.println("$" + roomcost);
			break;
		case 5: 
			roomcost = (225.50) * nights;
			System.out.println("$" + roomcost);
			break;
		}
		
		//Meal cost
		switch (meal) {
		case 1:
			mealcost = (30.0) * guests * nights;
			System.out.println("Meal Cost: \t" + "+$" + mealcost);
			break;
		case 2:
			mealcost = (50.0) * guests * nights;
			System.out.println("Meal Cost: \t" + "+$" + mealcost);
			break;
		case 3:
			mealcost = (85.0) * guests * nights;
			System.out.println("Meal Cost: \t" + "+$" + mealcost);
			break;
		}
		
		double preliminarytotal = roomcost + mealcost;
		System.out.println("Preliminary Total Cost: \t" + "$" + (preliminarytotal) );
		
		//discount
		int numberofdiscounts = 0;
		if (aaa == 1) {
			aaadiscount = (preliminarytotal * .1);
			System.out.println("AAA Discount: \t" + "-$" + aaadiscount);
			numberofdiscounts++;
		}
		if (member == 1 && membershipdiscount == true) {
			memberdiscount = (roomcost/nights) * (nights/4);
			System.out.println("Club Member Discount: \t" + "-$" + memberdiscount);
			numberofdiscounts++;
		}
		if (numberofdiscounts == 0) {
			System.out.println("No Discounts Applied");
		}
		
		//total
		System.out.println("Total Cost of Booking: \t" + "$" + (preliminarytotal - aaadiscount - memberdiscount));
	}	
}
