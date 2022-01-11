package day19_NestedLoops;
import java.util.Scanner;
import java.text.DecimalFormat;
public class DinnerTask5_SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$###,###.00");
        while (true) {
            System.out.println("What is your hourly rate of pay?");
            double hourlyRate = scan.nextDouble();
            if (hourlyRate<=0) {
                System.err.println("Invalid Entry for hourly rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week");
            int weeklyHour = scan.nextInt();
            if ((weeklyHour < 1 && weeklyHour > 144)) {
                System.err.println("Invalid entry for weekly hours");
                System.exit(0);
            }
            System.out.println("Enter your state tax rate");
            double stateTaxRate = scan.nextDouble();
            if (stateTaxRate < 0 && stateTaxRate > 10) {
                System.err.println("Invalid entry for tax rate");
                System.exit(0);
            }
            double federalTax = 26;
            double salary = hourlyRate * weeklyHour * 52;
            federalTax = salary * (federalTax / 100);
            double stateTax = salary * (stateTaxRate / 100);
            System.out.println("Gross Salary: " + df.format(salary));
            System.out.println("Federal Tax : " + df.format(federalTax));
            System.out.println("State Tax : " + df.format(stateTax));
            System.out.println("Total Tax: " + df.format(federalTax + stateTax));
            System.out.println("Net Income: " + df.format(salary - (federalTax + stateTax)));
            System.out.println("Would you like to continue");
            String a = scan.next().toLowerCase();
            while (!(a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("no")||a.equals("y")||a.equals("n"))) {
                System.err.println("Invalid Entry!");
                System.exit(0);
            }
            if (a.equalsIgnoreCase("yes")) {
                continue;
            } else {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }
        }
        scan.close();
    }
}
/*5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


			Hint: Ones Uzun knows all the formulas you need for this task

*/