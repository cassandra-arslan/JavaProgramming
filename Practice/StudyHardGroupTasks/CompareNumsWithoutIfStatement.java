package StudyHardGroupTasks;
import java.util.Scanner;
public class CompareNumsWithoutIfStatement {
//    Compare 2 numbers without using if statement.
//      eg: a=10; b=5; ---> a is bigger.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int a = scan.nextInt(), b=scan.nextInt();
        // Using Max.max method
//        int max = Math.max(a,b);
//        System.out.println(max+" is larger");
        //int max = a>b?a:b;  - using ternary
        System.out.println(a > b ? a+" is bigger" : b+" is bigger"); //using ternary with print statement
        //System.out.println(a>b?a:b); - putting ternary directly into print statement
    }
}
