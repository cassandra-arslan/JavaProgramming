package day15_String;
import java.util.Scanner;
public class Breakfast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word1= scan.next();
        if (word1.startsWith("x")){
            System.out.println(word1.replace("x", "a"));
        }else{
            System.out.println(word1);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Please enter a word:");
        String word2 = scan.next().toLowerCase();
        System.out.println(word2.replace("x", "a"));
        System.out.println("---------------------------------------------");

        System.out.println("Please enter first name:");
        String firstName= scan.next();
        System.out.println("Please enter last name:");
        String lastName = scan.next();

        firstName= firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();
        System.out.println(firstName+" "+lastName);


    scan.close();
    }
}
/*1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School*/