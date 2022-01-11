package day18_NestedLoops;
import java.util.*;
public class Task3_CalculateTwoNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double result = 0;
        while (true){
            System.out.println("Welcome to the calculator\nEnter first number:");
            double num1 = scan.nextDouble();
            System.out.println("Enter a math operator:");
            char operator = scan.next().charAt(0);
            while (!(operator=='+'||operator=='-'||operator=='*'||operator=='/')){
                System.err.println("Invalid entry, please try again");
                System.out.println("Enter a math operator:");
                operator = scan.next().charAt(0);
            }
            System.out.println("Enter second number:");
            double num2 = scan.nextDouble();
            if (operator=='+'){
                result = num1+num2;
            }else if (operator=='-'){
                result = num1-num2;
            }else if (operator=='*'){
                result = num1*num2;
            }else{
                result = num1/num2;
            }

            System.out.println(result);
            System.out.println("Would you like to continue? (Y or N)");
            char a = scan.next().charAt(0);
            while (!(a=='Y'||a=='y'||a=='n'||a=='N')){
                System.err.println("Invalid entry, please try again");
                System.out.println("Would you like to continue? (Y or N)");
                a = scan.next().charAt(0);
            }
            if (a=='n'||a=='N'){
                break;
            }
        }
       scan.close();
    }
}
/*3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

*/