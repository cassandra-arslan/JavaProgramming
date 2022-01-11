package day15_String;
import java.util.Scanner;
public class SumOfMultipleNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (int i= 0; i<101; i++){
            sum+= i;
        }
        System.out.println(sum);

        System.out.println("--------------------------------------------------");

        int total = 0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Please enter a number:");
            total += scan.nextInt();
        }
        System.out.println(total);
        scan.close();
    }
}
