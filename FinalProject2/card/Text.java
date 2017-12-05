package card;

import java.util.Random;
import java.util.Scanner;

public class Text{

  /**
	This method prints out the final sum of the user's betting pool.
	*/
	public static void finalResult(double bettingPool){
		System.out.println();
		System.out.printf("You have a total of $%1.2f in remaining earnings.%n", bettingPool);
	}
	/**
	Asks the user if they want to play another round.
	@param scanner this allows the use to accessthe scanner class for inputs.
	*/
	public static void retryCondition(Scanner scanner){
		System.out.println("Do you want to try again?");
		System.out.println("If so enter '0', if not enter any other number.");
	}
	/**
	This method prints out the result if the user ties the round
	*/
	public static void tieCondition(int sum, int computerValue, String computer, String computer2){
		System.out.println("You have a tie!");
		System.out.println("The computer has a hand value of " + computer + " and " + computer2);
		System.out.println("User: " + sum + " Computer: " + computerValue);
	}

 /**
 This method prints out the result if the user loses the round
 */
 public static void loseCondition(double bettingPool, double bet, String computer, String computer2, int sum, int computerValue){
	 System.out.println("The computer won with a hand value of " + computer + " and " + computer2);
	 System.out.println("User: " + sum + " Computer: " + computerValue);
 }
 /**
 This method prints out the result if the user wins the round
 */
	public static void winCondition(double bettingPool, double bet, String computer, String computer2, int sum,int computerValue){
		System.out.println("Congrats! You win!");
		System.out.println("The computer lost with a hand of " + computer + " and " + computer2);
		System.out.println("User: " + sum + " Computer: " + computerValue);
	}

	/**
	This method asks for the amount of money the user wants in their betting pool.
	@param scanner This allows the use to accessthe scanner class for inputs.
	*/
	public static double bettingPool(Scanner scanner){
		System.out.println("Please enter your total betting pool.");
		double bettingPool = scanner.nextDouble(); scanner.nextLine();
		return bettingPool;
	}
	/**
	THis method asks if the user wants to access the manual for BlackJack.
	@param scanner This allows the user to access the scanner class for inputs
	*/
	public static void intro(Scanner scanner){
		System.out.println("Welcome to BlackJack");
		System.out.println("If you need any help, press '9' now.");
		System.out.println("If not press 0.");
		int help = scanner.nextInt(); scanner.nextLine();
		if(help == 9){
			blackjackManual(); //done
		}
	}

  /**
  This method prints out the instruction manual when it is called on.
  */

  public static void blackjackManual(){
  	generalManual1();
  	generalManual2();
  }

  /**
  prints first half of the manual
  */
  public static void generalManual1(){
  	System.out.println();
  	System.out.println("General BlackJack Manual for Dummies:");
  	System.out.println();
  	System.out.println("The goal of this game is to beat the dealer by making your hand closer to 21 than the dealer's without going over 21.");
  	System.out.println("Each player will be dealt two cards to start. Each card has a value between 1-11: numbered cards equal their face value");
  	System.out.println("i.e. 2 of hearts=2 and 7 of diamonds equals 7, face cards (Jack, Queen, King) are valued at 10, and an ace is valued at");
  	System.out.println("either 1 or 11 (the player may choose to 'Switch' which will change the value of the ace or one of the aces from 1 to 11).");
  	System.out.println("A hand's value is the sum of all their cards. If your hand is valued higher than the dealer's and equal to or below 21");
  	System.out.println("you win. If your hand is lower than the dealer's or exceeds 21 you lose.");
  	System.out.println();
  }

  /**
  prints second half of the manual
  */
  public static void generalManual2(){
  	System.out.println("Once dealt two cards you will be given the option to Hit, Stand, or Switch Ace:");
  	System.out.println("If your hand is below 21 and you would like to increase the value of your hand, you may choose to 'Hit'; this will signal");
  	System.out.println("the dealer to deal you an additional card. You may continue to 'Hit' as long as your cards value are less than 21.");
  	System.out.println("If you believe your hand is higher than the dealer's, you may choose to 'Stand'; this will signal the end of your turn");
  	System.out.println("and the value of your cards will remain the same.");
  	System.out.println("If you have been dealt an Ace, you will have the option to 'Switch Ace'; this will change the value of your ace from 1 to");
  	System.out.println("11 or from 11 to 1 depending of the current value of your ace.");
  	System.out.println();
  }

}
