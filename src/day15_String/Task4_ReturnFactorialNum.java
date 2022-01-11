package day15_String;
import java.util.Scanner;
public class Task4_ReturnFactorialNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Please enter any number greater than zero:");
        int num = scan.nextInt();
        for (int i = 1; i<=num&&i>0; i++){
            factorial= factorial*i;
        }
        System.out.println(factorial);
    }
}
/*4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
*/