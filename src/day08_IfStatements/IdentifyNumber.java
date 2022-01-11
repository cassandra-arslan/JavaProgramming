package day08_IfStatements;
import java.util.Scanner;
public class IdentifyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isPositive = num>0;
        boolean isNegative = num<0;
        boolean isZero = num==0;

        System.out.println(num+" is a positive number: "+isPositive);
        System.out.println(num+" is a negative number: "+isNegative);
        System.out.println(num+" is a zero: "+isZero);
        sc.close();
    }
}
/*1. Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false

 */