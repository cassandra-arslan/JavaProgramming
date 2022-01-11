package day12_Scanner;
import java.util.Scanner;
public class gradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your score");
        int score = scan.nextInt();
        char grade = 'A';
        String message = "";

        if (score >0&& score<=100){
            if (score>=90){
                grade = 'A';
                message = "Excellent!";
            }else if (score>=80&&score<90){
                grade = 'B';
                message = "Great job!";
            }else if (score>=70&&score<80){
                grade = 'C';
                message = "Good job.";
            }else if (score >=60&&score<70){
                grade = 'D';
                message = "Passed";
            }else{
                grade = 'F';
                message = "Failed";
            }
        }else{
                System.out.println("Not a valid score");
            }
        System.out.println("A score of "+score+" receives a grade of "+grade+". "+message);
        scan.close();
    }
}
/*2. GradeReport:
            2.1 Ask the user to enter his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score*/