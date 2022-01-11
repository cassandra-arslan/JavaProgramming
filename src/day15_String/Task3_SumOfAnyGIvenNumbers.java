package day15_String;
import java.util.Scanner;
public class Task3_SumOfAnyGIvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter a number:");
        int num = scan.nextInt();
        for (int i = 0; i<=num; i++){
            if (num>0&&num<2147483647){
                sum+=i;
            }else{
                System.err.println("Invalid number");
                System.err.println("Please enter a number:");
                num = scan.nextInt();
            }
        }
        System.out.println(sum);
    }
}
/*3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275*/