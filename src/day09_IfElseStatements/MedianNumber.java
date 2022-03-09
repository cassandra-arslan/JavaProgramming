package day09_IfElseStatements;
import java.util.Scanner;
public class MedianNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b= scan.nextInt(), c= scan.nextInt();
        if ((a>b&&a<c)||(a>c&&a<b)){
            System.out.println(a+" is the median number.");
        }else if ((b>a&&b<c)||(b<a&&b>c)){
            System.out.println(b+" is the median number.");
        }else if ((c>a&&c<b)||(c<a&&c>b)){
            System.out.println(c+" is the median number");
        }
        scan.close();
    }

}

/*2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number*/
