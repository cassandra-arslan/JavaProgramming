package day12_Scanner;
import java.util.Scanner;
import java.text.DecimalFormat;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println("Please enter total cents to be converted to dollars: ");
        long input = scan.nextLong();
        int dollars = (int)(input/100);
        int cents = (int)input%100;

        System.out.print(input+" cents equals $"+df.format(dollars)+" dollars and "+cents+" cents.");
        scan.close();
    }
}
/*3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents*/