package day11_Switch_Scanner;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");
        System.out.println("Please enter your annual salary: ");
        double salary = input.nextDouble();
        System.out.println("Please enter your estimated credit score");
        int creditScore = input.nextInt();
        String result = "";

        result = (salary>=60_000&&creditScore>=650)?"Loan Approved":(salary<60_000&&creditScore>=650)?"Salary is not sufficient":(salary>=60_000&&creditScore<650)?"Co-Signor needed":"Loan Denied";
    System.out.println(result);
    }
}
/*6. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.*/
