package day10_MoreIfStatements;
import java.util.Scanner;
public class NestedIfIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        String result = "";
        char grade = charAt(0);


        if (score>=0&&score<=100){
            if (score>=90){
                result = "Excellent!";
                grade = 'A';
            }else if (score >=80){
                result = "Great!";
                grade = 'B';
            }else if (score >=70){
                result = "Good job!";
                grade = 'C';
            }else if (score >=60){
                result = "Passed :)";
                grade = 'D';
            }else{
                result = "Failed :(";
                grade = 'F';
            }
        }else {
            result = "Invalid Score";
        }
        System.out.println("Your score is "+score+". Your grade is "+grade+". "+result);
        scan.close();
    }

    private static char charAt(int i) {
        return 0;
    }
}
