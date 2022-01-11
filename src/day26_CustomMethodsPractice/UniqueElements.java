package day26_CustomMethodsPractice;
import util.ArrayUtility;
import java.util.Arrays;
public class UniqueElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,1,5,5,6,7,7,2,4,6};
        int[] unique = ArrayUtility.uniqueElements(array);

        System.out.println(Arrays.toString(unique));

        double[] array2 ={1.5,2.5,1.5,3.5,4.5,4.5,5.5,5.5};
        double[] unique2 = ArrayUtility.uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));

        char[] array3 = {'A','B','C','C','A','D'};
        char[] unique3 = ArrayUtility.uniqueElements(array3);
        System.out.println(Arrays.toString(unique3));

    }


    }



