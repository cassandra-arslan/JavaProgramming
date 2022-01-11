package Methods;
import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {
        plus();
    }
    // Do not touch above
    public static void plus(){
        Scanner scan = new Scanner(System.in);
        //your code here
        System.out.println("enter first number:");
        int num1= scan.nextInt();
        System.out.println("enter second number:");
        int num2= scan.nextInt();
        System.out.print("result: ");
        System.out.println(num1+num2);
    }
}
