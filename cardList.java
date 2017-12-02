/**
This program creates the cards we plan to use in a 2D array.
@return It returns the whole 2D array with all the spots filled out by cards.
*/
public static String cardList(){
  String[][] Cards = new String [4][13];
  for(int i = 0; i < 4; i++){
    for(int k = 0; i < 13; i++){

      if(k >= 0 && k <= 9){
        String[i][k] += String.valueOf(k+1);
      }else if(k == 10){
        String[i][k] += "Jack";
      }else if(k == 11){
        String[i][k] += "Queen";
      }else if(k == 12){
        String[i][k] += "King";
      }

      if(i == 0){
        String[i][k] += " Clover ";
      }else if(i == 1){
        String[i][k] += " Spade ";
      }else if(i == 2){
        String[i][k] += " Heart ";
      }else if(i == 3){
        String[i][k] += " Diamond ";
      }

      if(i == 0 || i == 1){
        String[i][k] Cards += "Black";
      }else{
        String[i][k] Cards += "Red";
      }

    }
  }
  return String[][] Cards;
}
