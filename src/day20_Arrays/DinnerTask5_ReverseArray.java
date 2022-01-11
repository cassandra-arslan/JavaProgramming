package day20_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class DinnerTask5_ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements would you like in your array?:");
        int size = scan.nextInt();
        int[] array = new int[size];
        int[] reversed = new int[size];
        for (int i= 0; i< array.length; i++){
            System.out.println("Enter your array element:");
            array[i]=scan.nextInt();}
        System.out.println("Your array is "+Arrays.toString(array));
        for (int i = 0, j= array.length - 1; i <array.length; i++, j--) {
            reversed[i] = array[j];
        }
        System.out.println("Your array reverse is: "+Arrays.toString(reversed));
    }
}
/*5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};*/