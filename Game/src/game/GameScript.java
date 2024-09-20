package game;

import java.util.*;

public class GameScript {
    
    static void flush() {
	int i = 0;
	while (i < 100) {
	    i++;
	    System.out.println("");
	}
    }
    
    public static void main(String[] args) throws InterruptedException {
	
	// General variable setup
	int i = 0;
	int randomColor = 0;

	final int codeLength = 5;
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	String name;
	String colorCode = "";
	

	
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
	
	
	
	
	flush();
	System.out.println("Welcome to..."); 
	System.out.println(masterMindLargeText);
	System.out.println("Let's start with your name...");
	name = sc.nextLine();
	flush();
	
	System.out.println(masterMindLargeText);
	System.out.println("All right " + name + ", time to begin...");
	
	while (i < codeLength) {
	    randomColor = r.nextInt(5);
	    colorCode = colorCode + colorList.get(randomColor);
	    
	    i++;
	    
	}
	System.out.println(colorCode);
    }
}
