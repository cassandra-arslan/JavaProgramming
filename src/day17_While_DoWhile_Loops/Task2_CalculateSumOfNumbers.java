package day17_While_DoWhile_Loops;
import java.util.Scanner;
public class Task2_CalculateSumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result= 0;
        while (true) {
            System.out.println("Please enter a number:");
            int num1 = scan.nextInt();
            if (num1< 0) {
                break;
            }
            result +=num1;
        }
        System.out.println(result);
        }
    }

/*2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop*/