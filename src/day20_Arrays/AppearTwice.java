package day20_Arrays;
import java.util.*;
public class AppearTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] chars = {'A','A','A','B','C','C','D','D','D'};
        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j];
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println();
            }
        }
    }
}
