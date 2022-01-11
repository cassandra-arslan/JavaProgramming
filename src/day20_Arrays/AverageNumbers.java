package day20_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbers = new int [10];
        double sum = 0;
        for (int i = 0; i<numbers.length; i++){
            numbers[i]= scan.nextInt();
            sum += numbers[i];
        }
        double averageNumber = sum/numbers.length;
        System.out.println("Average Number: "+averageNumber);
    }
}
