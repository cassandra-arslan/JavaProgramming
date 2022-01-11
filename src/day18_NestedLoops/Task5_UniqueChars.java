package day18_NestedLoops;
import java.util.Scanner;
public class Task5_UniqueChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any string of text");
        String str = scan.nextLine().toLowerCase();
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
            if (count==1){
                result += ch;
            }
        }
        System.out.println(result);
        scan.close();
    }
}

/*5. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique*/