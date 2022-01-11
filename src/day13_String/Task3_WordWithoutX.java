package day13_String;
import java.util.Scanner;
public class Task3_WordWithoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = scan.next();

        System.out.println(word.substring(1));
    }
}
/*3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code*/