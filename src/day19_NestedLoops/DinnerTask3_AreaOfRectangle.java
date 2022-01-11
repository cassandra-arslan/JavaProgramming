package day19_NestedLoops;
import java.util.Scanner;
public class DinnerTask3_AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the length of the rectangle:");
            double length = scan.nextDouble();
            while (length<=0){
                System.err.println("Invalid entry, please try again");
                System.out.println("Please enter the length of the rectangle:");
                length = scan.nextDouble();
            }
            System.out.println("Please enter the width of the rectangle:");
            double width = scan.nextDouble();
            while (width<=0){
                System.err.println("Invalid entry, please try again");
                System.out.println("Please enter the width of the rectangle:");
                width = scan.nextDouble();
            }
            double perimeter =2*length+2*width;
            double area = length*width;
            System.out.println("Perimeter: "+perimeter+"\nArea: "+area);
            System.out.println("Would you like to calculate another rectangle?");
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

/*3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task*/