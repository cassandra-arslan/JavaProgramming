package day10_MoreIfStatements;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AhmetSalaryCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");

        double afterTaxSalary = 0;
        double beforeSalary = scan.nextDouble();
        char materialStatue = 'i';


        if (beforeSalary >= 130000) {
            afterTaxSalary = beforeSalary - beforeSalary * 0.35;
        } else if (beforeSalary >= 100000) {
            afterTaxSalary = beforeSalary - beforeSalary * 0.30;
        } else if (beforeSalary >= 80000) {
            afterTaxSalary = beforeSalary - beforeSalary * 0.25;
        } else if (beforeSalary >= 70000) {
            afterTaxSalary = beforeSalary - beforeSalary * 0.20;
        } else if (beforeSalary >= 0 && beforeSalary < 70000) {
            afterTaxSalary = beforeSalary;
        } else {
            System.out.println("Invalid Entry");
        }

        System.out.println("Are you married? Y/N");
        String mD = scan.next();
        materialStatue = mD.charAt(0);

        if ((materialStatue == 'Y' || materialStatue == 'y') && beforeSalary >= 70000) {
            afterTaxSalary = afterTaxSalary + afterTaxSalary * 0.05;
        } else if ((materialStatue == 'N' || materialStatue == 'n')) {
        } else {
            System.out.println("Invalid Entry");

        }

        System.out.println("AfterTax Your Salary = $" + new DecimalFormat("0,000.00").format(afterTaxSalary));
        scan.close();
    }
}