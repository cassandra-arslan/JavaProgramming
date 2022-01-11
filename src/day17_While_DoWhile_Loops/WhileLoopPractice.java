package day17_While_DoWhile_Loops;
import java.util.Scanner;
public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String username = scan.nextLine();
        System.out.println("Please enter your password:");
        String password = scan.nextLine();

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in");
        }else {
            int attempts = 3;
            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0){
                if (attempts > 1) {
                    System.err.println("Incorrect username and/or password, please try again");
                }
                else{
                    System.err.println("This is your final attempt!");
                }
                System.out.println("Enter your username:");
                username = scan.nextLine();
                System.out.println("Enter your password:");
                password = scan.nextLine();
                attempts--;
            }
            if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged in");
            }else {
                System.out.println("Incorrect credentials. Your account is locked.");
            }
        }
        scan.close();
    }
    }

/*you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials
                and if all three attempts are failed, then print "Your account is lucked."*/
