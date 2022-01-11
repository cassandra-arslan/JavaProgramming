package day16_ForLoopStringPractice;
import java.util.Scanner;
public class Task4_FrequencyOfWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("Please enter any sentence:");
        String str = scan.nextLine().toLowerCase();
        System.out.println("Enter the word you would like to find:");
        String word = scan.next().toLowerCase();
        int wordLength= word.length();
        for (int i = 0; i<= str.length()-wordLength; i++) {
            if (str.substring(i, i+wordLength).equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}
/*4. write a program that can return the frequency of a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create*/