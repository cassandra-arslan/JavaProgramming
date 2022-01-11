package day20_Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysContinued {
    public static void main(String[] args) {
        String []days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));
        int number =5;

        if (number<1||number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);
    }
}
