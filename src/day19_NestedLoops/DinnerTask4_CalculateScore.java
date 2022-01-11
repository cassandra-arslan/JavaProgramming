package day19_NestedLoops;
import java.util.Scanner;
public class DinnerTask4_CalculateScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your score");
            char grade = 'A';
            int score = scan.nextInt();
            while ((score<0||score>100)) {
                System.err.println("Invalid entry");
                System.exit(0);
            }
            if (score>=90){
                grade = 'A';
            }else if (score>=80&&score<90){
                grade = 'B';
            }else if (score>=70&&score<80){
                grade = 'C';
            }else if (score>=60&&score<70){
                grade = 'D';
            }else{
                grade = 'F';
            }
            System.out.println("Score: "+score+"\nGrade: "+grade);
            System.out.println("Would you like to continue?");
            char a = scan.next().charAt(0);
            while (!(a=='n'||a=='N'||a=='y'||a=='Y')){
                System.err.println("Invalid entry, have a good day");
                System.exit(0);

            }
            if (a=='n'||a=='N'){
                System.out.println("Thank you for using Cydeo Grade Calculator. Have a good day!");
                break;
            }
        }

    }
}
/*4. Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"*/