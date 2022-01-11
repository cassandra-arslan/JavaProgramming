package day20_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class DinnerTask6_MoveZeroesToEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements would you like your array to be?:");
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i= 0; i< array.length; i++){
            System.out.println("Enter your array element:");
            array[i]=scan.nextInt();}
        int[] zeroesAtEnd = new int[size];
        int count = 0;
        for (int i=0; i< array.length; i++){
            if (array[i]!=0){
                zeroesAtEnd[count]=array[i];
                count++;
            }
        }
        System.out.println("Your selected array is --->"+Arrays.toString(array));
        System.out.println("Your array with zeroes at the end --->"+Arrays.toString(zeroesAtEnd));
        Arrays.sort(array);
        count = 0;
        for (int i=0; i< array.length; i++){
            if (array[i]!=0){
                zeroesAtEnd[count]=array[i];
                count++;
            }
        }
        System.out.println("Your sorted array with zeroes at the end --->"+Arrays.toString(zeroesAtEnd));
        scan.close();
    }
}
/*6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
*/