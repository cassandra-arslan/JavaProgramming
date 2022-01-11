package day25_CustomMethods_Overloading;
import util.ArrayUtility;
import java.util.Arrays;
public class LunchBreak_Task6 {
    public static void main(String[] args) {
        //1. Create a method that can reverse an integer array
        int[] array = {1,2,4,6,7,99};
        System.out.println(Arrays.toString(ArrayUtility.reverseArray(array)));
        System.out.println("--------------------------------------");
        //2. Create a method that can reverse a double array
        double[] array2 = {1.1,2.5,4.3,6.7,7.6,99.4};
        System.out.println(Arrays.toString(ArrayUtility.reverseArray(array2)));
        System.out.println("--------------------------------------");
        //3. Create a method that can reverse a char array
        char[] array3 = {'A','&','%','#','9','T'};
        System.out.println(Arrays.toString(ArrayUtility.reverseArray(array3)));
        System.out.println("--------------------------------------");
        //4. Create a method that can reverse a String array
        String[] array4 = {"Enes","Cassandra","Alp","Yusuf","Hamza","Ahmet"};
        System.out.println(Arrays.toString(ArrayUtility.reverseArray(array4)));
        System.out.println("--------------------------------------");
    }
}
