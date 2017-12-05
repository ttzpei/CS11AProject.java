package card;

import java.util.Random;
import java.util.Scanner;

public class Card{
  
  /**
  This program creates the cards we plan to use in a 2D array.
  @return It returns the whole 2D array with all the spots filled out by cards.
  */
  public static String[][] cardList(){
  	String[][] cards = new String[4][13];
    for(int i = 0; i < cards.length; i++){
      for(int k = 0; k < cards[0].length; k++){
  			cards[i][k] = firstPart(cards, k);
  			cards[i][k] += secondPart(cards, i);
  			cards[i][k] += thirdPart(cards, i);
      }
    }
    return cards;
  }

  /**
  This program generates the number/face value of the cards in the deck
  @param cards unassigned array that makes up the deck of cards
  @param k represents the row of the deck and is used to assign values
  @return first part of the cards in the deck
  */
  public static String firstPart(String[][] cards, int k){
  	String result = "";
  	if(k == 0){
  		return result = "Ace";
  	}else if(k > 0 && k <= 9){
  		return result = String.valueOf(k+1);
  	}else if(k == 10){
  		return result = "Jack";
  	}else if(k == 11){
  		return result = "Queen";
  	}else if(k == 12){
  		return result = "King";
  	}
  	return result;
  }

  /**
  This program generates whether the cards are clove, spade, heart, or jack
  @param cards unassigned array that makes up the deck of cards
  @param i represents column of the double array and is used to assign value.
  @return second part of the cards in the deck
  */
  public static String secondPart(String[][] cards, int i){
  	String result = "";
  	if(i == 0){
  		return result = " Clover ";
  	}else if(i == 1){
  		return result = " Spade ";
  	}else if(i == 2){
  		return result = " Heart ";
  	}else if(i == 3){
  		return result = " Diamond ";
  	}
  	return result;
  }

  /**
  This program generates whether the cards are red or black
  @param cards unassigned array that makes up the deck of cards
  @param i represents column of the double array and is used to assign value.
  @return third part of the cards in the deck
  */
  public static String thirdPart(String[][] cards, int i){
  	String result = "";
  	if(i == 0 || i == 1){
  		return result = "Black";
  	}else{
  		return result = "Red";
  	}
  }

  /**
  This method generates a random card for the user.
  @param cards This is the whole deck of cards
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
  This method generates the second card in the user's/computer's hand.
  @param cards This is the array that represents the deck of cards
  @param result1 This is the first card the user got. It is used here to make
  sure there are no repeated cards.
  @return returns the second card in the user's/computer's hand.
  */
  public static String generateCard3(String[][] cards, String result1){
  	Random random = new Random();
  	int n;
  	int first, second;
  	do{
  		n=1;
  		int High = 4;
  		first = random.nextInt(High);
  		int Hi = 13;
  		second = random.nextInt(Hi);
  		if(cards[first][second].equals(result1)){
  			n=0;
  		}
  	}while(n==0);
  	return cards[first][second];
  }
}
