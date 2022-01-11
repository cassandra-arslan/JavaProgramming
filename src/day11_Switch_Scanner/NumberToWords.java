package day11_Switch_Scanner;
import java.util.Scanner;
public class NumberToWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1-9");
        int number = input.nextInt();
        String result = "";

        switch (number) {
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result= "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            default:
                result ="Not a valid selection";
        }
        System.out.println("The number "+number+" is written as "+result+".");
    }
}

