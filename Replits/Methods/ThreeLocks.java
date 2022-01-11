package Methods;
import java.util.*;
public class ThreeLocks {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        return a&&b||c;
    }//end threeLocks
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));
    }
}
