package Methods;
import java.util.*;
public class MethodOverloading1 {
    // Write your code here
    public static int findMax(int[] arr){
        int max= 0;
        Arrays.sort(arr);
        max=arr[arr.length-1];
        return max;
    }
    public static double findMax(double[] arr2){
        double max= 0;
        Arrays.sort(arr2);
        max= arr2[arr2.length-1];
        return max;
    }
    // DO NOT TOUCH THE MAIN METHOD
        public static void main(String [] args) {
            Scanner in = new Scanner(System.in);
            boolean runInt = in.nextBoolean();
            int size = in.nextInt();
            if(runInt) {
                int [] arr = new int[size];
                for(int i=0; i < arr.length; i++) {
                    arr[i] = in.nextInt();
                }
                System.out.println(findMax(arr));
            } else {
                double [] arr = new double[size];
                for(int i=0; i < arr.length; i++) {
                    arr[i] = in.nextDouble();
                }
                System.out.println(findMax(arr));
            }
        }
}
