package day15_String;
import java.util.Scanner;
public class Task2_ReturnOddNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <=100; i+=2){
            sum +=i;
            System.out.print(i+" ");
        }
        System.out.println("\n"+sum);
        scan.close();
    }
}
/*2. Write a program that can return the sum of odd numbers between 1 to 100*/