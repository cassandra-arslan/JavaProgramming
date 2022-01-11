package day07_Operators;
import java.util.Scanner;
public class DivisionandRemainderCalc {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter num1: ");
            int num1 = scan.nextInt();
            System.out.println("Enter num2: ");
            int num2 = scan.nextInt();
            double divisionNum = num1/num2;
            int remainder = num1%num2;

            System.out.println(num1 + " divide by " + num2 + " with a remainder of " + num1 % num2);
            System.out.println("division " + divisionNum);
            System.out.println("remainder " + remainder);
        scan.close();
        }
    }
