package day27_WrapperClass;
import java.util.Arrays;
import util.ArrayUtility;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,3,3,3,3,4,4,4,4,4,4,2,4,5};
        arr= removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------------");
        String[] words = {"Java","Java","Python","C#","Java","Java"};
        words = removeDuplicates(words);
        System.out.println(Arrays.toString(words));
    }

    //Remove duplicated elements from integer array
    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int each: array){
            if (!ArrayUtility.contains(result, each)){
                result = ArrayUtility.addElement(result, each);

            }
        }
        return result;
    }
    //Remove duplicated elements from String array
    public static String[] removeDuplicates(String[] array){
        String[] result = {};
        for (String each: array){
            if (!ArrayUtility.contains(result, each)){
                result = ArrayUtility.addElement(result, each);

            }
        }
        return result;
    }
    //Remove duplicated elements from double array
    public static double[] removeDuplicates(double[] array){
        double[] result = {};
        for (double each: array){
            if (!ArrayUtility.contains(result, each)){
                result = ArrayUtility.addElement(result, each);

            }
        }
        return result;
    }
    //Remove duplicated elements from char array
    public static char[] removeDuplicates(char[] array){
        char[] result = {};
        for (char each: array){
            if (!ArrayUtility.contains(result, each)){
                result = ArrayUtility.addElement(result, each);

            }
        }
        return result;
    }
}
