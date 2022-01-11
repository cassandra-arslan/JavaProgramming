package day16_ForLoopStringPractice;
import java.util.Scanner;
public class Task2_CharFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string of text and then a single character within that string:");
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);
        int count = 0;
        for (int i= 0; i<=str.length()-1; i++){
            if (str.charAt(i)==ch){
                count+=1;
            }
        }
        System.out.println("The character "+ch+" occurs "+count+" times in the string "+str);
        scan.close();
    }
}
/*2. Write a program that asks user to enter a string and a char, then returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
                */