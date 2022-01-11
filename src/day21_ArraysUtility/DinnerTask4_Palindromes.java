package day21_ArraysUtility;
import java.util.Scanner;
import java.util.Arrays;
public class DinnerTask4_Palindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements would you like in your array?");
        int size = scan.nextInt();
        String[] word = new String[size];
        int count = 0;
        scan.nextLine();
        for (int i = 0; i < word.length; i++) {
            System.out.println("Enter name element:");
            word[i] = scan.nextLine();}
        for (String eachWord : word) {
            String result = "";
            for (int i = eachWord.length() - 1; i >= 0; i--) {
                result += eachWord.charAt(i);
                if (result.equals(eachWord)) {
                    count++;}
            }
        }
        System.out.println("The array "+Arrays.toString(word)+" contains "+count+" palindromes");
        scan.close();
    }
}

/*4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2*/