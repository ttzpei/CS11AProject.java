/**
This method evaluates the value of the cards that the user has on hand.
@param first This is the first card the user inputs
@param second This is the second card the user inputs
@return This is the total values of the two cards that the user inputs
*/
public static int cardValue(String first, String second){
  String[] split = first.split(" ");
  int first = 0;
  int second = 0;
  int sum;
  if(split[0].equals("Ace")){
    first = 1;
  }else if(!split[0].equals("King") && !split[0].equals("Queen") && !split[0].equals("Jack")){
    int result = Integer.parseInt(split[0]);
    for(int i = 2; i < 10; i++){
      if(i == result){
        first = i;
      }
    }
  }else{
    first = 10;
  }
  String[] split2 = second.split(" ");
  int uno = 0;
  int dos = 0;

  if(split2[0].equals("Ace")){
    second = 1;
  }else if(!split2[0].equals("King") && !split2[0].equals("Queen") && !split2[0].equals("Jack")){
    int result2 = Integer.parseInt(split2[0]);
    for(int j = 1; j < 10; j++){
      if(j == result2){
        second = i;
      }
    }
  }else{
    second = 10;
  }
  sum = first+second;
  return sum;

}
