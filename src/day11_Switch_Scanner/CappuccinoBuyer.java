package day11_Switch_Scanner;
import java.text.DecimalFormat;
import java.util.Scanner;
public class CappuccinoBuyer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Please enter your cappuccino size");
        String size = input.next().toLowerCase();
        double price = 0.00;
        int calories = 0;

        if (size.equals("tall") || size.equals("grande") ||size.equals("venti")) {
            switch (size) {
                case "tall":
                    price = 3.69;
                    calories = 90;
                    break;
                case "grande":
                    price = 3.99;
                    calories = 120;
                    break;
                case "venti":
                    price = 4.29;
                    calories = 150;
            }
            System.out.println("A " + size + " sized cappuccino costs $" + df.format(price) + " and has a total of " + calories + " calories.");
        }else if (size.equals("small")||size.equals("medium")||size.equals("large")){
            switch (size) {
                case "small":
                    size= "tall";
                    price = 3.69;
                    calories = 90;
                    break;
                case "medium":
                    size="grande";
                    price = 3.99;
                    calories = 120;
                    break;
                case "large":
                    size="venti";
                    price = 4.29;
                    calories = 150;
            }
            System.out.println("A " + size + " sized cappuccino costs $" + df.format(price) + " and has a total of " + calories + " calories.");
        }else{
                System.out.println("Not a valid size option");
            }
        input.close();
        }
    }
/*1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:
						tall:
								price is $3.69
								90 calories
						grande:
								price is $3.99;
								120 calories
						venti:
								price is $4.29
								150 calories
			If the size is invalid then the output should be "Invalid Size"
				Solution 2: use if & switch statements mixed*/