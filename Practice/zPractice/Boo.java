package zPractice;
import java.util.Scanner;
public class Boo {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = scan.nextLine().toLowerCase();

        String result = "";
        while ( !(answer.equals("yes") || (answer.equals("no")))) {
            System.err.println("Invalid result!\n\nPlease re-enter");
            System.err.println("Will you married me? yes or no");
            result = scan.nextLine();
        }
        scan.close();
    }
}
