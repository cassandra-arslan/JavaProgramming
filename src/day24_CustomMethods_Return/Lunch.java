package day24_CustomMethods_Return;
import java.util.Arrays;
import util.StringUtility;
public class Lunch {
    public static void main(String[] args) {
        String str = "aaabbbbccdeeefgggHhhiii";
        System.out.println(removeDuplicatedChars(str));
        System.out.println("-----------------------------");
        int[] array = {1,2,3,6,87,32,65,199};
        System.out.println(returnMax(array));
        System.out.println("-----------------------------");
        int[] array1 = {2,3,6,87,32,65,1,199};
        System.out.println(returnMin(array1));
        System.out.println("-----------------------------");
        int[] array3 = {1,4,6,7,8,10};
        System.out.println(Arrays.toString(reverseArray(array3)));
        System.out.println("-----------------------------");
        int[] arr4 = {2,4,6,8,10};
        int[] arr5 = {1,3,5,7,9};
        int[] arr6 = mergeArray(arr4, arr5);
        System.out.println(Arrays.toString(arr6));
        System.out.println("-----------------------------");
        Arrays.sort(arr6);
        System.out.println(Arrays.toString(arr6));
    }
    //1. create a method that can remove duplicated characters from a string and returns the new value
    public static String removeDuplicatedChars(String str){
    String result = "";
    result = StringUtility.removeDuplicates(str);
    return result;
    }
    //2. create a method that can return the maximum number from an array of integers
    public static int returnMax(int[]array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    //3. create a method that can return the minimum number from an array of integers
    public static int returnMin(int[]array){
        int min=array[0];
        for(int each: array){
            if(each<min){
                min=each;
            }
        }
        return min;
    }
    //4. create a method that return the reversed array
    public static int[] reverseArray(int[]array) {
        int[] reversed = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversed[i] = array[j];
        }
        return reversed;
    }
    //5. create a method that can merge two arrays and return the new array
    public static int[] mergeArray(int[] array1, int[] array2){
        int size = array1.length+ array2.length;
        int[] result= new int[size];
        int i= 0;
        for (int each : array1){
            result[i++] =each;
        }
        for (int each: array2){
            result[i++]= each;
        }
        return result;
    }
}