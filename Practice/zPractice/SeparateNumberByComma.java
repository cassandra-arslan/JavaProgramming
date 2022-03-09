package zPractice;
import java.text.DecimalFormat;
import java.util.*;
public class SeparateNumberByComma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(new DecimalFormat("###,###,###,###").format(num));
    }
}
/*Task 2
Take any three-digit number and print it with  coma in between.
For example, if your number is 321, you need to print it as 3, 2, 1

 */