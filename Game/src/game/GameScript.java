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
    
    public static void main(String[] args) {
	
	// General variable setup
	
	int i;
	int randomColor;
	int attempt = 0;
	
	final int colorCount = 6;
	final int gameLength = 10;
	final int codeLength = 4;
	
	String name;
	String positionEvaluation;
	String colorCode = "";
	
	boolean firstAttempt = false;
	
	Scanner sc = new Scanner(System.in);
	Random r = new Random();

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
	
	for (i = 0; i < codeLength; i++) {
	    
	    randomColor = r.nextInt(colorCount - 1);
	    colorCode = colorCode + colorList.get(randomColor);
	    
	    }
	
	for (i = 0; i < gameLength; i++) {
	    
	    attempt = i + 1;
	    flush();
	    System.out.println(colorCode);
	    System.out.println(masterMindLargeText);
	    System.out.println("Attempt: " + attempt + "\r\n"
		    	     + "Welcome " + name + ", please enter your guess down below.\r\n"
		    	     + "Choose from: " + colorList);
	    
	    if (firstAttempt == true) {
		System.out.println("Previous guess:\r\n"
				 + name + "\r\n"
				 + "Incorrect colors are represented with an empty space.\r\n"
				 + "Correct colors are labeled white (B).\r\n"
				 + "Colors present in the code but in the incorrect position are labeled white (W).");
	    }
	    
	    
	    
	    if (sc.nextLine().toUpperCase().equals(colorCode)) {
		System.out.println("Nice you did it!");
		sc.close();
		return;
	    }
	    firstAttempt = true;
	    
	    
	    

	}
	sc.close();
    }
}
