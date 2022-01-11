package Arrays;
import java.util.*;
public class Printing01 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] arr = new String[5];
            for (int i=0;i<5;i++) {
                arr[i] = input.nextLine();
            }
            //leave above alone!  write your code below.
            //Create another loop for your solution!
        String result = "";
        for(String each: arr){
            result = each.substring(0,3);
            System.out.println(result);
        }
    }
}
