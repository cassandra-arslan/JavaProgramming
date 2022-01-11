package day09_IfElseStatements;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1 = scan.nextInt(), n2 = scan.nextInt();
        char mathOperator = scan.next().charAt(0);
        int subtraction;
        int addition;
        int multiplication;
        int division;

       if (mathOperator==45) {
           subtraction = (int) (n1 - n2);
           System.out.println(subtraction);
       }else if (mathOperator==43) {
           addition = (int) (n1 + n2);
           System.out.println(addition);
       }else if (mathOperator==42) {
           multiplication = (int) (n1 * n2);
           System.out.println(multiplication);
       }else if (mathOperator==47) {
           division = (int) (n1 / n2);
           System.out.println(division);
       }else{
           System.out.println("Invalid Operator");
       }
       scan.close();
       }

    }

/*2. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30*/
