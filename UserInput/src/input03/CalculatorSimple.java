package input03;
import java.util.Scanner;
public class CalculatorSimple
{

    public static void main(String[] args)
    {
	int numInput1;
	int numInput2;
	String mathOperator;
	Scanner sc = new Scanner(System.in);
	System.out.println("What do you want to do? Choose out of '+', '-', '*', '/'.");
	mathOperator = sc.nextLine();
	if (mathOperator == "+" || mathOperator == "-" || mathOperator == "*" || mathOperator == "/") {
	    System.out.println(mathOperator);
	}
	sc.close();
    }

}
