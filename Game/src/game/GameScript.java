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
	int loop1 = 0;
	int loop2 = 0;
	int randomColor;
	int attempt = 0;
	
	final int colorCount = 6;
	final int gameLength = 10;
	final int codeLength = 4;
	
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
	
	while (loop1 < codeLength) {
	    
	    randomColor = r.nextInt(colorCount - 1);
	    colorCode = colorCode + colorList.get(randomColor);
	    
	    loop1++;
	    }
	
	while (loop2 < gameLength) {
	    
	    attempt = loop2 + 1;
	    flush();
	    System.out.println(colorCode);
	    System.out.println(masterMindLargeText);
	    System.out.println("Attempt: " + attempt + "\r\n"
		    	     + "Welcome " + name + ", please enter your guess down below.\r\n"
		    	     + "Choose from: " + colorList);
	    
	    
	    if (sc.nextLine().toUpperCase().equals(colorCode)) {
		System.out.println("Nice you did it!");
		sc.close();
		return;
	    }
	    
	    
	    
	    
	    loop2++;
	}
	sc.close();
    }
}
