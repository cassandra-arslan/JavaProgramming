package day13_String;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Task2_TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df1 = new DecimalFormat("$###.00");
        System.out.println("Split bill?: (Y or N");
        String split = scan.next().toLowerCase();
        double tipPercent = 0.00;
        if (split.equals("y") || split == "yes" || split.equals("n") || split.equals("no")) {
            if (split.equals("y") || split.equals("yes")) {
                System.out.println("Enter the number of people:");
                int numOfPeople = scan.nextInt();
                System.out.println("Enter the check amount:");
                double check = scan.nextDouble();
                System.out.println("How was the service quality?: \n5 - Excellent, 4 - Great, 3 - Good, 2 - Fair, 1 - Poor");
                String serviceQuality = scan.next().toLowerCase();

                if (serviceQuality.equals("excellent")||serviceQuality.equals("5")) {
                    tipPercent = .25;
                } else if (serviceQuality.equals("great")||serviceQuality.equals("4")) {
                    tipPercent = .20;
                } else if (serviceQuality.equals("good")||serviceQuality.equals("3")) {
                    tipPercent = .15;
                } else if (serviceQuality.equals("fair")||serviceQuality.equals("2")) {
                    tipPercent = .10;
                } else if (serviceQuality.equals("poor")||serviceQuality.equals("1")) {
                    tipPercent = .05;
                } else {
                    System.err.println("Not a valid selection, try again");
                    System.err.println("How was the service quality?: \n5 - Excellent, 4 - Great, 3 - Good, 2 - Fair, 1 - Poor");
                    serviceQuality = scan.next().toLowerCase();
                }
                double totalTip= (check*tipPercent);
                double checkTotal= (check+totalTip);
                double totalPerPerson = (checkTotal/numOfPeople);
                System.out.println("Check Amount: "+df1.format(check)+"\nTotal tip: "+df1.format(totalTip)+"\nTotal check: "+df1.format(checkTotal)+"\nNumber of people: "+numOfPeople+"\nTotal per person: "+df1.format(totalPerPerson));
            } else {
                System.out.println("Enter the check amount:");
                double check = scan.nextDouble();
                System.out.println("How was the service quality?: \n5 - Excellent, 4 - Great, 3 - Good, 2 - Fair, 1 - Poor");
                String serviceQuality = scan.next().toLowerCase();
                if (serviceQuality.equals("excellent")||serviceQuality.equals("5")) {
                    tipPercent = .25;
                } else if (serviceQuality.equals("great")||serviceQuality.equals("4")) {
                    tipPercent = .20;
                } else if (serviceQuality.equals("good")||serviceQuality.equals("3")) {
                    tipPercent = .15;
                } else if (serviceQuality.equals("fair")||serviceQuality.equals("2")) {
                    tipPercent = .10;
                } else if (serviceQuality.equals("poor")||serviceQuality.equals("1")) {
                    tipPercent = .05;
                } else {
                    System.err.println("Not a valid selection, try again");
                    System.err.println("How was the service quality?: \n5 - Excellent, 4 - Great, 3 - Good, 2 - Fair, 1 - Poor");
                    serviceQuality = scan.next().toLowerCase();
                }
                double totalTip= (check*tipPercent);
                double checkTotal= (check+totalTip);
                System.out.println("Check Amount: "+df1.format(check)+"\nTotal tip: "+df1.format(totalTip)+"\nTotal check: "+df1.format(checkTotal));
            }
        } else {
            System.err.println("Invalid selection, please try again");
        }
    }
}
/*2. Create a class called TipCalculator, write a program for a tip calculator. There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
	The program should display the following information based on the user input:
	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method*/