package day08_IfStatements.day09_IfElseStatements;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        boolean leapYear = year % 4 == 0;
        if (leapYear) {
            System.out.println("Year " + year + " is a leap year.");
        } else {
            System.out.println("Year " + year + " is NOT a leap year.");
        }
        scan.close();
    }
}