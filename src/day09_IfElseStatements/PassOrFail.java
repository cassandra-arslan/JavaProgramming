package day09_IfElseStatements;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score >= 60) {
            System.out.println("Congrats, you passed!");
        } else {
            System.out.println("Failed :(");
            scan.close();
        }
    }
}
