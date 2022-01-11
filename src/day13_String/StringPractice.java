package day13_String;
import java. util.Scanner;
public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any two phrases or numbers:");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        if (str1.length()>str2.length()){
            System.out.println(str1);
        }else if (str2.length()>str1.length()){
            System.out.println(str2);
        }else {
            System.out.println("Both are equal in length");
        }
        scan.close();
    }
}