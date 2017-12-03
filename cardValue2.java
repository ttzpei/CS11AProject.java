/**
This method evaluates the value of the cards that the user has on hand.
@param first This is the first card the user inputs
@param second This is the second card the user inputs
@return This is the total values of the two cards that the user inputs
*/
public static int cardValue2(String first){
  String[] split = first.split(" ");
  int first = 0;

  if(!split[0].equals("King") && !split[0].equals("Queen") && !split[0].equals("Jack")){
    int result = Integer.parseInt(split[0]);
    for(int i = 1; i < 10; i++){
      if(i == result){
        first = i;
      }
    }
  }else{
    first = 10;
  }

  return first;

}
