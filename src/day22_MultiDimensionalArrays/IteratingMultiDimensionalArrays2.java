package day22_MultiDimensionalArrays;
import java.util.Arrays;
import util.ArrayUtility;
public class IteratingMultiDimensionalArrays2 {
    public static void main(String[] args) {

        //          index: 0 1 2    0 1 2 3    0 1  2  3  4     0  1  2  3  4  5
        String[][] arr2D = {{"1", "2", "3"}, {"4", "5", "6", "7"}, {"8", "9", "10", "11", "12"}, {"13", "14", "15", "16", "17", "18"}};
        //          index:   0          1           2                   3"

        ArrayUtility.reverse1DOrder(arr2D);
        System.out.println("--------------------------------------");
        ArrayUtility.reverse1DElements(arr2D);
        System.out.println("--------------------------------------");
        ArrayUtility.reverse2DArray(arr2D);

    }

}
