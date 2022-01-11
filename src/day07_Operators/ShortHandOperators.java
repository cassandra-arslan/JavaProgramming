package day07_Operators;

import java.text.DecimalFormat;

public class ShortHandOperators {

    public static void main(String[] args) {
        double availableBalance = (Math.random()*1500);
        System.out.println("Available Funds: $"+new DecimalFormat("0.00").format(availableBalance));
        System.out.println("---------------------------");
        availableBalance += 1_500.87;
        System.out.println("New Balance: $"+new DecimalFormat("0.00").format(availableBalance));
    }
}
