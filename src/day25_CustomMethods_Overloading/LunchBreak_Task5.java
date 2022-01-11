package day25_CustomMethods_Overloading;
import util.ArrayUtility;
public class LunchBreak_Task5 {
    public static void main(String[] args) {
        //1. create a method that can return the min number from an integer array
        int[]array1 = {23,45,67,1,98,34};
        System.out.println(ArrayUtility.returnMin(array1));
        System.out.println("----------------------------------");
        //2. create a method that can return the min number from double array
        double[]array2 = {23.5,85.7,76.3,1.1,13.2,34.5};
        System.out.println(ArrayUtility.returnMin(array2));
        System.out.println("----------------------------------");
        //3. create a method that can return the min number from long array
        long[]array3 = {23000,785168468,67651468,1,168787,3484384};
        System.out.println(ArrayUtility.returnMin(array3));
        System.out.println("----------------------------------");
        //4. create a method that can return the min number from short array
        short[]array4 = {23000,7868,668,1,1607,3484};
        System.out.println(ArrayUtility.returnMin(array4));
        System.out.println("----------------------------------");
        //5. create a method that can return the min number from float array
        float[]array5 = {1.32f,785168.45f,676514.61f,1.648f,168787.94f,34843.53f};
        System.out.println(ArrayUtility.returnMin(array5));
        System.out.println("----------------------------------");
        //6. create a method that can return the min number from byte array
        byte[]array6 = {127,111,-126,11,-59,34};
        System.out.println(ArrayUtility.returnMin(array6));
        System.out.println("----------------------------------");
    }
}
