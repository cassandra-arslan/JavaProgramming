package day11_Switch_Scanner;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade = scan.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Great!");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Not a valid grade");
        }
    }

}
