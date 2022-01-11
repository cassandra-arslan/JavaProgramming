package Arrays;
import java.util.*;
public class Printing02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++) {
            arr[i] = input.nextLine();
        }
        // DO NOT TOUCH ABOVE
        String result = "";
        for(int i=0; i<arr.length-1; i+=2){
            result = arr[i]+", "+arr[i+1];
            System.out.println(result);
        }
    }
}
