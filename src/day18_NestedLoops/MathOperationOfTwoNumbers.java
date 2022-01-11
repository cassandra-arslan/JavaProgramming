package day18_NestedLoops;
import java.util.Scanner;
public class MathOperationOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.println("Enter first number:");
            int num1 = scan.nextInt();
            System.out.println("Enter second number:");
            int num2 = scan.nextInt();
            System.out.println("Enter an arithmetic operator:");
            char ch = scan.next().charAt(0);

            while (!(ch == '+'||ch=='-'||ch=='*'||ch == '/')){
                System.err.println("Invalid entry, please re-enter");
                System.out.println("Enter and arithmetic operator:");
                ch = scan.next().charAt(0);
            }
            if (ch == '+'){
                result = num1+num2;
            }else if (ch == '-'){
                result = num1-num2;
            }else if (ch == '*'){
                result = num1*num2;
            }else{
                result = (num1/num2);
            }

            System.out.println(result);

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no")||a.equals("y") || a.equals("n"))) {
                System.err.println("Invalid entry, please re-enter");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no")) {
                break;
            }
        }
        scan.close();
    }
}
