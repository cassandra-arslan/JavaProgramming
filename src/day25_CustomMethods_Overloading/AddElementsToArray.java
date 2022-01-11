package day25_CustomMethods_Overloading;
import java.util.Arrays;
import util.ArrayUtility;
public class AddElementsToArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        arr = ArrayUtility.addElement(arr, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------------");
        double[]arr2 = {1.5,2.5,3.5,4.5};
        arr2= ArrayUtility.addElement(arr2, 5.5);
        System.out.println(Arrays.toString(arr2));
        System.out.println("----------------------------------------");
        String[] names = {"Tatiana", "Oleksandr", "Cassandra","Ali" };
        names = ArrayUtility.addElement(names, "Neira");
        System.out.println(Arrays.toString(names));
        System.out.println("----------------------------------------");
        char[] chars = {'A','B', 'C', 'D'};
        chars = ArrayUtility.addElement(chars, 'E');
        System.out.println(Arrays.toString(chars));
    }

}
/*    Task2:
        1. create a return method called addInteger that can add an Integer  after the  last index of an integer array

        {1,2,3,4}, 5
        new array ==> {1,2,3,4,5}

        2. create a return method called addDouble that can add a double after the last index of a double array

        3. create a return method called addString that can add a String after the last index of a String array

        4. create a return method called addChar that can add a char after last index of a char array*/