package Methods;
import java.util.*;
public class AtThirdChar {
    public static String at3(String target,String word){
        return target.substring(0,3)+word+target.substring(3);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));
    }
}
