package runGame;
import java.util.Scanner;
public class Game{
    public static void main(String[] args){
	String playerName;
	System.out.println("Welcome to **MASTERMIND**");
	System.out.println("Voer je naam in om te starten...");
	Scanner inputScanner = new Scanner(System.in);
	playerName = inputScanner.nextLine();
	System.out.println(playerName);
    }
}