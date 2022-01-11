package Methods;
import java.util.*;
public class PrintUniqueNums1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements would you like in the array?:");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter elements:");
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }
    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE
        int count = 0;
        for (int i = 0, j = 0; i < nums.length && j < nums.length; i++, j++) {
            if (nums[i] == nums[j]) {
                count++;
            }
            if (count == 1) {
                System.out.println(nums[i]);
            }
        }
    }
}

