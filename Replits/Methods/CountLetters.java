package Methods;
import java.util.*;
public class CountLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }
    public static String countLetters(String str) {
        String result = "";
        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            if (!result.contains(str.charAt(j) + "")) {
                result += "" + count + str.charAt(j);
            }
        }
        return result;
    }
}
