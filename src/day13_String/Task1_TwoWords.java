package day13_String;
import java.util.Scanner;
public class Task1_TwoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two words:");
        String word1 = scan.next();
        String word2 = scan.next();
         String result1= word1.substring(1);
         String result2= word2.substring(1);
         System.out.println(result1+result2);
         scan.close();
    }
}
/*1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana*/