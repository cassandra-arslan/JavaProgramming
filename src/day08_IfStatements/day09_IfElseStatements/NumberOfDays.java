package day08_IfStatements.day09_IfElseStatements;
import java.util.Scanner;
public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of month: ");
        int input = scan.nextInt();
        String month = "";
        int numberOfDays = 30;

        if (input > 0 && input <= 12){
            if (input == 1){
                month = "January";
                numberOfDays = 31;
            } else if (input == 2){
                month = "February";
                numberOfDays = 28;
            } else if (input == 3){
                month = "March";
                numberOfDays = 31;
            } else if (input == 4){
                month = "April";
                numberOfDays = 30;
            } else if (input == 5){
                month = "May";
                numberOfDays = 31;
            } else if (input == 6){
                month = "June";
                numberOfDays = 30;
            } else if (input == 7){
                month = "July";
                numberOfDays = 31;
            } else if (input == 8){
                month = "August";
                numberOfDays = 31;
            } else if (input == 9){
                month = "September";
                numberOfDays = 30;
            } else if (input == 10){
                month = "October";
                numberOfDays = 31;
            } else if (input == 11){
                month = "Novemeber";
                numberOfDays = 30;
            } else {
                month = "December";
                numberOfDays = 31;
            }
        }else {
            System.out.println("Not a valid selection.");
        }
        System.out.println("The month of " + month + " has " + numberOfDays + " days.");
        scan.close();
    }
}
/*
2. Create a class named NumberOfDays, an integer variable named month that has numbers 1 ~12 is given to you, write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)*/