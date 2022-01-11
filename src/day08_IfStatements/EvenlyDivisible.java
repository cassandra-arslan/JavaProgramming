package day08_IfStatements;

import java.util.Scanner;
public class EvenlyDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean divisibleBy2 = num%2==0;
        boolean divisibleBy3 = num%3==0;
        boolean divisibleBy5 = num%5==0;

        System.out.println(num+" is divisible by 2: "+divisibleBy2);
        System.out.println(num+" is divisible by 3: "+divisibleBy5);
        System.out.println(num+" is divisible by 5: "+divisibleBy5);
        sc.close();
        }
}
/*2. Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

 */