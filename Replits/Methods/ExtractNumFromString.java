package Methods;
import java.util.*;
public class ExtractNumFromString {
    public static String extractNum(String s) {
    String cleanString = "";
    for(int i=0; i<s.length(); i++) {
        if (Character.isDigit(s.charAt(i))) {
            cleanString += s.charAt(i);
        }
    }
    return cleanString;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }
}
