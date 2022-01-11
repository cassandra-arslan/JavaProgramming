package day13_String;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = "Cydeo";
            //index:   01234
        char thirdChar = word.charAt(2);
        System.out.println(thirdChar);

        String s1 = "Batch 25 is the best batch. Java Programming";
        System.out.println(s1.length());
        char lastChar = (s1.charAt(s1.length()-1));

        scan.close();
    }
}
