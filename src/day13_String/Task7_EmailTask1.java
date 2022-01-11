package day13_String;
import java.util.Scanner;
public class Task7_EmailTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter email address:");
        String email = scan.nextLine();
        String result = "";
       if (email.contains("_")){
           result = email.substring(email.indexOf("_")+1,email.indexOf("@"))+"_"+email.substring(0,email.indexOf("_"))+email.substring(email.indexOf("@"));
           System.out.println(result);
       }else{
           System.out.println(email);
       }
    scan.close();
    }
}
/*  System.out.println("Enter an email");
        String w1 = scan.nextLine();
        if(w1.contains("_")){
            System.out.println(email.substring(email.indexOf("_")+1,email.indexOf("@"))
                    +"_"+email.substring(0,email.indexOf("_"))+email.substring(email.indexOf("@")));
        }else{
            System.out.println(w1);
        }


7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com*/