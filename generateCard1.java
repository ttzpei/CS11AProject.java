/**
This method generates a random card for the user.
@param cards This is the whole deck of Cards
@return Returns a randomly chosen card from the array Cards
*/
public static String generateCard1(String[][] cards){
	int High = 4;
	int first = random.nextInt(High);
	int Hi = 13;
	int second = random.nextInt(Hi);
	return cards[first][second];
	}
}
