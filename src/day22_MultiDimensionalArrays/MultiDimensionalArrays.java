package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        String [] group1= {"John", "Joe", "James"};
        String [] group2= {"John", "Joe", "James"};
        String [] group3= {"John", "Joe", "James"};

        String[][] groups = new String [3][];
        groups[0]= group1;
        groups[1]= group2;
        groups[2]= group3;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("--------------------------------------------------------------------");

        //          index: 0 1 2    0 1 2 3    0 1  2  3  4     0  1  2  3  4  5
        int[][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12}, {13,14,15,16,17,18}};
        //          index:   0          1           2                   3

        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[2][3]);










    }
}
/*
 */