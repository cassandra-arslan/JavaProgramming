package day22_MultiDimensionalArrays;
public class LunchTask1_MinMax2DArray {
    public static void main(String[] args) {
        //          index: 0 1  2    0  1  2  3    0  1   2   3   4     0   1   2   3   4   5
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        //          index:   0            1               2                    3
        int min = arr2D[0][0];
        int max = 0;
        for (int[] each1D: arr2D){
            for(int each : each1D){
                if (each>max){
                    max=each;
                }
                if (each<min){
                    min=each;
                }
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
/*1. Write a program that can find the minimum and maximum numbers from a two-dimensional array*/