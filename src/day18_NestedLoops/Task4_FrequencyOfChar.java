package day18_NestedLoops;
import java.util.Scanner;
public class Task4_FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = "";
        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            char ch = str.charAt(j);
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (each == ch) {
                    count++;
                }
            }
            if (result.contains(ch+"")){
                continue;
            }
            result += ch;
            result+= count;
        }
        System.out.println(result);
        scan.close();
    }
}
/*4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters*/