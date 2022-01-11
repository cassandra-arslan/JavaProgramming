package day10_MoreIfStatements;
import java.util.Scanner;
public class TernariesWithNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        String result ="";
        result = (score>=0&&score<=100)?(score>=60)?"Passed":"Failed":"Invalid Score";
        System.out.println(result);
        scan.close();
    }
    }
