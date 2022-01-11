package day21_ArraysUtility;
import java.util.Arrays;
import java.util.Scanner;
public class DinnerTask3_PrintCommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements would you like in your array?");
        int size = scan.nextInt();
        int[] arr1= new int[size];
        for (int i= 0; i< arr1.length; i++){
            System.out.println("Enter your array1 element:");
            arr1[i]=scan.nextInt();}
        int[] arr2= new int[size];
        for (int i= 0; i< arr2.length; i++){
            System.out.println("Enter your array2 element:");
            arr2[i]=scan.nextInt();}
        String result = "";
        for (int each :arr1){
            for(int each2:arr2){
                if(each==each2){
                    result+=each+" ";}
            }
        }
        System.out.println("Common elements of "+ Arrays.toString(arr1)+" and "+Arrays.toString(arr2)+" are "+result);
        scan.close();
    }
}

/*3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
          MUST use for each loops
*/