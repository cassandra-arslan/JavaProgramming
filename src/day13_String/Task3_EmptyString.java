package day13_String;
import java.util.Scanner;
public class Task3_EmptyString {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter any phrase or number: ");
        String str1 = scan.nextLine().toUpperCase();

        if (str1.length()==0){
            System.out.println("String is empty");
        }else if (str1.length()<=3){
            System.out.println(str1);
        }else{
            System.out.println(""+(str1.charAt(str1.length()-1))+(str1.charAt(str1.length()-2))+(str1.charAt(str1.length()-3)));
        }
        scan.close();
    }
}
/* 3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself*/