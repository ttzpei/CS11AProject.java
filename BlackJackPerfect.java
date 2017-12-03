
import java.util.Scanner;
import java.util.Random;
import java.lang.Integer;

public class BlackJackPerfect{

	/**
	@param args An array of strings that we ignore
	*/

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[][] cards = cardList();
		int end = 0;
		intro(scanner);
		double bettingPool = bettingPool(scanner);
		do{
			System.out.println("Alright, how much do you want to bet for this round?");
			double bet = scanner.nextDouble(); scanner.nextLine();
			String computer = generateCard1(cards);
			String computer2 = generateCard1(cards);
			int computerValue = cardValue(computer, computer2);
			System.out.println("Alright! Here are your first two cards.");
			String result = generateCard1(cards);
			String result2 = generateCard1(cards);
			String split[] = result.split(" ");
			String split2[] = result2.split(" ");
			System.out.printf("%s%n%s%n",result, result2);
			int sum = cardValue(result, result2);
			System.out.println("Do you want to hit, stand, or switch?");
			String choice = scanner.nextLine();
			sum = userOption(choice, sum, cards, result, result2);
			if(choice.equals("switch") && !split[0].equals("Ace") && !split[0].equals("Ace")){
				System.out.println("You had no aces to switch. Default to stand.");
			}
			if(sum > 21){
				if((sum-21)==(21-computerValue)) {
					tieCondition(sum, computerValue, computer, computer2);
				}else if((sum-21)<(21-computerValue)){
					winCondition(bettingPool, bet, computer, computer2, sum, computerValue);
					bettingPool += bet;
				}else{
					loseCondition(bettingPool, bet, computer, computer2, sum, computerValue);
					bettingPool -= bet;
				}
			}else if(sum==21 || sum-computerValue>0){
				winCondition(bettingPool, bet, computer, computer2, sum, computerValue);
				bettingPool += bet;
			} else if (sum==computerValue){
				tieCondition(sum, computerValue, computer, computer2);
			}else{
				loseCondition(bettingPool, bet, computer, computer2, sum, computerValue);
				bettingPool -= bet;
			}
			retryCondition(scanner);
			end = scanner.nextInt(); scanner.nextLine();
		}while(end == 0);
		finalResult(bettingPool);
	}

	/**
	This method prints out the final sum of the user's betting pool.
	*/
	public static void finalResult(double bettingPool){
		System.out.println();
		System.out.println("You have a total of " + bettingPool + " in remaining earnings.");
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
This program creates the cards we plan to use in a 2D array.
@return It returns the whole 2D array with all the spots filled out by cards.
*/
public static String[][] cardList(){
	String[][] cards = new String[4][13];
  for(int i = 0; i <= 3; i++){
    for(int k = 0; k <= 12; k++){
      if(k == 0){
        cards[i][k] = "Ace";
      }else if(k > 0 && k <= 9){
        cards[i][k] = String.valueOf(k+1);
      }else if(k == 10){
        cards[i][k] = "Jack";
      }else if(k == 11){
        cards[i][k] = "Queen";
      }else if(k == 12){
        cards[i][k] = "King";
      }
      if(i == 0){
        cards[i][k] += " Clover ";
      }else if(i == 1){
        cards[i][k] += " Spade ";
      }else if(i == 2){
        cards[i][k] += " Heart ";
      }else if(i == 3){
        cards[i][k] += " Diamond ";
      }

      if(i == 0 || i == 1){
        cards[i][k] += "Black";
      }else{
        cards[i][k] += "Red";
      }
    }
  }
  return cards;
}

/**
This method evaluates the value of the cards that the user has on hand.
@param first This is the first card the user inputs
@param second This is the second card the user inputs
@return This is the total values of the two cards that the user inputs
*/
public static int cardValue(String first, String second){
	int sum;
	int firs = cardPart1(first);
	int secon = cardPart2(second);
  sum = firs+secon;
  return sum;

}

/**
This method evaluates the value of the user's first card
@param first This is the first card of the userOption
@return This returns the numberical value of the card
*/
public static int cardPart1(String first){
	String[] split = first.split(" ");
	int firs = 0;
	if(split[0].equals("Ace")){
		firs = 1;
		return firs;
	}else if(!split[0].equals("King") && !split[0].equals("Queen") && !split[0].equals("Jack")){
		int result = Integer.parseInt(split[0]);
		for(int i = 2; i <= 10; i++){
			if(i == result){
				firs = i;
				return firs;
			}
		}
	}else{
		firs = 10;
		return firs;
	}
	return firs;
}

/**
This method evaluates the value of the user's second card
@param second This is the first card of the userOption
@return This returns the numberical value of the card
*/
public static int cardPart2(String second){
	String[] split2 = second.split(" ");
  int secon = 0;
  if(split2[0].equals("Ace")){
    return secon = 1;
  }else if(!split2[0].equals("King") && !split2[0].equals("Queen") && !split2[0].equals("Jack")){
    int result2 = Integer.parseInt(split2[0]);
    for(int j = 1; j <= 10; j++){
      if(j == result2){
        return secon = j;
      }
    }
  }else{
    return secon = 10;
  }
	return secon;
}

/**
This method evaluates the value of the cards that the user has on hand.
@param first This is the first card the user inputs
@return This is the total values of the two cards that the user inputs
*/
public static int cardValue2(String first){
  String[] split = first.split(" ");
  int firs = 0;
  if(split[0].equals("Ace")){
    firs = 1;
  }else if(!split[0].equals("King") && !split[0].equals("Queen") && !split[0].equals("Jack")){
    int result = Integer.parseInt(split[0]);
    for(int i = 1; i <= 10; i++){
      if(i == result){
        firs = i;
      }
    }
  }else{
    firs = 10;
  }

  return firs;

}

/**
This method generates a random card for the user.
@param cards This is the whole deck of Cards
@param card1 This represents the user's first cards
@param card2 This represents the user's second card
@return Returns a randomly chosen card from the array cards
*/
public static String generateCard2(String[][] cards, String card1, String card2){
	Random random = new Random();
	int a = 1;
	int first = 0;
	int second = 0;
	do{
		int High = 4;
		first = random.nextInt(High);
		int Hi = 13;
		second = random.nextInt(Hi);
		if(cards[first][second] == card1 || cards[first][second] == card2){
			a = 0;
		}else{
			a = 1;
		}
	}while(a != 0);
	return cards[first][second];
}

/**
This method generates a random card for the user.
@param cards This is the whole deck of Cards
@return Returns a randomly chosen card from the array Cards
*/
public static String generateCard1(String[][] cards){
	Random random = new Random();
	int High = 4;
	int first = random.nextInt(High);
	int Hi = 13;
	int second = random.nextInt(Hi);
	return cards[first][second];
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
    String k = generateCard2(cards, card1, card2);
		System.out.println("You got hit with a " + k);
    int j = cardValue2(k);
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
