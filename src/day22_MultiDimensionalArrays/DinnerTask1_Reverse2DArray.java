package day22_MultiDimensionalArrays;
import java.util.Arrays;
public class DinnerTask1_Reverse2DArray {
    public static void main(String[] args) {
        int[][] array2D = {{1,2,3,4}, {5,6,7,8,9,10,11}, {12,13,14,15}};
      reverse2DArray(array2D);
    }
    public static void reverse2DArray(int array2D[][]) {
        int[][]reversed2D= new int [array2D.length][];
        for (int i = 0; i < array2D.length; i++) {
            int[] elements = new int[array2D[i].length];
            for (int j = 0; j < array2D[i].length; j++) {
                elements[(elements.length - 1) - j] = array2D[i][j];
            }
            reversed2D[(array2D.length - 1) - i] = elements;
        }
        System.out.println(Arrays.deepToString(reversed2D));
    }
}
/*1. Write a program that can reverse a two-dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};

*/