package Unit2Assessment;
import java.util.Arrays;
public class Q23 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int a = 5;

        nums[2] = a--; //5
        nums[0] = a*2; //4*2=8
        nums[4] = --a+ (a-9); //3+93-90 = -3
        nums[1] = nums[2]; // 5
        nums[3] = nums[a-3]; //nums[0] = 8
        System.out.println(Arrays.toString(nums));
        // {8, 5, 5, 8, -3]
    }
}
