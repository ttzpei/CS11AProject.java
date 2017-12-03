/**
This method generates a random card for the user.
@param cards This is the whole deck of Cards
@param card1 This represents the user's first cards
@param card2 This represents the user's second card
@return Returns a randomly chosen card from the array cards
*/
public static String generateCard2(String[][] cards, String card1, String card2){
	a = 1;
	do{
		int High = 4;
		int first = random.nextInt(High);
		int Hi = 13;
		int second = random.nextInt(Hi);
		if(cards[first][second] == card1 || cards[first][second] == card2){
			a = 0;
		}else{
			a = 1;
		}
	}while(a != 0)
	return cards[first][second];
	}
}
