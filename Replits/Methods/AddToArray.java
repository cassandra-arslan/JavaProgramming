package Methods;
import java.util.*;
public class AddToArray {
    // your codes here
    public static void add_to_r(int[] r,int n) {
        //create new array with one more position:
        int[] result = new int[r.length+1];
        int i = 0;
        for (int each : r){
            result[i++]=each;
        }
        result[i] = n;
        System.out.println(Arrays.toString(result));
    }
    // Do not change those lines
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }
        add_to_r(arr, n);
    }
}
