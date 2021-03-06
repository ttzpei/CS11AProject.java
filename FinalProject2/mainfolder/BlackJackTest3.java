package mainfolder;


import java.util.Scanner;
import java.util.Random;
import cardvalue.CardValue;
import card.Card;
import card.Text;


public class BlackJackTest3{

	/**
	@param args An array of strings that we ignore
	*/

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[][] cards = Card.cardList();
		int end = 0;
		Text.intro(scanner);
		double bettingPool = Text.bettingPool(scanner);
		do{
			System.out.println("Alright, how much do you want to bet for this round?");
			double bet = scanner.nextDouble(); scanner.nextLine();
			String computer = Card.generateCard1(cards);
			String computer2 = Card.generateCard3(cards, computer);
			int computerValue = CardValue.cardValue(computer, computer2);
			System.out.println("Alright! Here are your first two cards.");
			String result = Card.generateCard1(cards);
			String result2 = Card.generateCard3(cards, result);
			String split[] = result.split(" ");
			String split2[] = result2.split(" ");
			System.out.printf("%s%n%s%n",result, result2);
			int sum = CardValue.cardValue(result, result2);
			System.out.println("Do you want to hit, stand, or switch?");
			String choice = scanner.nextLine();
			sum = userOption(choice, sum, cards, result, result2);
			if(choice.equals("switch") && !split[0].equals("Ace") && !split[0].equals("Ace")){
				System.out.println("You had no aces to switch. Default to stand.");
			}
			if(sum > 21){
					Text.loseCondition(bettingPool, bet, computer, computer2, sum, computerValue);
					bettingPool -= bet;
			}else if(sum==21 || sum-computerValue>0){
				Text.winCondition(bettingPool, bet, computer, computer2, sum, computerValue);
				bettingPool += bet;
			} else if (sum==computerValue){
				Text.tieCondition(sum, computerValue, computer, computer2);
			}else{
				Text.loseCondition(bettingPool, bet, computer, computer2, sum, computerValue);
				bettingPool -= bet;
			}
			Text.retryCondition(scanner);
			end = scanner.nextInt(); scanner.nextLine();
		}while(end == 0);
		Text.finalResult(bettingPool);
	}

	/**
	This method evaluates the user's decision to either hit, stand or switch ace.
	Then it returns a value based on the user input.
	@param choice This is the choice that the user inputs
	@param sum This is the original value of the user's hand
	@param cards This is the array that represents a deck of cards
	@param card1 This represents the user's first cards
	@param card2 This represents the user's second card
	@return returns the user's hand and hand value based on their decision
	*/
	public static int userOption(String choice, int sum, String[][] cards, String card1, String card2){
		String split[] = card1.split(" ");
		String split2[] = card2.split(" ");
		if(choice.equals("hit")){
	    String k = Card.generateCard2(cards, card1, card2);
			System.out.println("You got hit with a " + k);
	    int j = CardValue.cardValue2(k);
			sum += j;
	    return sum;
	  }else if(choice.equals("stand")){
	    return sum;
	  }else if (choice.equals("switch")){
	    if(split[0].equals("Ace") || split2[0].equals("Ace")){
	      sum += 10;
	      return sum;
	    }else{
	      return sum;
	    }
	  }else{
			System.out.println("Invalid input; Default to stand.");
	    return sum;
	  }
	}
}
