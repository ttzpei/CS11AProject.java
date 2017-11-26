
public static String generateCard1(String[][] Cards){
	int High = 6
	int Low = 0
	int first = random.nextInt(High-Low) + Low;
	int Hi = 7;
	int Lo = 0;
	int second = random.nextInt(Hi-Lo) + Lo;
	return Cards[first][second];
	}
}
