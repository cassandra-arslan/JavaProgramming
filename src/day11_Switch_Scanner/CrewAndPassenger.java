package day11_Switch_Scanner;
import java.util.Scanner;
public class CrewAndPassenger {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int numOfPeople = input.nextInt();
        int crew = 0;
        int passengers = 0;

        if (numOfPeople==50||numOfPeople==75||numOfPeople==100){
            switch (numOfPeople){
                case 50:
                    crew = 20;
                    passengers= 30;
                    break;
                case 75:
                    crew =25;
                    passengers= 50;
                    break;
                case 100:
                    crew= 30;
                    passengers= 70;
                    break;
            }
            System.out.println("When there are "+numOfPeople+ " souls aboard, then there are always "+crew+" crew members and "+passengers+" passengers.");
        }else {
            System.out.println("That is not a valid combination");
        }
    }
}
/*2. Create a class called CrewAndPassanger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
*/