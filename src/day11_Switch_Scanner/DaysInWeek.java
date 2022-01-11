package day11_Switch_Scanner;
import java.util.Scanner;
public class DaysInWeek {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int number=scan.nextInt();

        switch (number){
            case 1:
                System.out.println("Monday");
                break;//exits the switch after executing case block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break; //exits the switch after executing case block
            case 5:
                System.out.println("Friday");
               break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid selection");
        }
        scan.close();
    }
}
