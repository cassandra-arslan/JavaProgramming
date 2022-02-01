package day08_IfStatements.day09_IfElseStatements;
import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();

        boolean num1IsMax = (num1>num2 && num1>num3);
        boolean num2IsMax = (num2>num1 && num2>num3);
        boolean num3IsMax = !num1IsMax&&!num2IsMax;

        if (num1IsMax){
            System.out.println(num1+" is the maximum number.");
        }else if (num2IsMax){
            System.out.println(num2+" is the maximum number.");
        }else{
            System.out.println(num3+" is the maximum number.");
        }
        scan.close();
    }
}
