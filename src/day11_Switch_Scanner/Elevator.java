package day11_Switch_Scanner;
import java.util.*;
public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter floor number: ");
        int floorNumber = scan.nextInt();
        String result = "";

        if (floorNumber==1||floorNumber==2||floorNumber==3){
            switch (floorNumber) {
                case 1:
                result = "Floor 1 selected\nOptions: Lobby, Verizon, & Starbucks";break;
                case 2:
                result = "Floor 2 selected\nOptions: Cydeo, NASA, & Intelsat";break;
                default:
                result = "Floor 3 selected\nOptions: Lyft, BofA, & Stake House";
            }
        }else {
            result = "Not a valid floor";
        }
        System.out.println(result);
        scan.close();
    }
    }
/*2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed*/