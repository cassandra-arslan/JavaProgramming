package day17_While_DoWhile_Loops;
import java.util.Scanner;
public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any sentence:");
        String str = scan.nextLine();
        System.out.println("Please enter the character you want to find:");
        char ch = scan.next().charAt(0);
        int count = 0;
        int i = 0;
        while (i < str.length()) {
            char eachChar = str.charAt(i);
            i++;
            if (ch == eachChar ){
                count++;
            }
        }
        System.out.println(ch+ " occurs "+count+" times.");
    }
}
