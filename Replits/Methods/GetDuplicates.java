package Methods;
import java.util.*;
public class GetDuplicates {
    public static int getDup(String[] r) {
        int dups = 0;
        for (String each : r) {
            int count = 0;
            for (String each2 : r) {
                if (each.equalsIgnoreCase(each2)) {
                    count++;
                }
                }
            if(count>=2){
                dups++;
            }
        }
        return dups;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        System.out.println(getDup(strs));
    }
}
