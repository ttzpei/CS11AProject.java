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
  if(choice == "hit"){
    String k = generateCard2(cards, card1, card2);
    int j = cardValue2(k);
    return j;
  }else if(choice == "stand"){
    return sum;
  }else if (choice == "switch"){
    
  }else{
    System.out.println("You picked none.");
  }
}
