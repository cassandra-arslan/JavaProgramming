package day12_Scanner;
import java.util.Scanner;
import java.text.DecimalFormat;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");
        DecimalFormat df2 = new DecimalFormat("##.00%");
        System.out.println("Please enter the hourly rate:");
        double hourlyRate = scan.nextDouble();
        System.out.println("Please enter the hours per week worked:");
        double hoursPerWeek = scan.nextDouble();
        System.out.println("Please enter the state tax rate:");
        double stateTax = scan.nextDouble()/100;
        System.out.println("Please enter the federal tax rate (:");
        double federalTax = scan.nextDouble()/100;
        double salary = (hourlyRate*hoursPerWeek*52);
        double totalTax= ((stateTax*salary)+(federalTax*salary));
        double netIncome = (salary - totalTax);

        System.out.println("Annual salary is $"+df.format(salary)+". State tax rate is "+df2.format(stateTax)+". Federal tax rate is "+df2.format(federalTax)+".");
        System.out.println("Total tax taken from salary is $"+df.format(totalTax)+" and net income is $"+df.format(netIncome));
        scan.close();
    }
}
/*3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome*/
