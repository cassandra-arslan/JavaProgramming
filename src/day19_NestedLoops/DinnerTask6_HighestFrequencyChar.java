package day19_NestedLoops;
import java.util.Scanner;
public class DinnerTask6_HighestFrequencyChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any string of text:");
        String str = scan.nextLine();
        String result = "";
        int count =0, max = 0;
        for (int j= 0; j<str.length(); j++) {
            char ch = str.charAt(j);
            count = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (each == ch) {
                    count++;
                }
                if (result.contains(ch + "")) {
                    continue;
                }
                if (count > max) {
                    max = count;
                    result = ch + "";
                }
            }
        }
        System.out.println("Highest frequency char: "+result+"\nOccurs "+max+" times");
        scan.close();
    }
}
/*	6.  Write a program that can find the character that has the highest frequency from a string
*/