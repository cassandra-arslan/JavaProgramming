package day11_Switch_Scanner;
import java.util.Scanner;
public class AgeGroups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the individual's age");
        int ageGroups = input.nextInt();
        String group;
        if (ageGroups>0&&ageGroups<=115){
            if (ageGroups>0&&ageGroups<13) {
                group = "Minor child";
            }else if (ageGroups>=13&&ageGroups<18){
                group = "Minor Adolescent";
            }else if (ageGroups>=18&&ageGroups<55) {
                group = "Adult";
            }else if (ageGroups>=55&&ageGroups<=99){
                group= "Senior";
            }else{
                group= "Miracle";
            }
            System.out.println("Individual is "+ageGroups+" and belongs to the "+group+" category.");
        }else {
            System.out.println("Individual is likely dead :(");
        }
    }
}
/*4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT*/
