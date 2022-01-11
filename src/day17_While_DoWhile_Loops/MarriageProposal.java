package day17_While_DoWhile_Loops;
import java.util.Scanner;
public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer= scan.next().toLowerCase();

        while(!(answer.contains("yes")||answer.contains("no")||answer.equals("y")||answer.equals("n"))){
            System.err.println("Invalid entry, please re enter");
            answer= scan.next().toLowerCase();
        }
            if (answer.contains("yes")||answer.equals("y")){
                System.out.println("Congratulations!!!");
            }else{
                System.err.println("Gosh, that's embarrassing!");
            }
            scan.close();
    }
}
/*Task:
    1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no*/