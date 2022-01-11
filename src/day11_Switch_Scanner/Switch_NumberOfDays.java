package day11_Switch_Scanner;
import java.util.Scanner;
public class Switch_NumberOfDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of the month");
        int num = scan.nextInt();
        int year;
        int numOfDays = 0;
        String nameOfMonth = "";
        if (num >= 1 && num <= 12) {
            switch (num) {
                case 2:
                    System.out.println("Enter the year");
                    year = scan.nextInt();
                    nameOfMonth = "February";
                    if (year % 4 == 0) {
                        numOfDays = 29;
                    } else {
                        numOfDays = 28;
                    }
                    System.out.println("The month of "+nameOfMonth+" has "+numOfDays+" days.");
                    break;
                case 4: case 6: case 9: case 11:
                    numOfDays = 30;
                    if (num == 4) {
                        nameOfMonth = "April";
                    } else if (num == 6) {
                        nameOfMonth = "June";
                    } else if (num == 9) {
                        nameOfMonth = "September";
                    } else {
                        nameOfMonth = "November";
                    }
                    System.out.println("The month of "+nameOfMonth+" has "+numOfDays+" days.");
                    break;
                default:
                    numOfDays = 31;
                    if (num == 1) {
                        nameOfMonth = "January";
                    } else if (num == 3) {
                        nameOfMonth = "March";
                    } else if (num == 5) {
                        nameOfMonth = "May";
                    } else if (num == 7) {
                        nameOfMonth = "July";
                    } else if (num == 8) {
                        nameOfMonth = "August";
                    } else if (num == 10) {
                        nameOfMonth = "October";
                    } else {
                        nameOfMonth = "December";
                    }
                    System.out.println("The month of "+nameOfMonth+" has "+numOfDays+" days.");
            }
        } else {
            System.out.println("Not a valid selection");
        }
    }
}
