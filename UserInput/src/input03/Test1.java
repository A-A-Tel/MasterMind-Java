package input03;
import java.util.Scanner;
public class Test1
{

    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int money = 5/num1;
	sc.close();
	System.out.println(money);
    }

}
