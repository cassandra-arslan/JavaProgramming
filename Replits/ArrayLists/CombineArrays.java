package ArrayLists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class CombineArrays {
    public static ArrayList<String> combineArrays(String[] r1,String[] r2){
        ArrayList<String> list2 = new ArrayList<>();
        // your code here
        list2.addAll(Arrays.asList(r1));
        list2.addAll(Arrays.asList(r2));
        return list2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combineArrays(strs,strs2));

    }
}
