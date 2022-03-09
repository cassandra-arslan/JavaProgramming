package day09_IfElseStatements;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int number= scan.nextInt();

      String result = (number%3==0&&number%5!=0)? "Fizz": (number%5==0&number%3!=0)? "Buzz": (number%3==0&&number%5==0)? "FizzBuzz": "No Fizz or Buzz!";
      System.out.println(result);
        scan.close();
    }
}
/*1. Create a class called FizzBuzz, an integer variable named number is given to you, write a program that prints "Fizz" if the number is divisible by 3, prints "Buzz" if the number is divisible by 5, and prints FizzBuzz if the number is divisible by both 3 and 5.

            Ex:
                number 15

            Output:
                FizzBuzz*/