package day21_ArraysUtility;

import java.util.Arrays;

public class ArraysUtilityPractice {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};

        int[] nums2 = {5,4,3,2,1};
        System.out.println(Arrays.toString(nums2));
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));
        System.out.print(Arrays.toString(nums));
    }
}
