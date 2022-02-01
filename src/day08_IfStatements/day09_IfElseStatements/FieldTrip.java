package day08_IfStatements.day09_IfElseStatements;
import java.util.Scanner;
public class FieldTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gradeNumber = scan.nextInt();
        String location = "";
        int numberOfGroups = 0;
        String teacher = "";
        if (gradeNumber > 0 && gradeNumber <= 6) {
            if (gradeNumber == 1) {
                numberOfGroups = 3;
                location = "Apple Orchard";
                teacher = "Ms. Smith";
            } else if (gradeNumber == 2) {
                numberOfGroups = 7;
                location = "Zoo";
                teacher = "Mr. Lee";
            } else if (gradeNumber == 3) {
                numberOfGroups = 5;
                location = "Aquarium";
                teacher = "Ms. Wilson";
            } else if (gradeNumber == 4) {
                numberOfGroups = 2;
                location = "Movie Theater";
                teacher = "Ms. Reyes";
            } else if (gradeNumber == 5) {
                numberOfGroups = 4;
                location = "Museum";
                teacher = "Ms. Lela";
            } else {
                numberOfGroups = 8;
                location = "Six Flags";
                teacher = "Mr. Watt";
            }
        } else {
            System.out.println("That grade is not participating in a field trip");
        }
        System.out.println("That student is going to the "+location+" with "+numberOfGroups+" other groups and they will be supervised by "+teacher+".");
        scan.close();
    }
}
/*8. Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your grade. Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information at the end.
    Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith
        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee
        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson
        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes
        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela
        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt*/
