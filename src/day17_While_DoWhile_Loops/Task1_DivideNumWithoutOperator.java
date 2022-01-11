package day17_While_DoWhile_Loops;
import java.util.Scanner;
public class Task1_DivideNumWithoutOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        System.out.println("Enter a number");
        int num1 = scan.nextInt();
        System.out.println("Enter a number");
        int num2 = scan.nextInt();
        int count = 0;

        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        if (num1 != 0) {
            System.out.println(count + " with a remainder of " + num1);
        } else {
            System.out.println(count);
        }
        scan.close();
    }
}
/*Tasks
	1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
*/