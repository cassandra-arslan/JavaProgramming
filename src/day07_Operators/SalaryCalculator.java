package day07_Operators;
import java.text.DecimalFormat;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hourlyRate = sc.nextDouble();

        double weeklyHours = sc.nextDouble();
        if (weeklyHours > 40){
            hourlyRate = hourlyRate*1.5;
        }
        double salaryBeforeTax = (hourlyRate * weeklyHours *52);
        double stateTax = salaryBeforeTax*.093;
        double federalTax = salaryBeforeTax*.24;
        double totalTax = stateTax+federalTax;
        double salaryAfterTax = salaryBeforeTax-totalTax;

        System.out.println("Gross pay is: $"+new DecimalFormat("###,###.00").format(salaryBeforeTax));
        System.out.println("Federal tax is: $"+new DecimalFormat("###,###.00").format(federalTax));
        System.out.println("State tax is: $"+new DecimalFormat("###,###.00").format(stateTax));
        System.out.println("Total tax is: $"+new DecimalFormat("###,###.00").format(totalTax));
        System.out.println("Net income is: $"+new DecimalFormat("###,###.00").format(salaryAfterTax));
        sc.close();
    }
}
/*          3. Create a class called SalaryCalculator.java
			3.1 declare the following variables: hourlyRate, weeklyHours, stateTax, federalTax
			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax 2. stateTax 3. federalTax
					4. totalTax 5. salaryAfterTax
					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
			3.3 use print statement to print each of the above
				Ex: hourlyRate = $50
					weeklyHours = 45
					stateTax = 6 (given as percentage, you need to convert to decimal)
					federalTax = 26 (given as percentage, you need to convert to decimal)
				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560

 */