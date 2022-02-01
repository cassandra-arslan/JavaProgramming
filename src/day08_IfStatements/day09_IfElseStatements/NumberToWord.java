package day08_IfStatements.day09_IfElseStatements;
import java.util.Scanner;
public class NumberToWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();

        String numberToWord = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday" : (day == 4) ? "Thursday" : (day == 5) ? "Friday" : (day == 6) ? "Saturday" : "Sunday";
        System.out.println("Today is " + numberToWord);
        scan.close();
    }
}