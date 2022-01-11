package day19_NestedLoops;
import java.util.*;
public class AreaAndPerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Please enter the length of the side of a square:");
            int side= scan.nextInt();
            int area = side*side;
            int perimeter = side*4;
            while (!(side>0)){
                System.err.println("Invalid entry, please try again");
                System.out.println("Please enter the length of the side of a square:");
                side= scan.nextInt();
            }
            System.out.println("Perimeter: "+perimeter+"\nArea: "+area);
            System.out.println("Would you like to calculate another square? (Y or N)");
            char a = scan.next().charAt(0);
            while (!(a=='y'||a=='Y'||a=='n'||a=='N')){
                System.err.println("Invalid entry, please try again");
                System.out.println("Would you like to calculate another square? (Y or N)");
                a = scan.next().charAt(0);
            }
            if (a=='N'||a=='n'){
                break;
            }
        }
        scan.close();
    }
}
/*2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Enes Uzun knows all the formulas you need for this task*/