package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int [] arr3 = {7,8,9};

        //element index:  0 1 2   0 1 2   0 1 2
        int[][] arr2D = {{1,2,3},{4,5,6},{7,8,9}}; //{arr1,arr2,arr3};

        //  element index:  0  1  2    0  1  2    0  1  2
        int[][] arr2D2 = {{10,20,30},{40,50,60},{70,80,90}};

        //  element index:   0   1   2    0   1   2     0   1   2
        int[][] arr2D3 = {{100,200,300},{400,500,600},{700,800,900}};
        //  array index:        0             1             2


        int[][][] arr3D = {arr2D, arr2D2, arr2D3};
        int[][][] arr3D2 = {arr2D, arr2D2, arr2D3};
        int[][][] arr3D3 = {arr2D, arr2D2, arr2D3};
        // [index of 2DArray][index of 1DArray][index of element]

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(arr3D[0][2][2]);

        for (int[][] each2D : arr3D){
            for(int[] each1D : each2D){
                for (int element : each1D){
                    System.out.print(element+" ");
                }
            }
        }
        System.out.println("----------------------------------------------------");
        int[][][][] arr4D = {arr3D, arr3D2, arr3D3};
    }
}
