package Arrays;
import java.util.*;
public class Has55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        //TODO Type your code below:
        boolean has55= false;
        for (int i=0; i<nums.length-1; i++){
            if(nums[i]==5&&nums[i+1]==5){
                has55= true;
            }
        }
        System.out.println(has55);
    }
}
