package day10_MoreIfStatements;
import java.util.Scanner;
public class DayInWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String day = "";
        day = (number == 1)?"Sunday":(number == 2)?"Monday":(number == 3)?"Tuesday":(number == 4)?"Wednesday":(number == 5)?"Thursday":(number == 6)?"Friday":"Saturday";
        System.out.println("Today is "+day);
        scan.close();
    }
}
