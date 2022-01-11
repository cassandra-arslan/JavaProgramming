package day21_ArraysUtility;
import java.util.Arrays;
import java.util.Scanner;
public class DinnerTask2_CountEvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements would you like in your array?:");
        int size = scan.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int[] array = new int[size];
        for (int i= 0; i< array.length; i++){
            System.out.println("Enter your array element:");
            array[i]=scan.nextInt();}
        System.out.println("Your array is: "+ Arrays.toString(array));
        for (int each : array){
            if (each%2==0){
                System.out.println("The element "+each+" is even");
                evenCount++;
            }else{
                System.out.println("The element "+each+" is odd");
                oddCount++;}
        }
        System.out.println("There are a total of "+oddCount+" odd numbers and "+evenCount+" even numbers in the array");
        scan.close();
    }
}
/*2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop*/