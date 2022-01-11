package Methods;
import java.util.*;
public class FindErrorString {
    public static boolean isError(String line) {
        if (line.startsWith("error")){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isError(in.nextLine()));
    }
}
