package day13_String;
import java.util.Scanner;
public class Task8_EmailTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Workplace email generator\nPlease enter your first name:");
        String firstName= scan.next();
        System.out.println("Please enter your last name:");
        String lastName = scan.next();
        System.out.println("Please enter company domain name:");
        String domain = scan.next();

        System.out.println(firstName+"_"+lastName+"@"+domain+".com");
        scan.close();
    }
}
/*Tasks:
    8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple

*/