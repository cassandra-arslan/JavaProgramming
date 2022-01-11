package day08_IfStatements;
import java.util.Scanner;
public class DisplayDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter day of week (1-7): ");
        int number = sc.nextInt();
        String day = "";
        if (number == 1) {
            day = "Sunday";
        } else if (number == 2) {
            day = "Monday";
        } else if (number == 3) {
            day = "Tuesday";
        } else if (number == 4) {
            day = "Wednesday";
        } else if (number == 5) {
            day = "Thursday";
        } else if (number == 6) {
            day = "Friday";
        } else if (number == 7) {
            day = "Saturday";
        }
        System.out.println("Please enter month: ");
        int num2 = sc.nextInt();
        String month = "";
        if (num2==1) {
            month ="January";
        } else if (num2==2) {
            month ="February";
        } else if (num2==3) {
            month ="March";
        } else if (num2==4) {
            month ="April";
        } else if (num2==5) {
            month ="May";
        } else if (num2==6) {
            month ="June";;
        } else if (num2==7) {
            month ="July";
        } else if (num2==8) {
            month ="August";
        } else if (num2==9) {
            month ="September";
        } else if (num2==10) {
            month ="October";
        } else if (num2==11) {
            month ="November";
        } else if (num2==12) {
            month ="Decemeber";
        }
        System.out.println("Please enter day of month:");
        int dayOfMonth = sc.nextInt();
        System.out.println("Please enter year:");
        int year = sc.nextInt();

        String finalResult = ("Today's date is "+day+", "+month+" "+dayOfMonth+"th, "+year+".");
        System.out.println(finalResult);
        sc.close();
    }
}
        //System.out.println
        //boolean has28Days = number == 2;
        //boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        //boolean has31Days = !has28Days && !has30Days;



/*1. Create a class called NameOfTheMonth, write a program that can display the name of the month
            number = 1 ~ 12
2. Create a class called NameOfTheDay, write a program that can display the name of the day
            number = 1 ~ 7
3. Create a class called NumberOfDays, Write a program that can print the number of days in a month
            Ex:
                number = 1;
            output:
                31 Days
            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2 */
