import java.util.Scanner;

public class BlackJack{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to BlackJack");
		System.out.println("If you need any help, press '9' now.");
		System.out.println("If not press 0.");
		int help = scanner.nextInt(); scanner.nextLine();
		if(help == 9){
			blackjackManual();
		}
	}
}
