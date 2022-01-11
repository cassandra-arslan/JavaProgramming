package day22_MultiDimensionalArrays;
import java.util.*;
public class IteratingMultidimensionalArrays {
    public static void main(String[] args) {

        // elements index: 0 1 2    0 1 2 3    0 1  2  3  4     0  1  2  3  4  5
        int[][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12}, {13,14,15,16,17,18}};
        //    array index:   0          1           2                   3

        for (int i = 0; i<arr2D.length; i++){ //i = index num of single dimensional arrays
            System.out.println(Arrays.toString(arr2D[i]));
            for (int j = 0; j <arr2D[i].length; j++){ //j = index of elements
                System.out.print(arr2D[i][j]+" ");
            }
        }
    }
}
