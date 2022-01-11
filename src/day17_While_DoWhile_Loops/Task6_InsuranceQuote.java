package day17_While_DoWhile_Loops;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Task6_InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$###,###.00");
        double price = 700.00;
        while (true) {
            System.out.println("Please enter your name:");
            String name = scan.nextLine();
            System.out.println("Please enter your gender: M or F");
            String gender = scan.nextLine().toUpperCase();
            while (!(gender.equals("M") || gender.equals("F") || gender.equals("MALE") || gender.equals("FEMALE"))) {
                System.err.println("Invalid entry, please try again");
                System.out.println("Please enter your gender: M or F");
                gender = scan.nextLine().toUpperCase();
            }
            System.out.println("Enter marital status: (Yes or No)");
            String married = scan.next().toLowerCase();
            while (!(married.equals("yes") || married.equals("no") | married.equals("y") || married.equals("n"))) {
                System.err.println("Invalid entry, please try again");
                System.out.println("Enter marital status:");
                married = scan.next().toLowerCase();
            }
            System.out.println("Please enter age");
            int age = scan.nextInt();
            while (!(age > 0 && age <= 120)) {
                System.err.println("Invalid entry, please try again");
                System.out.println("Please enter age");
                age = scan.nextInt();
            }
            System.out.println("Estimated average number of miles driven per day");
            int miles = scan.nextInt();
            while (!(miles > 5)) {
                System.err.println("Invalid entry, please try again");
                System.out.println("Estimated average number of miles driven per day");
                miles = scan.nextInt();
            }
            scan.nextLine();
            System.out.println("Full coverage or liability only?");
            String coverage = scan.nextLine().toLowerCase();
            while (!(coverage.equals("full") || coverage.equals("liability")||coverage.equals("f")||coverage.equals("l"))) {
                System.err.println("Invalid entry, please try again");
                System.out.println("Full coverage or liability only?");
                coverage = scan.nextLine().toLowerCase();
            }
            System.out.println("How many accidents/claims have you had in the past five years?");
            int accidents = scan.nextInt();
            while (!(accidents >=0 && accidents < 500)) {
                System.err.println("Invalid entry, please try again");
                System.out.println("How many accidents/claims have you had in the past five years?");
                accidents = scan.nextInt();
            }
            System.out.println("Is there an anti-theft device present on vehicle?");
            String antiTheft = scan.next().toLowerCase();
            while (!(antiTheft.equals("yes") || antiTheft.equals("no") || antiTheft.equals("y") || antiTheft.equals("n"))) {
                System.err.println("Invalid entry, please try again");
                System.out.println("Is there an anti-theft device present on vehicle?");
                antiTheft = scan.next().toLowerCase();
            }
            scan.nextLine();
            if (coverage.equals("full")) {
                coverage = "Full Coverage";
                if (age < 25) {
                    price = 160;
                    if (miles <= 10) {
                        price += 20;
                    } else if (miles > 10 && miles < 50) {
                        price += 40;
                    } else {
                        price += 70;
                    }
                } else {
                    coverage = "Liability only";
                    price = 120;
                    if (miles <= 10) {
                        price += 20;
                    } else if (miles > 10 && miles < 50) {
                        price += 40;
                    } else {
                        price += 70;
                    }
                }
            } else {
                if (age < 25) {
                    price = 90;
                    if (miles <= 10) {
                        price += 10;
                    } else if (miles > 10 && miles < 50) {
                        price += 30;
                    } else {
                        price += 50;
                    }
                } else {
                    price = 50;
                    if (miles <= 10) {
                        price += 10;
                    } else if (miles > 10 && miles < 50) {
                        price += 30;
                    } else {
                        price += 50;
                    }
                }
            }
            if (antiTheft.equals("yes")||antiTheft.equals("y")){
                price = (price*.95);
            }
            if (accidents>0) {
                price = price*1.15;
            }else if (accidents==0){
                price = price*.90;
            }
            if (married.equals("yes")||married.equals("y")){
                price -= (price*.05);
            }
            System.out.println("Thank you for getting your quote with us today." +
                    "\nName: "+name+"\tAge: "+age+"\tGender: "+gender+"\tMarital Status: "+married+
                    "\nRequested coverage: "+coverage+" for approx. "+miles+" miles driven per day."+
                    "\nThe total cost of coverage will be "+df.format(price)+"\n");
            System.out.println("Would you like to request another quote?");
            String repeat = scan.nextLine().toLowerCase();
            while (!(repeat.equals("no")||repeat.equals("yes")||repeat.equals("y")||repeat.equals("n"))){
                System.err.println("Invalid entry, please try again");
                System.out.println("Would you like to request another quote?");
                repeat = scan.nextLine().toLowerCase();
            }
            if (repeat.equals("no")||repeat.equals("n")){
                break;
            }
        }
        scan.close();
    }
}
/*		Calculate the price of the insurance and display all the info of the user
			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount


			    6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?
			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)*/