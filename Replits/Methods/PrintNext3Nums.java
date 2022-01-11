package Methods;
import java.util.*;
public class PrintNext3Nums {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();
        next3(num);
    }
    // Do not touch above
    public static void next3(int num) {
        System.out.println("next 3 are:");
        for (int i = 1; i <= 3; i++) {
            System.out.print((num + i) + " ");
        }
    }
}
