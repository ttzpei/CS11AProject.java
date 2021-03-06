/**
This method prints out the instruction manual when it is called on.
*/

public static void Manual(){
  System.out.println("General BlackJack Manual for Dummies:");
  System.out.println("The goal of this game is to beat the dealer by making your hand closer to 21 than the dealer's without going over 21.");
  System.out.println("Each player will be dealt two cards to start. Each card has a value between 1-11: numbered cards equal their face value");
  System.out.println("i.e. 2 of hearts=2 and 7 of diamonds equals 7, face cards (Jack, Queen, King) are valued at 10, and an ace is valued at");
  System.out.println("either 1 or 11 (the player may choose to 'Switch' which will change the value of the ace or one of the aces from 1 to 11).");
  System.out.println("A hand's value is the sum of all their cards. If your hand is valued higher than the dealer's and equal to or below 21");
  System.out.println("you win. If your hand is lower than the dealer's or exceeds 21 you lose.");
  System.out.println();
  System.out.println("Help Option:");
  System.out.println();
  System.out.println("Once dealt two cards you will be given the option to Hit, Stand, or Switch Ace:");
  System.out.println("If your hand is below 21 and you would like to increase the value of your hand, you may choose to 'Hit'; this will signal");
  System.out.println("the dealer to deal you an additional card. You may continue to 'Hit' as long as your cards value are less than 21.");
  System.out.println("If you believe your hand is higher than the dealer's, you may choose to 'Stand'; this will signal the end of your turn");
  System.out.println("and the value of your cards will remain the same.");
  System.out.println("If you have been dealt an Ace, you will have the option to 'Switch Ace'; this will change the value of your ace from 1 to");
  System.out.println("11 or from 11 to 1 depending of the current value of your ace.");
}
