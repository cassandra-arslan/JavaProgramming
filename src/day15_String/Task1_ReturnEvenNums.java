package day15_String;
import java.util.Scanner;
public class Task1_ReturnEvenNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <=100; i++){
            if (i%2==0){
                sum+= i;
                System.out.print(i+" ");
            }
        }
        System.out.print("\n"+sum);
        scan.close();
    }
}
/*1. Write a program that can return the sum of even numbers between 1 to 100*/