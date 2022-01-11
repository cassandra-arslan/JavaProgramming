package day13_String;
import java.util.Scanner;
public class HulyaReverse {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a string...");
            String s = scan.nextLine().toUpperCase();

            String reverse = "";
            for(int i=s.length()-1; i>=0 ; i--) {
                reverse += s.charAt(i);
            }
            System.out.println(reverse);
        }
    }

