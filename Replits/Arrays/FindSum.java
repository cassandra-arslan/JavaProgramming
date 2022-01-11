package Arrays;
import java.util.*;
public class FindSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below
        int sum= 0;
        for(int each: nums){
            sum+=each;
        }
        System.out.println(sum);
    }
}
