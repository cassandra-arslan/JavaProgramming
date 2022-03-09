package StudyHardGroupTasks;
import java.util.Scanner;

public class OfficeHours_Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many figures of the fibonacci sequence would you like to see?");
        int number = scan.nextInt();
        int num1= 0;
        int num2 = 1;
        int result = 0;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        for (int i= 0; i<number; i++){
            result = num1+num2;
            System.out.print(result+" ");
            num1=num2;
            num2= result;
        }
        scan.close();
    }
}
