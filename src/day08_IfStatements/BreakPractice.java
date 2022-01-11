package day08_IfStatements;
import java.util.Scanner;
public class BreakPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean evenNum = num%2 ==0;
        boolean oddNum = !evenNum;

        if (evenNum) {
            System.out.println(num + " is an even number.");
        }
        if(oddNum){
        System.out.println(num+" is an odd number.");
        }
        sc.close();
    }
}
        /*1. write a program that can check if a number is odd or even.
        Ex:
            number = 100

        output:
            100 is even number*/
/*

4. Write a program that can check if the student passed or failed the exam:

        ex:
            score = 55;

        output:
            failed


4. Write a program that can calculate the grade of the student
        Ex:
            score = 91;

        output:
            Congrats, your grade is: A


            score = 55

        output:
            Failed, your grade is: F
             */