package day17_While_DoWhile_Loops;
import java.util.Scanner;
public class Task3_ReturnResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int num1 = scan.nextInt();
            System.out.println("Please enter 2nd number:");
            int num2 = scan.nextInt();
            System.out.println("Please enter a math operator:");
            char ch = scan.next().charAt(0);
            int result = 0;

            while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
                System.err.println("Invalid operator, please try again");
                ch = scan.next().charAt(0);
            }
            if (ch == '+') {
                result = num1 + num2;
            } else if (ch == '-') {
                result = num1 - num2;
            } else if (ch == '*') {
                result = num1 * num2;
            } else {
                result = (num1 / num2);
            }
            System.out.println(result);
            System.out.println("Do you want to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("y") || a.equals("no") || a.equals("n"))) {
                System.err.println("Invalid entry, please try again");
                System.out.println("Would you like to continue?");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no") || a.equals("n")) {
                break;
            }
        }
        scan.close();
        }
    }

/* 3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)*/