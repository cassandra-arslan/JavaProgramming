package day13_String;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Task3_Travel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");
        System.out.println("Do you have a valid passport:");
        String passportAnswer = scan.next().toLowerCase();
        double baseTicketPrice=0;
        double addOns1 =0;
        double addOns2 = 0;
        double totalPrice = 0;
        if (passportAnswer.equals("yes") || passportAnswer.equals("no") || passportAnswer.equals("y") || passportAnswer.equals("n")) {
            if (passportAnswer.equals("yes") || passportAnswer.equals("y")) {
                baseTicketPrice = 1000;
                scan.nextLine();
                System.out.println("Which country are you traveling to?:");
                String country = scan.nextLine();
                System.out.println("How many bags will you be bringing?:");
                byte numOfBags = scan.nextByte();
                addOns1 = numOfBags * 50;
                System.out.println("How many people will you be traveling with?:");
                int numOfPeople = scan.nextInt();
                if (numOfPeople > 0 && numOfPeople <= 3) {
                    addOns2 = (-(numOfPeople * 100));
                } else {
                    addOns2 = -300;
                }
                scan.nextLine();
                totalPrice = baseTicketPrice + addOns1 + addOns2;
                System.out.println("Please enter names of travel companions:\nExample: John, Henry, and Sam");
                String names = scan.nextLine();
                System.out.println("Your ticket is booked to " + country + ". The base ticket price is $" + df.format(baseTicketPrice) + ", plus an additional $" + df.format(addOns1) + " for the " + numOfBags + " bags you are bringing. " + "\nWe have included a $" + df.format(addOns2) + " discount for bringing " + names + " with you.\nYour total is $" + df.format(totalPrice) + "\nEnjoy your trip!");
            } else if (passportAnswer.equals("no") || passportAnswer.equals("n")) {
                baseTicketPrice = 1000;
                System.out.println("The base cost of passport renewal is $200");
                addOns1 = 200;
                System.out.println("When did your passport expire?:");
                int expYear = scan.nextInt();
                int currentYear = 2021;
                int howLongExp = currentYear - expYear;
                if (howLongExp > 0) {
                    addOns2 = (howLongExp * 75);
                }
                scan.nextLine();
                int addOns3 = 0;
                System.out.println("Please enter the country you will be traveling to:");
                String country = scan.nextLine();
                System.out.println("Will you be traveling in the next year?:");
                String withinYear = scan.next().toLowerCase();
                if (withinYear.equals("yes") || withinYear.equals("y")) {
                    addOns3 = 100;
                } else {
                    addOns3 = -50;
                }
                int addOns4 = 0;
                int addOns5 = 0;
                System.out.println("How many bags will you be bringing?:");
                byte numOfBags = scan.nextByte();
                addOns4 = numOfBags * 50;

                System.out.println("How many people will you be traveling with?:");
                int numOfPeople = scan.nextInt();
                if (numOfPeople >= 0 && numOfPeople <= 3) {
                    addOns5 = numOfPeople * 100;
                } else {
                    addOns5 = -300;
                }
                scan.nextLine();
                System.out.println("Please enter names of travel companions:\nExample: John, Henry, Sam");
                String names = scan.nextLine();
                totalPrice = baseTicketPrice + addOns1 + addOns2 + addOns3 + addOns4 + addOns5;
                System.out.println("Your passport has been expired for " + howLongExp + " years. We will expedite the renewal for your upcoming trip to " + country + " for $" + df.format((addOns1 + addOns2)) + ". \nWe have included a discount of $" + df.format(addOns5) + " for being accompanied by " + names + ". You are bringing " + numOfBags + " bags and your total cost is $" + df.format(totalPrice) + " after add ons.\nEnjoy your trip!");
            } else {
                System.err.println("Invalid response, please try again");
            }
        } else {
            System.err.println("Invalid response, please try again");
        }
        scan.close();
    }
}

/*
If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."

3. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags, but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."

*/