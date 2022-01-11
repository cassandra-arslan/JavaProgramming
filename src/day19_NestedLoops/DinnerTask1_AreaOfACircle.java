package day19_NestedLoops;
import java.util.*;
public class DinnerTask1_AreaOfACircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the radius of the circle:");
            double radius = scan.nextDouble();
            while (radius<=0){
                System.err.println("Invalid entry, please try again");
                System.out.println("Please enter the radius of the circle:");
                radius = scan.nextDouble();
            }
            double diameter = 2*radius;
            double perimeter = 2*radius*3.14;
            double area = 3.14*(radius*radius);
            while (!(radius > 0)) {
                System.err.println("Invalid entry!");
                System.exit(0);
            }
            System.out.println("Diameter: "+diameter+"\nPerimeter: "+perimeter+"\nArea: "+area);
            System.out.println("Would you like to calculate another circle?");
            char a = scan.next().charAt(0);
            while (!(a=='y'||a=='Y'||a=='N'||a=='n')){
                System.err.println("Invalid Entry, please try again");
                System.out.println("Would you like to calculate another circle?");
                a = scan.next().charAt(0);
            }
            if (a=='n'||a=='N'){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }
        }
        scan.close();
    }
}
/*1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task*/