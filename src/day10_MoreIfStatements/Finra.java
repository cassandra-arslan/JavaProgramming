package day10_MoreIfStatements;
import java.util.Scanner;
public class Finra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int finra = scan.nextInt();
        String result = "";

        result = (finra%3==0&&finra%5!=0)?"FIN": (finra%5==0&&finra%3!=0)?"RA": (finra%3==0&&finra%5==0)?"FINRA": "NO FIN, NO RA!";
        System.out.println(result);
        scan.close();
    }
}
/*3. Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
                  output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA*/