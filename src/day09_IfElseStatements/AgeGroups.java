package day09_IfElseStatements;
import java.util.Scanner;
public class AgeGroups {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter age:");
        int ageGroups = scan.nextInt();
        String broadGroup = "";
        String group = "";

        boolean infant = ageGroups > 0 && ageGroups <= 2;
        boolean toddler = ageGroups > 2 && ageGroups <= 5;

        if (ageGroups > 0 && ageGroups < 18) {
            broadGroup = "Minor";
            if (ageGroups > 0 && ageGroups <= 2) {
                group = "Infant";
            } else if (ageGroups > 2 && ageGroups <= 5) {
                group = "Toddler";
            } else if (ageGroups > 5 && ageGroups <= 9) {
                group = "Child";
            } else if (ageGroups > 9 && ageGroups <= 12) {
                group = "Pre-teen";
            } else {
                group = "Teenager";
            }
        } else if (ageGroups < 0) {
            broadGroup = "Not born yet!";
        } else {
            broadGroup = "Adult";
            if (ageGroups >= 18 && ageGroups <= 20) {
                group = "Young Adult";
            } else if (ageGroups >= 21 && ageGroups <= 39) {
                group = "Adult";
            } else if (ageGroups >= 40 && ageGroups <= 54) {
                group = "Middle-Aged Adult";
            } else if (ageGroups >= 55 && ageGroups <= 64) {
                group = "Young Senior Citizen";
            } else if (ageGroups >= 65 && ageGroups <= 74) {
                group = "Senior Citizen";
            } else if (ageGroups >= 75 && ageGroups <= 84) {
                group = "Elderly Senior";
            } else {
                group = "Very Elderly Senior Citizen";
            }
            System.out.println(ageGroups+" is a(n) "+broadGroup+" and belongs to the "+group+" age group.");
        }
        scan.close();
    }
}
/*5. Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
	                    Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)*/