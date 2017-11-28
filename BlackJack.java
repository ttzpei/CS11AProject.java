import java.util.Scanner;
import java.util.Random;

public class BlackJack{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[][] Cards = cardList(); //please make the method for the array of all cards
		int end = 0;
		int end2 = 0;
		//if you have time, make this whole loop a method.
		do{
			System.out.println("Welcome to BlackJack");
			System.out.println("If you need any help, press '9' now.");
			System.out.println("If not press 0.");
			int help = scanner.nextInt(); scanner.nextLine();
			if(help == 9){
				blackjackManual(); //done
			}
			int computer = computerValue(); //generate random computer card values.
			System.out.println("Alright! Here are your first two cards.");
			String result = generateCard1(Cards); //generate first cards in a method
			String result2 = generateCard1(Cards);
			System.out.printf("%s %s%n",result, result2);
			int sum = cardValue(result); //get the numeric value based on the card in a method
			System.out.println("Do you want to hit, stand, or switch ace?");
			String choice = scanner.nextLine();
			sum = userOption(choice); //change the sum based on the use choice in a method
			if(sum==21 || sum-computer>0){
				System.out.println("Congrats! You win!");
			}else{
				System.out.println("The computer won with a hand value of %d",computer);
			}
			System.out.println("Do you want to try again?");
			System.out.println("If so enter a number other than 0");
			end = scanner.getInt(); scanner.getLine();
		}while(end==0);
	}
}
