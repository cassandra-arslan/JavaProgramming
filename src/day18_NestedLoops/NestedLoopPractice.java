package day18_NestedLoops;
import java.util.Scanner;
public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Enter your age:");
            int age = scan.nextInt();

            while (!(age>0&& age <=110)){
                System.err.println("Invalid entry, please re-enter age");
                age= scan.nextInt();
            }
            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes")||a.equals("no")||a.equals("y")||a.equals("n"))){
                System.err.println("Invalid entry, please re-enter");
                System.out.println("Would you like to continue?");
                a= scan.next().toLowerCase();
            }
            if (a.equals("no")||a.equals("n")){
                break;
            }
        }
        scan.close();
    }
}
