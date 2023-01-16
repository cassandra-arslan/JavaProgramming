package zPractice;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch  = scan.next().charAt(0);

        for(int i=0; i<9; i++){
            System.out.println(ch+"  "+ch+"  "+ch+"  "+ch+"  "+ch+"  "+ch+"  "+ch);
        }
    }
}
