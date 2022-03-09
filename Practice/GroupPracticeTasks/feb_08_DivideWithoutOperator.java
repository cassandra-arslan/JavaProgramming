package GroupPracticeTasks;
import java.util.Scanner;

public class feb_08_DivideWithoutOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any two numbers");
        System.out.println("Num 1: ");
        int num1 = scan.nextInt();
        System.out.println("Num 2: ");
        int num2 = scan.nextInt();
        System.out.println(divideWithoutOperator(num1, num2));
    }

    public static String divideWithoutOperator(int num1, int num2){
        int count = 0;
        while(num1>=num2){
            num1-=num2;
            count++;
        }
        if (num1 !=0){
            return count +" with remainder of "+num1;
        }else{
            return count+" ";
        }
    }
}
