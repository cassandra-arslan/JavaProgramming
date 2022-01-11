package day20_Arrays;
import java.util.*;
public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbers = new int[10];
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0, j=0; i < numbers.length&& j< numbers.length; i++, j++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();
            if (numbers[i]>max){
                max= numbers[i];
            }else if (numbers[i]<min){
                min= numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Min is: "+min+"\nMax is: "+max );
        scan.close();
    }
}
