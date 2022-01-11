package practice;
import java.util.*;

public class PrintingDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double var = Math.random();
        int var1 = (int)var;
        var = var-var1;
        System.out.println(var);
        }
}
/*Task 1
Assign a decimal number to a variable, and print only the number after decimal point on the console.
For example, if your number is 3.5,  the console needs to print .5

 */