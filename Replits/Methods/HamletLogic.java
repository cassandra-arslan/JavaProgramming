package Methods;
import java.util.*;
public class HamletLogic {
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        // your code here
        return toBe || notToBe;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }
}
