package Methods;
import java.util.*;
public class Cover {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverME) {
        // your code here
        if (main.contains(coverME)) {
            return main.replace(coverME, "[" + coverME + "]");
        } else {
            return "[" + main + "]";
        }
    }
}