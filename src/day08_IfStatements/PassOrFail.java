package day08_IfStatements;
import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter score: ");
        int score = sc.nextInt();

        boolean A = score >=90 && score <=100;
        boolean B = score >= 80 && !A;
        boolean C = score >=70 &&!B &&!A;
        boolean D = score >=60 & score <=69;
        boolean F = score >=0 && !A&&!B&&!C&&!D;
        if (A){
            System.out.print("Student's grade is: A\nExcellent!");
        }if (B){
            System.out.println("Student's grade is: B\nGreat!");
        }if (C){
            System.out.println("Student's grade is: C\nGood!");
        }if (D){
            System.out.println("Student's grade is: D\nPassed, but improvement needed.");
        }if (F){
            System.out.println("Student's grade is: F\nFailed, extra credit necessary.");
        }
        sc.close();
    }

}
