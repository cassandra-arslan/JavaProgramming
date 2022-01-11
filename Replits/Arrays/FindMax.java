package Arrays;
import java.util.*;
public class FindMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below.
        Arrays.sort(nums);
        int max= nums[nums.length-1];
        System.out.println(max);
    }
}
