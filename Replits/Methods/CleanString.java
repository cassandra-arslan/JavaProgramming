package Methods;
import java.util.*;
public class CleanString {
    public static String clean (String text , String badWord) {
        return text.replace(" "+badWord, "");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }
}
