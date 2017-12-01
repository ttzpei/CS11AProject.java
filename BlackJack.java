import java.util.Scanner;
import java.util.Random;

public class BlackJack{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[][] Cards = new String[4][13];
		String[][] Cards = cardList(); //please make the method for the array of all cards
		int end = 0;
		//if you have time, make this whole loop a method.
		do{
			System.out.println("Welcome to BlackJack");
			System.out.println("If you need any help, press '9' now.");
			System.out.println("If not press 0.");
			int help = scanner.nextInt(); scanner.nextLine();
			if(help == 9){
				blackjackManual(); //done
			}
			System.out.println("Please enter your total betting pool.");
			double bettingPool = scanner.nextDouble(); scanner.nextLine();
			System.out.println("Alright, how much do you want to bet for this round?");
			double bet = scanner.nextDouble(); scanner.nextLine();
			String computer = generateCard1(Cards); //generate random computer card values. Done
			String computer2 = generateCard1(Cards);
			int computerValue = cardValue(computer, computer2); // use string split
			System.out.println("Alright! Here are your first two cards.");
			String result = generateCard1(Cards); //generate first cards in a method
			String result2 = generateCard1(Cards);
			System.out.printf("%s%n%s%n",result, result2);
			double sum = cardValue(result, result2); //get the numeric value based on the card in a method; partway done0
			System.out.println("Do you want to hit, stand, or switch?");
			String choice = scanner.nextLine();
			sum = userOption(choice); //change the sum based on the use choice in a method
			if(sum==21 || sum-computerValue>0){
				System.out.println("Congrats! You win!");
				bettingPool += bet;
<<<<<<< HEAD
			} else if (sum==computerValue){
				System.out.println("You have a tie!");
			} else{
=======
				System.out.println("Your total betting pool is" + bettingPool);
			}else{
>>>>>>> 7058c38a1656a7179aaca0a9b0313d52aac6be74
				System.out.println("The computer won with a hand value of " + computer + " and " + computer2);
				bettingPool -= bet;
			}
			System.out.println("Do you want to try again?");
			System.out.println("If so enter a number other than 0");
			end = scanner.getInt(); scanner.getLine();
		}while(end==0);
	}
}
