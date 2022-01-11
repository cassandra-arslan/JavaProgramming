package day12_Scanner;
import java.util.Scanner;
public class Miles2Km {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles to be converted to kilometers:");
        double miles = scan.nextDouble();
        double kilometers = miles*1.60934;

        System.out.println(miles+ " miles are equal to "+kilometers+" kilometers.");
        scan.close();
    }
}
/*4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers*/