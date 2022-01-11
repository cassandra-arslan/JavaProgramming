package day08_IfStatements;
import java.util.Scanner;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0){
            System.out.println(n+" is a positive number.");
        }
        if (n <0){
            System.out.println(n+" is a negative number.");
        }
        if (n==0){
            System.out.println(n+" equals zero");
        }
        sc.close();
    }

}
/*3. write a program that can check if a number is negative, positive or zero
        Ex:
        number = -1;

        output:
        Negative*/