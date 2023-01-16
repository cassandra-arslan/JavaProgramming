package day21_ArraysUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        /*int[] arr = {10, 0, 5, 0, 1, 0};
        int[] result = new int[arr.length];

        int j= 0;

        for(int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                result[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));*/

        Integer[] arr ={10, 0, 5, 0, 1, 0};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int count=0;
        for(int i=0; i<list.size(); i++) {
            if (list.get(i) == 0) {
                count++;
            }
            list.removeIf(p -> p == 0);
        }
        for(int i=list.size(); i<arr.length; i++){
            list.add(0);
        }
        System.out.println(list);
    }
}
