package Methods;
import java.util.*;
public class MergeThem {
    public static String mergeStrings(String one, String two) {
        String result = "";
        for(int i=0, j=0; i<one.length()&&j<two.length(); i++, j++){
            result += ""+one.charAt(i)+two.charAt(j);
        }
        if(one.length()>two.length()){
            result+=one.substring(two.length());
        }if(two.length()>one.length()){
            result+=two.substring(one.length());
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }
}
