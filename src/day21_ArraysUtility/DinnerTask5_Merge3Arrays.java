package day21_ArraysUtility;
import java.util.Scanner;
import java.util.Arrays;
public class DinnerTask5_Merge3Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements would you like array 1 to be?:");
        int size = scan.nextInt();
        while (!(size<=20)){
            System.err.println("Invalid entry, too many elements. Try again");
            size = scan.nextInt();}
        int[] arr1 = new int[size];;
        for (int i= 0; i< arr1.length; i++){
            System.out.println("Enter an integer element (0~999):");
            arr1[i]=scan.nextInt();}
        System.out.println("How many elements would you like array 2 to be?:");
        int size2 = scan.nextInt();
        while (!(size2<=20)){
            System.err.println("Invalid entry, too many elements. Try again");
            size2 = scan.nextInt();}
        int[] arr2 = new int[size2];;
        for (int i= 0; i< arr2.length; i++){
            System.out.println("Enter an integer element (0~999):");
            arr2[i]=scan.nextInt();}
        System.out.println("How many elements would you like array 3 to be?:");
        int size3 = scan.nextInt();
        while (!(size3<=20)){
            System.err.println("Invalid entry, too many elements. Try again");
            size3 = scan.nextInt();}
        int[] arr3 = new int[size3];;
        for (int i= 0; i< arr3.length; i++){
            System.out.println("Enter an integer element (0~999):");
            arr3[i]=scan.nextInt();}
        int[]arr4= new int[arr1.length+arr2.length+arr3.length];
        int result =0;
        for(int each : arr1){
            arr4[result] = each;
            result++;}
        for(int each : arr2){
            arr4[result] = each;
            result++;}
        for(int each : arr3){
            arr4[result] = each;
            result++;}
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println("Merging all three arrays results in "+Arrays.toString(arr4));
        scan.close();
    }
}
/* 5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1};

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}*/