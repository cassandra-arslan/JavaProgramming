package day13_String;
import java.util.Scanner;
public class Task1_Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word or phrase:");
        String word = scan.nextLine();
        String reverse = "";
        for (int i=word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }
        if (word.length()>0){
            System.out.println(reverse);
        }else {
            System.out.println("No word entered");
        }
        scan.close();
    }
}
/*1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.

*/
