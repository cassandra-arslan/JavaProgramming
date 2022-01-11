package day16_ForLoopStringPractice;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any string of text:");
        String str = scan.nextLine();
        String result = "";
        for (int i = str.length()-1;i>=0; i--){
            result+= str.charAt(i);
        }
        System.out.println(result);
        scan.close();
    }
}
