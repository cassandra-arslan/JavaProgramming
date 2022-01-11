package day13_String;
import java.util.Scanner;
public class Task6_CydeoLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String username = scan.nextLine().toLowerCase();
        System.out.println("Please enter your password:");
        String password = scan.nextLine().toLowerCase();

        if (username.equals("cydeo")&&password.equals("woodenspoon")){
            System.out.println("Logged in");
        }else{
            System.err.println("Invalid credentials. Please try again");
        }
        scan.close();
    }
}
/*6. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method*/
