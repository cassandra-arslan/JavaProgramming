package day18_NestedLoops;
import java.util.Scanner;
public class BreakTask_CheckOddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Please enter a number:");
            int num = scan.nextInt();

            if (num%2==0){
                System.out.println(num+ " is even");
            }else{
                System.out.println(num+ " is odd");
            }
            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes")||a.equals("no")||a.equals("n")||a.equals("y"))){
                System.err.println("Invalid entry, please try again");
                System.out.println("Would you like to continue?");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no")||a.equals("n")){
                break;
            }
        }
        scan.close();
    }
}
