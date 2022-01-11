package day25_CustomMethods_Overloading;
import util.ArrayUtility;
public class Test_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        ArrayUtility.printEachElement(arr1);
        System.out.println("------------------------------");
        double[] arr2 = {1.5,2.5,3.5,4.5,5.5};
        ArrayUtility.printEachElement(arr2);
        System.out.println("------------------------------");
        String[] arr3 = {"Apple","Banana","Cherry","Orange"};
        ArrayUtility.printEachElement(arr3);
        System.out.println("------------------------------");
        char[] arr4 = {'A','B','C','D'};
        ArrayUtility.printEachElement(arr4);
        System.out.println("------------------------------");
        int[] n1 = {10,2,3,4,5,6};
        int max1 = ArrayUtility.returnMax(n1);
        System.out.println("max1 = " + max1);
        System.out.println("------------------------------");
        double[] n2 = {2.3,20.5,4.5,6.6,7.8};
        double max2 = ArrayUtility.returnMax(n2);
        System.out.println("max2 = " + max2);
        System.out.println("------------------------------");
        int[] a1 = {1,2,3,4,5,6,7};
        boolean r1 = ArrayUtility.contains(a1, 7);
        System.out.println("r1 = " + r1);


    }


}
