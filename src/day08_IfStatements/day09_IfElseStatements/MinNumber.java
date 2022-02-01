package day08_IfStatements.day09_IfElseStatements;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        boolean num1IsMin = num1 < num2;
        boolean num2IsMin = !num1IsMin;
        if (num1IsMin) {
            System.out.println(num1 + " is the minimum number.");
        } else {
            System.out.println(num2 + " is the minimum number.");
        }
        scan.close();
    }

}


/*1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number

 */