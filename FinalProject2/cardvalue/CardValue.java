package cardvalue;

import java.util.Random;
import java.util.Scanner;

public class CardValue{

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
  This method evaluates the value of the cards that the user gets hit with
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

}
