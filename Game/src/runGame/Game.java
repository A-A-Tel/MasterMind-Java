package runGame;
import java.util.Scanner;
public class Game{
    public static void main(String[] args){
	String playerName;
	System.out.println("Welcome to **MASTERMIND**");
	System.out.println("Voer je naam in om te starten...");
	Scanner sc = new Scanner(System.in);
	playerName = sc.nextLine();
	System.out.println(playerName);
	sc.close();
    }
}