package Arrays;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        //TODO: write your code below
        int[]reversed = new int[nums.length];
        int temp= 0;
        int length= nums.length-1;
        for(int i=0; i<nums.length/2;i++) {
            temp = nums[i];
            nums[i] = nums[length];
            nums[length] = temp;
            length--;
            reversed[i]+= nums[i];
        }
        //Do not change below statement:
        System.out.println(Arrays.toString(reversed));
    }
}
