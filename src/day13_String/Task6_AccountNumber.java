package day13_String;
import java.util.Scanner;
public class Task6_AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your account number:");
        String acctNum = scan.next();

        if (acctNum.charAt(0)==('2')&&acctNum.length()==7){
            System.out.println("Valid account");
        }else if (acctNum.charAt(0)==('5')&&acctNum.length()==10)
            System.out.println("Valid account");
        else{
            System.out.println("Invalid account number");
        }
        scan.close();
    }
}
/*6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”*/