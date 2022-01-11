package day22_MultiDimensionalArrays;
public class LunchTask2_CountTotalOddEven {
    public static void main(String[] args) {
        //          index: 0 1  2    0  1  2  3    0  1   2   3   4     0   1   2   3   4   5
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}, {13, 14, 14, 16, 17, 18}};
        //          index:   0            1               2                    3

        int oddCount = 0;
        int evenCount = 0;
        for (int[] each1D : arr2D){
            for(int each : each1D){
                if(each%2==0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
        }
        System.out.println("evenCount = " + evenCount);
        System.out.println("oddCount = " + oddCount);
    }
}
/*2. Write a program that can count the total odd and even numbers from a two-dimensional array*/