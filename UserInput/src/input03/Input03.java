package input03;
import java.util.Scanner;
class Input03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1;
        int input2;
        int input3;
        
        System.out.println("Enter your three numbers...");
        input1 = sc.nextInt();
        input2 = sc.nextInt();
        input3 = sc.nextInt();
        
        sc.close();
        
        System.out.println("Number 1: " + input1);
        System.out.println("Number 2: " + input2);
        System.out.println("Number 3: " + input3);
        System.out.println("Calculation: " + input1 + "+" + input2 + "+" + input3);
        
        int sum = input1 + input2 + input3;
        System.out.println("Sum: " + sum);
    }
}
