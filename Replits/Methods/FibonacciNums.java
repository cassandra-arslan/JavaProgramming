package Methods;
import java.util.*;
public class FibonacciNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }
    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int num1= 0;
        int num2 = 1;
        int result = 0;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        for (int i= 0; i<num; i++){
            result = num1+num2;
            System.out.print(result+" ");
            num1=num2;
            num2= result;
        }
    }
}
