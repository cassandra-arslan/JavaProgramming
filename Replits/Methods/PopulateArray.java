package Methods;
import java.util.*;
public class PopulateArray {
    public static int[] populate(int[] r) {
        // your codes here:
        int num = 1;
        int index = 0;
        for(int each: r){
            r[index]=num++;
            index++;
        }
    return r;
    }
    // Do not change
    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));
    }
}
