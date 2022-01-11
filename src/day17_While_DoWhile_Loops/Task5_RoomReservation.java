package day17_While_DoWhile_Loops;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Task5_RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.00");
        while (true) {
            System.out.println("Welcome to le Lapin Blanc hotel, Paris!");
            System.out.println("Would you like to reserve a room?");
            String reserve = scan.nextLine().toLowerCase();
            int price = 0;
            String room = "";
            while (!(reserve.equals("yes") || reserve.equals("y")||reserve.equals("no")||reserve.equals("n"))){
                System.err.println("Invalid entry, please try again");
                System.out.println("Would you like to reserve a room?");
                reserve = scan.nextLine().toLowerCase();
            }
            if (reserve.equals("yes")||reserve.equals("y")){
                System.out.println("Which room would you like to reserve?\nKing ($120, Queen ($100, or Single ($80)");
                room = scan.nextLine().toLowerCase();
                while (!(room.equals("king")||room.equals("k")||room.equals("queen")||room.equals("q")||room.equals("single")||room.equals("s"))){
                    System.err.println("Invalid entry, please try again");
                    System.out.println("Which room would you like to reserve?\nKing ($120, Queen ($100, or Single ($80)");
                    room = scan.nextLine().toLowerCase();
                }
                if (room.equals("king")||room.equals("k")){
                    room = "King";
                    price = 120;
                }else if (room.equals("queen")||room.equals("q")){
                    room = "Queen";
                    price = 100;
                }else{
                    room = "Single";
                    price = 80;
                }
            }else{
                System.out.println("Have a nice day!");
                break;
            }
            System.out.println("You have chosen the "+room +" for a total of $"+df.format(price));
        }
        scan.close();
    }
}
/*5. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)*/