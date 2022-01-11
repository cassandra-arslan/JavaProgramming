package Methods;
import java.util.*;
public class LimitString {
    public static String limit(String text, int maxLength){
        // your code
        String result ="";
    for(int i= 0; i<maxLength; i++){
        result+=text.charAt(i);
    }
    return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(limit(in.nextLine(), in.nextInt()));
    }
}
