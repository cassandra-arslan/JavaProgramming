package day21_ArraysUtility;
import java.util.Arrays;
import java.util.Scanner;
public class DinnerTask1_ReverseSortArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements would you like in your array?:");
        int size = scan.nextInt();
        while (!(size<=20)){
            System.err.println("Invalid entry, too many elements. Try again");
            size = scan.nextInt();}
        int[] array = new int[size];
        int[] reversed = new int[size];
        for (int i= 0; i< array.length; i++){
            System.out.println("Enter an integer element (0~999):");
            array[i]=scan.nextInt();}
        System.out.println("Your array is: "+Arrays.toString(array));
        Arrays.sort(array);
        for (int i = 0, j= array.length - 1; i <array.length; i++, j--) {
            reversed[i] = array[j];}
        System.out.println("Your array reverse is: "+Arrays.toString(reversed));
        scan.close();
    }
}
/*1. Write a program that sort the array of integer in descending order
*/