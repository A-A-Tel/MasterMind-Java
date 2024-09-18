package chickens;

import java.util.*;

public class Chickens01 {
    
    public static void main(String[] args) {
	int totalEggs;
	int chickenCount;
	int eggsPerChicken;
	int i = 0;
	String newLine = System.getProperty("line.separator");
	Scanner sc = new Scanner(System.in);
	
	while (i < 10) {
	
	    // Day 0
	    System.out.println("How many chickens and how many eggs do they lay?");
	    chickenCount = sc.nextInt();
	    eggsPerChicken = sc.nextInt();
	    
	    // Day 1
	    totalEggs = chickenCount * eggsPerChicken;
	    System.out.println("------" + newLine + "Day 1" + newLine + "Calculation: " + chickenCount + " * " + eggsPerChicken + newLine + totalEggs + newLine + "------");
        
	    // Day 2
	    chickenCount ++;
	    totalEggs += chickenCount * eggsPerChicken;
	    System.out.println("Day 2" + newLine + "Calculation: " + chickenCount + " * " + eggsPerChicken + newLine + totalEggs + newLine + "------");
	    
	    //Day 3
	    chickenCount /= 2;
	    totalEggs += chickenCount * eggsPerChicken;
	    System.out.println("Day 3" + newLine + "Calculation: " + chickenCount + " * " + eggsPerChicken + newLine + totalEggs + newLine + "------");
	    i ++;
	}
	sc.close();
    }   
}
