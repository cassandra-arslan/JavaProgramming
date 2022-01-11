package day25_CustomMethods_Overloading;
import java.util.Arrays;
import util.ArrayUtility;
public class LunchBreak_Task3 {
    public static void main(String[] args) {
        //1. create a method that can merge two integer arrays
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9};
        int[] result = ArrayUtility.mergeArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
        System.out.println("------------------------------------------");
        //2. create a method that can merge two double arrays
        double[] arr3 = {1.5,2.5,3.5,4.5,5.5};
        double[] arr4 = {6,7,8,9};
        double[] result2 = ArrayUtility.mergeArray(arr3, arr4);
        System.out.println(Arrays.toString(result2));
        System.out.println("------------------------------------------");
        //3. create a method that can merge two char arrays
        char[] arr5 = {'A', 'B','C','D'};
        char[] arr6 = {'E','F','G'};
        char[] result3 = ArrayUtility.mergeArray(arr5, arr6);
        System.out.println(Arrays.toString(result3));
        System.out.println("------------------------------------------");
        //4. create a method that can merge two String arrays
        String[] arr7 = {"Apple","Banana","Cherry","Strawberry","Kiwi"};
        String[] arr8 = {"Plum","Peach","Pineapple","Oranges"};
        String[] result4 = ArrayUtility.mergeArray(arr7, arr8);
        System.out.println(Arrays.toString(result4));
    }
}