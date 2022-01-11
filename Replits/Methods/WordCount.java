package Methods;
import java.util.*;
public class WordCount {
    public static int wordCount(String words) {
        // your code
        String[] arr = words.split(" ");
        return arr.length;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
