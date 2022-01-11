package day19_NestedLoops;
import java.util.Scanner;
public class CalculatorTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a number:");
        int num1 = scan.nextInt();

        System.out.println("enter a math operator:");
        char operator = scan.next().charAt(0);
        if (!(operator=='+'||operator=='-')){
            System.err.println("Invalid math operator: "+operator);
            System.exit(0);
        }

        System.out.println("Enter another number:");

    }
}
