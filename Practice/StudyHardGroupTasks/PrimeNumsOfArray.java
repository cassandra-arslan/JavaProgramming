package StudyHardGroupTasks;
import java.util.Scanner;
public class PrimeNumsOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements would you like your array to have?");
        int arraySize = scan.nextInt();
        int array[] = new int[arraySize];
        for(int i = 0; i<arraySize; i++){
            System.out.println("Please enter elements:");
            array[i] = scan.nextInt();
       }
        System.out.println("Prime numbers in the array are: " + primeNumsFromArray(array));
    }
    public static String primeNumsFromArray(int[] array){
        boolean isPrime = false;
        String result = "";
        for(int each: array) {
            if(each==2){
                isPrime=true;
            }
            for (int i=2; i<each; i++) {
                if (each%i == 0){
                    isPrime = false;
                    break;
                }else{
                    isPrime = true;
                }
            }
            if(isPrime){
                result+= each+" ";
            }
        }
        return result;
    }
}
