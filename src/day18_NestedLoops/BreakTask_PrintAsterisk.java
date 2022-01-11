package day18_NestedLoops;
import java.util.Scanner;
public class BreakTask_PrintAsterisk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
