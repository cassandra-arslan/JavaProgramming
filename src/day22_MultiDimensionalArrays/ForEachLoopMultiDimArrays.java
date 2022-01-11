package day22_MultiDimensionalArrays;
import java.util.Scanner;
import java.util.Arrays;
public class ForEachLoopMultiDimArrays {
    public static void main(String[] args) {
        //          index: 0 1 2    0 1 2 3    0 1  2  3  4     0  1  2  3  4  5
        int[][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12}, {13,14,15,16,17,18}};
        //          index:   0          1           2                   3

        for (int[] each1DArray : arr2D){
            for (int eachElement : each1DArray){

            }
        }
    }
}
