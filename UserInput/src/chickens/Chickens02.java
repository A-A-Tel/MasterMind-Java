package chickens;
import java.util.*;

public class Chickens02 {
    
 // Checks if the given string contains only digits
    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("How many eggs have been collected on day one, two and three?");
	String eggsDay1Str = sc.nextLine();
	String eggsDay2Str = sc.nextLine();
	String eggsDay3Str = sc.nextLine();
	
	if (!isNumeric(eggsDay1Str) || !isNumeric(eggsDay2Str) || !isNumeric(eggsDay3Str)) {
	    System.out.println();
	} else {
	    System.exit(0);;
	}
	
	sc.close();
	
	int eggsSum = eggsDay1 + eggsDay2 + eggsDay3;
	int dailyAverage = eggsSum / 3;
	int monthlyAverage = eggsSum / 30;
	int monthlyProfit = eggsSum * 18 / 100;
	int monthlyProfitCents = eggsSum * 18 - monthlyProfit * 100;
	
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit: €" +monthlyProfit + "," + monthlyProfitCents);
    }
}
