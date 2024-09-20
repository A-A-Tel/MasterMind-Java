package game;

import java.util.*;

public class GameScript {
    public static void main(String[] args) {
	
	// Setup Variables
	
	ArrayList<String> colorList = new ArrayList<>();
	colorList.add("R");
	colorList.add("G");
	colorList.add("B");
	colorList.add("Y");
	colorList.add("P");
	colorList.add("C");
	
	int i = 0;
	final String masterMindLarge =   " ___ ___   ____   _____ ______    ___  ____          ___ ___  ____  ____   ___   \r\n"
				       + "|   |   | /    | / ___/|      |  /  _]|    \\        |   |   ||    ||    \\ |   \\  \r\n"
				       + "| _   _ ||  o  |(   \\_ |      | /  [_ |  D  ) _____ | _   _ | |  | |  _  ||    \\ \r\n"
				       + "|  \\_/  ||     | \\__  ||_|  |_||    _]|    / |     ||  \\_/  | |  | |  |  ||  D  |\r\n"
				       + "|   |   ||  _  | /  \\ |  |  |  |   [_ |    \\ |_____||   |   | |  | |  |  ||     |\r\n"
				       + "|   |   ||  |  | \\    |  |  |  |     ||  .  \\       |   |   | |  | |  |  ||     |\r\n"
				       + "|___|___||__|__|  \\___|  |__|  |_____||__|\\_|       |___|___||____||__|__||_____|\r\n";
	
	System.out.println(masterMindLarge);
	System.out.println(colorList);
    }
}
