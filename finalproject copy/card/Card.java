package card;

import java.util.Random;
import java.util.Scanner;

public class Card{

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
