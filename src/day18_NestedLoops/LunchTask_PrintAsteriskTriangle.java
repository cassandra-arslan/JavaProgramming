package day18_NestedLoops;
import java.util.Scanner;
public class LunchTask_PrintAsteriskTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any character:");
        char ch = scan.next().charAt(0);
        String str = ch+" ";
        for (int i = 0; i<10; i++){
            System.out.println(str);
            for (int j = 0; j<1; j++){
                str += ch+" ";
            }
        }
        scan.close();
    }
}
