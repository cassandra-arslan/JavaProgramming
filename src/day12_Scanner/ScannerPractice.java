package day12_Scanner;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = scan.nextLine(); //Wooden SpoonEnter

        System.out.println("Enter your Programming Language");
        String language = scan.nextLine(); //Java Programming LanguageEnter

        System.out.println("Enter your age");
        int age = scan.nextInt(); //24 (Enter not read, left in scanner)

        scan.nextLine(); //clears the scanner
        System.out.println("Enter your school name");
        String schoolName = scan.nextLine(); //(Enter is default input because it was left in scanner)
        scan.close();
    }
}
