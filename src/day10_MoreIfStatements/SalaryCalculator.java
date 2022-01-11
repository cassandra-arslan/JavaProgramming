package day10_MoreIfStatements;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");
        System.out.println("Are you married? (Y or N)");
        String str= scan.next();
        char married = str.charAt(0);
        double salary;
        double taxRate;
        double amountOfTax = 0;

        if (married=='Y'||married=='y'){
            System.out.println("Please enter your salary: ");
            salary = scan.nextDouble();
            if (salary>130_000){
                taxRate=.30;
                amountOfTax = (salary*taxRate);
            }else if (salary>=100_000 && salary<130_000){
                taxRate=.25;
                amountOfTax = (salary*taxRate);
            }else if (salary>=80_000&&salary<100_000){
                taxRate=.20;
                amountOfTax = (salary*taxRate);
            }else{
                taxRate=.15;
                amountOfTax = (salary*taxRate);
            }
            double salaryAfterTax = (salary-amountOfTax);
            System.out.println("With a salary of $" + df.format(salary) + ", you will pay $" + df.format(amountOfTax) + " in tax. Your net income will be $" + df.format(salaryAfterTax));
        }else if (married=='N'||married=='n'){
            System.out.println("Please enter your salary: ");
            salary = scan.nextDouble();
            if (salary>130_000){
                taxRate=.35;
                amountOfTax = (salary*taxRate);
            }else if (salary>=100_000 && salary<130_000){
                taxRate=.30;
                amountOfTax = (salary*taxRate);
            }else if (salary>=80_000&&salary<100_000){
                taxRate=.25;
                amountOfTax = (salary*taxRate);
            }else{
                taxRate=.20;
                amountOfTax = (salary*taxRate);
            }
            double salaryAfterTax = (salary-amountOfTax);
            System.out.println("With a salary of $" + df.format(salary) + ", you will pay $" + df.format(amountOfTax) + " in tax. Your net income will be $" + df.format(salaryAfterTax));
        }else{
            System.out.println("\"It's complicated\" is not a valid selection");
        }
        scan.close();
    }
}
/*2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to <130k
                        25% for salary of 80K to <100K
                        20% for salary of <80K

                in addition, if the person is married, he/she will pay 5% less tax*/