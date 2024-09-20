package game;

import java.util.concurrent.TimeUnit;
import java.util.*;

public class GameScript {
    
    static void flush() {
	int i;
	i = 0;
	while (i < 100) {
	    i++;
	    System.out.println(" ");
	}
    }
    
    public static void main(String[] args) throws InterruptedException {
	
	// General variable setup
	int i;
	Scanner sc = new Scanner(System.in);
	
	String name;
	final int codeLength = 5;
	
	// Color list array 
	
	ArrayList<String> colorList = new ArrayList<>();
	colorList.add("R");
	colorList.add("G");
	colorList.add("B");
	colorList.add("Y");
	colorList.add("P");
	colorList.add("C");
	
	// Huge ass Master-Mind text

	final String masterMindLargeText =   " ___ ___   ____   _____ ______    ___  ____          ___ ___  ____  ____   ___   \r\n"
				           + "|   |   | /    | / ___/|      |  /  _]|    \\        |   |   ||    ||    \\ |   \\  \r\n"
				           + "| _   _ ||  o  |(   \\_ |      | /  [_ |  D  ) _____ | _   _ | |  | |  _  ||    \\ \r\n"
				           + "|  \\_/  ||     | \\__  ||_|  |_||    _]|    / |     ||  \\_/  | |  | |  |  ||  D  |\r\n"
				           + "|   |   ||  _  | /  \\ |  |  |  |   [_ |    \\ |_____||   |   | |  | |  |  ||     |\r\n"
				           + "|   |   ||  |  | \\    |  |  |  |     ||  .  \\       |   |   | |  | |  |  ||     |\r\n"
				           + "|___|___||__|__|  \\___|  |__|  |_____||__|\\_|       |___|___||____||__|__||_____|\r\n";
	
	
	
	
	
	
	System.out.println("Welcome to..."); 
	System.out.println(masterMindLargeText);
	System.out.println("Let's star with your name...");
	name = sc.nextLine();
	System.out.println(name);
	TimeUnit.SECONDS.sleep(1);
	flush();
	System.out.println(masterMindLargeText);
    }
}
